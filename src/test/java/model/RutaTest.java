package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class RutaTest {

    @Test
    void constructorInitializesCollections() {
        Ruta ruta = new Ruta(1, LocalDate.of(2024, 1, 1), "planificada");

        assertEquals(1, ruta.getId());
        assertEquals(LocalDate.of(2024, 1, 1), ruta.getFecha());
        assertEquals("planificada", ruta.getEstado());
        assertNotNull(ruta.getPuntosRuta(), "La lista de puntos debe inicializarse vacía");
        assertEquals(0, ruta.getPuntosRuta().size());
        assertNotNull(ruta.getRecolectores(), "La lista de recolectores debe inicializarse vacía");
        assertEquals(0, ruta.getRecolectores().size());
    }
}
