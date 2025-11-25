package model;

import java.util.ArrayList;
import java.util.List;

public class Recolector {
    private int id;
    private String nombre;
    private List<Ruta> rutas;

    public Recolector(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.rutas = new ArrayList<>();
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Ruta> getRutas() { return rutas; }
    public void setRutas(List<Ruta> rutas) { this.rutas = rutas; }
}
