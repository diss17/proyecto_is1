**Caso de Uso UC9:** Generar Reporte 
**Actor Principal:** Central de Recolección 
**Actores involucrados e intereses:**
• Central de Recolección: Necesita reportes operativos. 
• Encargados de Mantenimiento: Necesitan reportes sobre el estado de la flota. 
**Precondiciones:** El usuario ha iniciado sesión en el sistema. 
**Postcondiciones (garantías de éxito):** El sistema genera y muestra un reporte en el formato solicitado. Escenario principal de éxito (Flujo Básico):

1. El usuario selecciona el tipo de reporte a generar.

2. El sistema presenta los filtros disponibles.

3. El usuario confirma la generación del reporte.

4. El sistema recopila los datos y los presenta.

5. Si se detecta un fallo crítico, se ejecuta el caso "Crear alerta de fallos". <<extend>>

Extensiones (Flujos Alternativos): 
4' No hay datos para generar el reporte: El sistema informa al usuario.