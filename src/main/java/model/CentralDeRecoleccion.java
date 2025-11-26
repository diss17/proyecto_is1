package model;
import java.util.ArrayList;
import java.util.List;

public class CentralDeRecoleccion {
    private int id;
    private String nombre;
    private List<Reporte> reportes;
    private List<Ruta> rutas;

    public CentralDeRecoleccion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.reportes = new ArrayList<>();
        this.rutas = new ArrayList<>();
    }

    public void generarReporte(String tipo, String filtros) {}

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Reporte> getReportes() { return reportes; }
    public void setReportes(List<Reporte> reportes) { this.reportes = reportes; }
    public List<Ruta> getRutas() { return rutas; }
    public void setRutas(List<Ruta> rutas) { this.rutas = rutas; }
}
