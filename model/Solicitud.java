package model;

import java.time.LocalDateTime;

public class Solicitud {
    private int id;
    private LocalDateTime fechaHora;
    private String tipoMaterial;
    private int cantidad;
    private String estado;
    private Hogar hogar;
    private Coordenada coordenada;
    private ZonaCobertura zonaCobertura;
    private CentralDeRecoleccion central;
    private Comprobante comprobante;

    public Solicitud(int id, LocalDateTime fechaHora, String tipoMaterial, int cantidad, String estado) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.tipoMaterial = tipoMaterial;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public void notificarNuevaSolicitud() {}

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }
    public String getTipoMaterial() { return tipoMaterial; }
    public void setTipoMaterial(String tipoMaterial) { this.tipoMaterial = tipoMaterial; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Hogar getHogar() { return hogar; }
    public void setHogar(Hogar hogar) { this.hogar = hogar; }
    public Coordenada getCoordenada() { return coordenada; }
    public void setCoordenada(Coordenada coordenada) { this.coordenada = coordenada; }
    public ZonaCobertura getZonaCobertura() { return zonaCobertura; }
    public void setZonaCobertura(ZonaCobertura zonaCobertura) { this.zonaCobertura = zonaCobertura; }
    public CentralDeRecoleccion getCentral() { return central; }
    public void setCentral(CentralDeRecoleccion central) { this.central = central; }
    public Comprobante getComprobante() { return comprobante; }
    public void setComprobante(Comprobante comprobante) { this.comprobante = comprobante; }
}
