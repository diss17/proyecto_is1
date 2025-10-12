Trazabilidad
En el UC1: Generar solicitud, el Hogar crea la solicitud indicando tipo de material, cantidad y horario.
Este caso tiene incluido a UC2: Verificar ubicación, en donde el sistema toma la dirección, obtiene las coordenadas (lat, lng ) y asigna la zona de cobertura.
Con esos datos, la solicitud se guarda con estado = “pendiente” y se avisa a la Central para su gestión. 
En el DSS lo anterior se ve como: 
	(1) Hogar → Sistema: crear/enviar solicitud.
	(2) Sistema → Servicio de geolocalización: geocodificar y validar cobertura.
	(3) Sistema: guardar la solicitud con coordenadas, zona y estado.
	(4) Sistema → Central: notificar nueva solicitud.

Al pasar esto al esquema conceptual, se reflejan las relaciones:
•	Hogar 1—0..* Solicitud. (Un hogar puede tener varias solicitudes)
•	Solicitud 1—1 Coordenada (Cada solicitud asociada a unas únicas coordenadas)
•	Solicitud 1—1 ZonaCobertura. (Cada solicitud se agrupa a una única zona de cobertura)
•	La CentralDeRecoleccion agrupa solicitudes en Rutas, modelado con:
	o	Ruta 1—1..* PuntoRuta. (Cada ruta tiene 1 o más puntos donde se recogerá el material)
	o	PuntoRuta 1—1 Solicitud (cada PuntoRuta corresponde a una solicitud, con ello cada solicitud queda asociada a una única ruta a través de su único PuntoRuta)
•	Ruta 1..* — 0..* Recolector (Una ruta tiene 1 o más recolectores y un recolector puede estar en 0 o muchas rutas, dependiendo del día);
•	Al finalizar el retiro, se emite Comprobante vinculado a la Solicitud (Solicitud 1—0..1 Comprobante).
