# Trazabilidad 

En el **UC1: Generar solicitud**, el **Hogar** crea la solicitud indicando tipo de material, cantidad y horario.  
Este caso **incluye** al **UC2: Verificar ubicación**, en donde el sistema toma la dirección, obtiene las **coordenadas (lat, lng)** y asigna la **zona de cobertura**.  
Con esos datos, la solicitud se guarda con **estado = “Pendiente”** y se **avisa a la Central** para su gestión.

**DSS (resumen):**
1) *Hogar → Sistema*: crear/enviar solicitud.  
2) *Sistema → Servicio de geolocalización*: **geocodificar** y validar cobertura.  
3) *Sistema*: guardar la solicitud con coordenadas, zona y estado.  
4) *Sistema → Central*: notificar nueva solicitud.

**Esquema conceptual (relaciones clave):**
- **Hogar 1—0..*** **Solicitud** (un hogar puede tener varias solicitudes).  
- **Solicitud 1—1** **Coordenada** (cada solicitud se asocia a **un único par de coordenadas**).  
- **Solicitud 1—1** **ZonaCobertura** (cada solicitud se agrupa en una única zona de cobertura).  
- La **Central de Recolección** agrupa solicitudes en **Rutas**, modelado con:  
  - **Ruta 1—1..*** **PuntoRuta** (cada ruta tiene 1 o más puntos donde se recogerá el material).  
  - **PuntoRuta 0..1—1** **Solicitud** (una **Solicitud** puede no estar asociada todavía a un **PuntoRuta**; cada **PuntoRuta** corresponde exactamente a **1 Solicitud**).  
- **Ruta 1..* — 0..*** **Recolector** (una ruta tiene 1 o más recolectores y un recolector puede estar en 0 o muchas rutas, dependiendo del día).  
- Al finalizar el retiro, se emite **Comprobante** vinculado a la **Solicitud** (**Solicitud 1—0..1 Comprobante**).  
- **Central de Recolección 1—0..*** **Ruta** (la Central está encargada de publicar y controlar múltiples rutas).  
- **Ruta 0..1—1** **Camión** (una ruta puede no tener camión todavía, pero al ejecutarla **debe tener 1**; además, cada ruta tiene un **único** camión asociado).  
- **Camión 1—0..*** **Ruta** (un camión puede ejecutar varias rutas en fechas y/o turnos distintos).  
- **Central de Recolección 1—0..*** **Reporte** (la Central puede generar reportes operativos que sirven para detectar posibles errores en las diferentes partes del proceso de recolección).  
- **Reporte 1—0..*** **Alerta** (un reporte puede derivar en varias alertas).

## Párrafo de trazabilidad 

En el caso de uso **UC1: Generar Solicitud** su DSS muestra mensajes claros entre el actor *Hogar* y el *Sistema* (p. ej. "crear/enviar solicitud", "geocodificar", "notificar a la Central"). Cada uno de esos mensajes se mapea directamente a elementos del esquema conceptual: el mensaje "crear/enviar solicitud" corresponde a la creación o actualización de una instancia de la clase **Solicitud** (con atributos como tipoMaterial, cantidad, fecha/hora, estado); la operación "geocodificar" produce o actualiza una instancia de **Coordenada** (lat, lng) que se asocia a la **Solicitud**; la asignación de cobertura corresponde a la asociación con **ZonaCobertura**; y la notificación implica la participación de **CentralDeRecoleccion** (que luego puede agrupar solicitudes en **Ruta** y **PuntoRuta**). En conjunto, el DSS describe el flujo dinámico de mensajes y el esquema conceptual muestra las clases y relaciones que almacenan y mantienen el estado creado por esos mensajes.