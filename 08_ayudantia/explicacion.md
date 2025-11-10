En el diagrama de comunicacion utilizamos las siguientes clases del modelo conceptual:

- `:Hogar`
- `:Sistema`
- `:solicitud:Solicitud`
- `:Coordenada`
- `:ZonaCobertura`
- `:ServicioGeolocalizacion`
- `:CentralDeRecoleccion`

Los enlaces **Solicitud–Coordenada** y **Solicitud–ZonaCobertura** salen de asociaciones de nuestro modelo conceptual siendo estas (1..1). 
El resto de lineas nos ayuda para mostrar la conversion de :Sistema, :Hogar, y :ServicioGeolocalizacion.

Los mensajes cumplen las postcondiciones del contrato:
- **2** obtiene la ubicacion (lat,lng).
- **3** crea `Solicitud` (estado = "Pendiente").
- **4** crea `Coordenada` con (lat,lng).
- **5** y **7** realizan las asociaciones **Solicitud–Coordenada** y **Solicitud–ZonaCobertura**
- **6** determina la zona desde las coordenadas 
- **8** notifica a la `CentralDeRecoleccion`  
- **9** confirma al `Hogar`

El mensaje **2** obtiene la ubicación; si falla, se usa el alternativo (**2.1**, **2.2**, **2.3**).
- **2.1** solicitar dirección manual → **2.2**  ingresar dirección **2.3** → geocodificar.

Si devuelve (lat,lng), continua en 4 (crear Coordenada). Si no, marcar en la solicitud que fue “dirección manual”.

