package model;

public class PuntoRuta {
    private int orden;
    private String horaEstimada;
    private String estadoVisita;
    private Solicitud solicitud;

    public PuntoRuta(int orden, String horaEstimada, String estadoVisita) {
        this.orden = orden;
        this.horaEstimada = horaEstimada;
        this.estadoVisita = estadoVisita;
    }

    // Getters y setters
    public int getOrden() { return orden; }
    public void setOrden(int orden) { this.orden = orden; }
    public String getHoraEstimada() { return horaEstimada; }
    public void setHoraEstimada(String horaEstimada) { this.horaEstimada = horaEstimada; }
    public String getEstadoVisita() { return estadoVisita; }
    public void setEstadoVisita(String estadoVisita) { this.estadoVisita = estadoVisita; }
    public Solicitud getSolicitud() { return solicitud; }
    public void setSolicitud(Solicitud solicitud) { this.solicitud = solicitud; }
}
