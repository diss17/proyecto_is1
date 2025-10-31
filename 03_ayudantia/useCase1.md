**Caso de Uso UC1:**Generar Solicitud 

**Actor Principal:** Hogar 

**Actores involucrados e intereses:** 

• Hogar: Quiere que su material de reciclaje sea recolectado de forma fácil y rápida. 

• Gestor de Geolocalización (externo): Entrega coordenadas del dispositivo cuando el sistema las solicita.

• Central de Recolección: Necesita recibir y gestionar las solicitudes para planificar las rutas. 

**Precondiciones**: 

El usuario del Hogar ha iniciado sesión en la aplicación móvil.

Permisos de ubicación activos o dirección manual disponible (para el alternativo 3').

**Postcondiciones (garantías de éxito)**:

Se crea una nueva solicitud de recolección en el sistema, asociada a la cuenta y ubicación del Hogar, quedando en estado "Pendiente de asignación". 

**Escenario principal de éxito (Flujo Básico):**

1. El Hogar selecciona la opción para crear una nueva solicitud.

2. El Hogar especifica el tipo de material y una cantidad estimada.

3. El sistema invoca el caso de uso UC2 "Verificar Ubicación". <<include>>

4. El Hogar confirma los datos y envía la solicitud.

5. El sistema registra la solicitud y notifica al Hogar.

**Extensiones (Flujos Alternativos):** 

3' El servicio de geolocalización no está disponible:El sistema pide al Hogar que ingrese su dirección manualmente.

4' El Hogar cancela la operación: El caso de uso finaliza sin crear la solicitud.