### 3. Requerimientos del sistema

## 3.1. Requerimientos funcionales

**RF1.** El sistema debe permitir el ingreso de solicitudes por parte de los hogares para el retiro de materiales reciclables.

**RF2.** El sistema debe validar automáticamente la ubicación geográfica del solicitante.

**RF3.** El sistema debe agrupar las solicitudes por zonas geográficas para generar rutas óptimas.

**RF4.** El sistema debe permitir que los trabajadores y la central de recolección visualicen en tiempo real
los puntos y rutas activas.

**RF5.** El sistema debe permitir a los hogares hacer seguimiento del camión de recolección (posición o tiempo
estimado).

**RF6.** La central de recolección debe poder modificar rutas y monitorear el estado de los vehículos.

**RF7.** El sistema debe emitir comprobantes digitales por cada retiro realizado.

**RF8.** El sistema debe registrar distintos tipos de usuarios (hogar, reciclador, coordinador, administrador)
con sus respectivos permisos.

**RF9.** El usuario debe poder revisar el historial de solicitudes y cancelarlas antes de su planificación.

### 3.2. Requerimientos no funcionales

**Seguridad**

Los usuarios no deben poder modificar las rutas una vez generadas.

Los datos personales deben mantenerse protegidos mediante autenticación y cifrado.

Los camiones deben seguir la ruta asignada; en caso de inconvenientes, el chofer puede notificar al
sistema para recalcular. El 100 % de los desvíos deben registrarse en menos de 1 minuto desde el
evento.

**Eficiencia**

El tiempo de respuesta para operaciones críticas (crear solicitud, consultar rutas) debe ser inferior
a 3 segundos en condiciones normales.

**Usabilidad**

La interfaz debe ser intuitiva, accesible y adaptada a distintos dispositivos.

**Fiabilidad**

La aplicación debe funcionar de forma estable durante la jornada laboral, con una disponibilidad
mayor o igual al 99.5 % durante el horario operativo.

Los recicladores deben poder registrar información sin conexión, sincronizando los datos al recuperar
la señal. La sincronización automática debe completarse dentro de los 2 minutos posteriores a la
reconexión.
