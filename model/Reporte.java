package model;

public class Reporte {
    private int id;
    private String tipo;
    private String periodo;
    private String contenido;
    private Alerta alerta;

    public Reporte(int id, String tipo, String periodo, String contenido) {
        this.id = id;
        this.tipo = tipo;
        this.periodo = periodo;
        this.contenido = contenido;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }
    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }
    public Alerta getAlerta() { return alerta; }
    public void setAlerta(Alerta alerta) { this.alerta = alerta; }
}
