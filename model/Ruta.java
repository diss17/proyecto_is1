package model;

import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ruta {
    private int id;
    private LocalDate fecha;
    private String estado;
    private List<PuntoRuta> puntosRuta;
    private List<Recolector> recolectores;
    private Camion camion;

    public Ruta(int id, LocalDate fecha, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.puntosRutas = new ArrayList<>();
        this.recolectores = new ArrayList<>();
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public List<PuntoRuta> getPuntosRuta() { return puntosRuta; }
    public void setPuntosRuta(List<PuntoRuta> puntosRuta) { this.puntosRuta = puntosRuta; }
    public List<Recolector> getRecolectores() { return recolectores; }
    public void setRecolectores(List<Recolector> recolectores) { this.recolectores = recolectores; }
    public Camion getCamion() { return camion; }
    public void setCamion(Camion camion) { this.camion = camion; }
}
