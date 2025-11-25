package model;

import java.time.LocalDateTime;

public class Comprobante {
    private int id;
    private LocalDateTime fecha;
    private String medioEntrega;

    public Comprobante(int id, LocalDateTime fecha, String medioEntrega) {
        this.id = id;
        this.fecha = fecha;
        this.medioEntrega = medioEntrega;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
    public String getMedioEntrega() { return medioEntrega; }
    public void setMedioEntrega(String medioEntrega) { this.medioEntrega = medioEntrega; }
}
