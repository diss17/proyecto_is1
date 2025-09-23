**Caso de Uso UC2:** Verificar ubicacion
**Actor Principal:** Hogar
**Actores involucrados e intereses:**
• `Sistema de geolocalizacion`: Recopilar coordenadas del hogar para ser asignadas a la solicitud

**Precondiciones:** Inicio de proceso de solicitud
**Postcondiciones (garantías de éxito)**: Recolecta coordenadas y asigna a la solicitud, junto a su zona de cobertura
Escenario principal de éxito (Flujo Básico):

1. Se genera solicitud
2. `Sistema de Geolocalizacion` captura direccion y coordenadas del `Hogar`
3. Guarda solicitud, asigna coordenadas, zona de cobertura y la marca como "pendiente"
