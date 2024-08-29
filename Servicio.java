import java.util.Date;

public class Servicio {
    private String idServicio;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;

    public Servicio(String idServicio, String descripcion, Date fechaInicio, Date fechaFin) {
        this.idServicio = idServicio;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }
}
