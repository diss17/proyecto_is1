package model;

import java.util.ArrayList;
import java.util.List;

public class Hogar {
    private int id;
    private String nombreContacto;
    private String direccionTexto;
    private boolean permisosGPS;
    private List<Solicitud> solicitudes;

    public Hogar(int id, String nombreContacto, String direccionTexto, boolean permisosGPS) {
        this.id = id;
        this.nombreContacto = nombreContacto;
        this.direccionTexto = direccionTexto;
        this.permisosGPS = permisosGPS;
        this.solicitudes = New ArrayList<>();
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombreContacto() { return nombreContacto; }
    public void setNombreContacto(String nombreContacto) { this.nombreContacto = nombreContacto; }
    public String getDireccionTexto() { return direccionTexto; }
    public void setDireccionTexto(String direccionTexto) { this.direccionTexto = direccionTexto; }
    public boolean isPermisosGPS() { return permisosGPS; }
    public void setPermisosGPS(boolean permisosGPS) { this.permisosGPS = permisosGPS; }
    public List<Solicitud> getSolicitudes() { return solicitudes; }
    public void setSolicitudes(List<Solicitud> solicitudes) { this.solicitudes = solicitudes; }
}
