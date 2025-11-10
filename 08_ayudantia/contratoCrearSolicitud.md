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