Requisitos Funcionales

-Gestión de usuarios y roles:
	* El sistema debe permitir registrar e inciiar sesión a: Hogar (solicitante), Reciclador, Coordinador y Administrador.
	* Cada rol debe acceseder solo a sus vistar y acciones (control de permisos).

-Solicitudes de retiro (Hogar):
	* El hogar debe poder crear una solicitud indicando: dirección, comuna, materiales y fecha preferida
	* El hogar debe poder consultar el estado de sus solicitudes y ver su historial.
	*El hogar debe poder cancelar una solicitud antes de su planificación.

-Validación geofráfica:
	*El sistema debe validar automáticamente si la dirección ingresada está dentro de una zona atendida (aceptar/rechazar con mensaje claro y entendible).

-Zonas y catálogos (Admin/Coordinador):
	*Se deben gestionar zonas de servicio (activar/desactivar).
	*Se debe mantener una catálogo de materiales reciclables (para registrar tipos y cantidades).

-Planificación y rutas (Coordinador):
	*El sistema debe agrupar solicitudes por zona y fecha para componer rutas eficientes.
	*El coordinador debe poder revisar y publicar rutas por día (con orden sugerido por el sistema).
	*El coordinador debe poder re-asignar paradas o hacer cualquier cambio según lo vea necesario.

-Ejecución en terreno (Reciclador):
	*El reciclador debe ver sus rutas asignadas del día en un mapa y lista de paradas.
	*En cada parada, el reciclador debe registrar el resultado: exitoso, ausente, rechazado, además de las cantidades por material.
	*El sistema debe permitir adjuntar evidencia (foto/firma) por parada.

-Comprobantes y notificaciones:
	*Tras un retiro exitoso, el sistema debe emitir un comprobante digital para el hogar (código único/algún tipo de archivo .pdf)
	*El sistema debe notificar al hogar eventos clave: solicitud creada, ruta publicada, retiro realizado.

-Reportes y métricas (Admin/Coordinador):
	*Debe existir un tablero con métricas operacionales: Porcentaje de retiros completados, tiempos, km estimados, materiales por tipo y zona.
	*El sistema debe poder exportar datos (CSV) para análisis.

-Auditoría y seguridad:
	*El sistema debe registrar logs de acciones críticas (creación/edición de zonas, publicaciṕn de rutas, resultados de paradas).
	*El sistema debe gestionar sesiones y expiración de tokens.

Requisitos No Funcionales:

-Usabilidad y accesibilidad: 
	*Interfaz simple y consistente, términos claros para hogares no técnicos.
	*Aplicación usable tanto en móvil (reciclador), como escritorio (coordinador/admin).
	*Buen contraste y tamaños legibles, soporte a lector de pantalla básico.

-Rendimiento:
	*Tiempo de respuesta en vistas críticas menor a 5 segundos de con carga típica.
	*Publicación de rutas (operación batch) menor a 30 segundos para 300 solicitudes por día (aprox).
	*Carga inicial de la app móvil del reciclador menor a 3 segundos en red 4g promedio.

-Confiabilidad y disponibilidad:
	*Disponibilidad del objetivo mayor al 99% en horario laboral.
	*opéración offline-first en la app del reciclador (sincronización en cuanto vuelve la señal).
	*Reintentos automáticos y cola local para subir resultados.

-Seguridad y privacidad:
	*Autenticación con tokens y autorización por roles.
	*Tráfico encriptado (HTTPS), contraseñas con hash seguro.
	*Minimización de datos personales, el sistema almacena solo lo estrictamente necesario (dirección,contacto) y políticas de retención.

 -Escalabilidad y mantenibilidad:
 	*Arquitectura modular (base de datos) y separación por capas.
 	*La base debe soportar crecimiento a x10 solicitudes sin rediseño mayor (índices y particiones donde corresponda).
 	*Pruebas automáticas básicas (unidad/integración).

 -Compatibilidad:
 	*Navegadores modernos , Android en su versión más reciente, IOS, etc.
 	*Geocodificación mediante servicio estándar intercambiable.
 	*Exportación CSV típica.
-Observabilidad:
	*Monitoreo de API (métricas: latencia, tasa de error) y logs centralizados.
	*Alertas básicas ante caídas o bajo rendimiento.

	