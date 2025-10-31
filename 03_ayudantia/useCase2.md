**Caso de Uso UC2:** Verificar Ubicación (Include) 

**Actor Principal:** 

N/A (invocado por UC1 mediante «include»)

**Actores involucrados e intereses:**

• Gestor de Geolocalización (externo): Responde con latitud/longitud del dispositivo cuando el sistema las solicita.

**Precondiciones:** 

La app tiene permisos de ubicación y el servicio está activado. (Invocado durante UC1). 

**Postcondiciones (garantías de éxito):**

 El sistema obtiene las coordenadas geográficas actuales del dispositivo. 
 
**Escenario principal de éxito (Flujo Básico):**

1. Un caso de uso (UC1) requiere la ubicación del usuario.

2. El sistema solicita al servicio de geolocalización del dispositivo las coordenadas.

3. El servicio responde con la latitud y longitud.

4. El sistema valida y devuelve las coordenadas al caso de uso que lo llamó (UC1).

**Extensiones (Flujos Alternativos):**

2' Los servicios de ubicación están desactivados: El sistema pide al usuario que los active.

2'' La app no tiene permisos:El sistema pide al usuario que los otorgue.