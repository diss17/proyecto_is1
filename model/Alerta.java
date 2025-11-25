package model;

public class Alerta {
    private int id;
    private String tipo;
    private String detalle;

    public Alerta(int id, String tipo, String detalle) {
        this.id = id;
        this.tipo = tipo;
        this.detalle = detalle;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getDetalle() { return detalle; }
    public void setDetalle(String detalle) { this.detalle = detalle; }
}
