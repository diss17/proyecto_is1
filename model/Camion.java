package model;

import java.util.List;

public class Camion {
    private int id;
    private String patente;
    private int capacidad;
    private List<Ruta> rutas;

    public Camion(int id, String patente, int capacidad) {
        this.id = id;
        this.patente = patente;
        this.capacidad = capacidad;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    public List<Ruta> getRutas() { return rutas; }
    public void setRutas(List<Ruta> rutas) { this.rutas = rutas; }
}
