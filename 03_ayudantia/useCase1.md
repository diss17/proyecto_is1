**Caso de Uso UC1:** Generar solicitud
**Actor Principal:** Hogar
**Actores involucrados e intereses:**
• `Control de recoleccion`: recibir solicitudes validas y generar rutas.
• `Conductor de camion`: recibe ruta de la central de recoleccion.
**Precondiciones:** Hogar autenticado, app operativa.
**Postcondiciones (garantías de éxito)**: Solicitud registrada con direccion/geolocalizacion y recolectada.
Escenario principal de éxito (Flujo Básico):

1. El hogar abre "Nueva solcitud"
2. Ingresa datos de retiro (horario, tipo de material, cantidad)
3. Se ejecuta `UC2`
4. Se notifica a `Central de recoleccion` para gestion

Extensiones (Flujos Alternativos):
- 