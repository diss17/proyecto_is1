## Contratos de operaciones (DSS) — Ayudantía 06

Documento ordenado con contratos (pre/postcondiciones) para 3 operaciones seleccionadas desde los DSS (UC1–UC3). Cada contrato está en formato tabular y contiene: firma, actor, precondiciones, postcondiciones (creaciones / modificaciones / asociaciones), mapeo al esquema conceptual y notas de verificación.

Operaciones seleccionadas (actor → sistema):

- `crearSolicitud(hogarId, tipoMaterial, cantidad, ventanaHorario)` — Hogar (UC1)
- `ingresarDireccionManual(hogarId, direccionTexto)` — Hogar (UC1/UC2, alternativa)
- `generarReporte(centralId, tipoReporte, filtros)` — Central de Recolección (UC3)

---

### 1) crearSolicitud(hogarId, tipoMaterial, cantidad, ventanaHorario)

Firma: `crearSolicitud(hogarId, tipoMaterial, cantidad, ventanaHorario)`

Actor: Hogar

Resumen: El Hogar solicita la creación de una nueva solicitud. El sistema intentará obtener coordenadas (UC2), asignar zona y notificar a la Central.

Precondiciones:
1. Existe una instancia `Hogar` con `id = hogarId` y sesión/autenticación válida.
2. `tipoMaterial` y `cantidad` cumplen las validaciones de dominio (no nulos, formato y rangos).
3. Servicio de persistencia (BD) accesible.

Postcondiciones (creaciones / modificaciones / asociaciones):
- Creaciones:
  - `Solicitud` (nueva): atributos mínimos `tipoMaterial`, `cantidad`, `fechaHora`, `estado = "Pendiente"`.
- Modificaciones / Asociaciones:
  - Si UC2 retorna coordenadas válidas: crear/actualizar `Coordenada` y asociar `Solicitud` → `Coordenada` (1—1).
  - Asignar `Solicitud` → `ZonaCobertura` si corresponde.
  - Emitir/loggear `notificarNuevaSolicitud()` hacia `CentralDeRecoleccion` (mensaje lógico).

Mapeo al esquema conceptual (verificable):
| Elemento del contrato | Clase/Relación en el modelo |
|---|---|
| Solicitud (creada) | `Solicitud` |
| Coordenada (creada/actualizada) | `Coordenada` |
| Zona asignada | `ZonaCobertura` |
| Relación Hogar—Solicitud | `Hogar 1 -- 0..* Solicitud` |

Notas / restricciones:
- Si la geolocalización falla por permisos/servicios, ejecutar `ingresarDireccionManual` (flujo alternativo).
- Latencia objetivo: operación < 3s (RNF1) en condiciones normales.

---

### 2) ingresarDireccionManual(hogarId, direccionTexto)

Firma: `ingresarDireccionManual(hogarId, direccionTexto)`

Actor: Hogar

Resumen: El Hogar proporciona una dirección manual cuando la geolocalización automática no está disponible o falla. El sistema intenta geocodificar y actualizar la solicitud en curso.

Precondiciones:
1. Existe `Hogar(id = hogarId)`.
2. Existe una `Solicitud` en proceso que requiere ubicación (estado `pendiente_coordenadas` o similar) o la operación forma parte del flujo de creación antes de confirmar.

Postcondiciones (creaciones / modificaciones / asociaciones):
- Creaciones:
  - (Opcional) `Coordenada` si la geocodificación devuelve lat/lng.
- Modificaciones / Asociaciones:
  - Asociar la `Coordenada` a la `Solicitud` y asignar `ZonaCobertura` si aplica.
  - Si no se logra geocodificar, marcar `Solicitud.origenUbicacion = "direccion_manual"` y registrar motivo en auditoría.

Mapeo al esquema conceptual:
| Elemento del contrato | Clase/Relación |
|---|---|
| Coordenada (creada) | `Coordenada` |
| Asociación Solicitud–Coordenada | `Solicitud 1 -- 1 Coordenada` |
| Indicador origen (direccion_manual) | atributo en `Solicitud` (o log de auditoría) |

Notas / restricciones:
- Si la dirección produce resultados ambiguos, solicitar confirmación adicional al usuario.

---

### 3) generarReporte(centralId, tipoReporte, filtros)

Firma: `generarReporte(centralId, tipoReporte, filtros)`

Actor: Central de Recolección

Resumen: La Central solicita un reporte aplicando filtros. El sistema agrega datos desde `Solicitud`, `Ruta`, `PuntoRuta`, etc., y devuelve una representación (vista/exportación).

Precondiciones:
1. Existe `CentralDeRecoleccion(id = centralId)` con permisos para generar reportes.
2. Es posible acceder a las colecciones/tablas de `Solicitud`, `Ruta`, `PuntoRuta`, `Camion`, `Recolector`.

Postcondiciones (creaciones / modificaciones / asociaciones):
- Creaciones:
  - `Reporte` (persistente o temporal) con `id`, `tipo`, `periodo`, `contenido`.
  - (Opcional) `Alerta` asociada si se detectan anomalías críticas.
- Modificaciones:
  - No se modifican `Solicitud` por el mero hecho de generar el reporte; se registran auditorías si aplica.

Mapeo al esquema conceptual:
| Elemento del contrato | Clase/Relación |
|---|---|
| Reporte (creado) | `Reporte` |
| Alerta (opcional) | `Alerta` |
| Datos fuente | `Solicitud`, `Ruta`, `PuntoRuta`, `Camion`, `Recolector` |

Notas / restricciones:
- Política: si no hay datos, definir si se crea `Reporte` vacío o se retorna mensaje "No hay datos" sin persistir.
- Consultas costosas pueden requerir procesamiento asíncrono para cumplir RNF1.