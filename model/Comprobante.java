package model;

public class Comprobante {
    private int id;
    private String fecha;
    private String medioEntrega;

    public Comprobante(int id, String fecha, String medioEntrega) {
        this.id = id;
        this.fecha = fecha;
        this.medioEntrega = medioEntrega;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getMedioEntrega() { return medioEntrega; }
    public void setMedioEntrega(String medioEntrega) { this.medioEntrega = medioEntrega; }
}
