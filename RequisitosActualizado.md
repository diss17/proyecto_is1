### Requisitos funcionales
El sistema debe permitir el ingreso de solicitudes por parte de los usuarios para el retiro de sus productos reciclables. Debe contar con un sistema de agrupamiento por zonas geográficas, de manera que se genere una ruta dinámica que optimice la cantidad de puntos de recolección.
El sistema debe permitir que tanto los trabajadores como la central de recolección puedan visualizar los puntos donde se solicita la recolección en tiempo real, así como la ruta más óptima en función de la demanda, considerando que por horarios puede haber pocos o ningún punto de recolección.
El sistema debe permitir que el usuario (quien crea la solicitud) pueda ver o hacer seguimiento al camión de recolección, ya sea de manera gráfica o con un tiempo estimado, para saber si el camión ya pasó por su hogar o si vendrá más tarde en el día.
De manera similar, el sistema tendrá otra interfaz para la central de recolección, donde podrán ver el seguimiento del camión para realizar posibles modificaciones de ruta y tener un control más claro de sus trabajadores.
Debe ser posible emitir comprobantes digitales (correo/QR) por cada retiro realizado.
El sistema debe permitir registrar diferentes tipos de usuarios (hogar, reciclador, coordinador, administrador), cada uno con acceso solo a sus funciones.
El usuario debe poder revisar el historial de solicitudes y cancelarlas antes de su planificación.

### Requisitos no funcionales
#### Seguridad
El usuario no debe poder modificar las rutas una vez solicitado el retiro, ya que esto es decisión exclusiva de la central.
Los camiones solo deben seguir la ruta creada por el software; en caso de inconvenientes, el chofer puede notificar para trazar una nueva ruta.
Los datos de los usuarios deben estar protegidos para evitar cualquier tipo de vulnerabilidad.

#### Eficiencia 
El tiempo de respuesta para operaciones principales (crear solicitud, consultar rutas) debe ser breve, menor a unos segundos en condiciones normales.

#### Usabilidad
La interfaz debe ser intuitiva y fácil de usar para todos los usuarios.

#### Fiabilidad
La aplicación debe funcionar de manera estable en horario laboral y permitir que los recicladores registren información aun sin conexión, sincronizando los datos al recuperar señal.


