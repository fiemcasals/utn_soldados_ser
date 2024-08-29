import java.util.ArrayList;
import java.util.List;

public class Soldado extends Persona {
    private String grado;
    private CuerpoDeEjercito cuerpo;
    private Compania compania;
    private Cuartel cuartel;
    private List<Servicio> serviciosRealizados;
    private Servicio servicioEnEjecucion;

    public Soldado(String nombre, String apellido, int id, String grado, CuerpoDeEjercito cuerpo, Compania compania) {
        super(nombre, apellido, id);
        this.grado = grado;
        this.cuerpo = cuerpo;
        this.compania = compania;
        this.serviciosRealizados = new ArrayList<>();
    }

    public String getGrado() {
        return grado;
    }

    public CuerpoDeEjercito getCuerpo() {
        return cuerpo;
    }

    public Compania getCompania() {
        return compania;
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }

    public Servicio getServicioEnEjecucion() {
        return servicioEnEjecucion;
    }

    public void asignarServicio(Servicio servicio) {
        this.servicioEnEjecucion = servicio;
        serviciosRealizados.add(servicio);
    }

    public List<Servicio> getServiciosRealizados() {
        return serviciosRealizados;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("ID: " + getId());
        System.out.println("Grado: " + grado);
        System.out.println("Cuerpo: " + cuerpo.getDenominacion());
        System.out.println("Compañía: " + compania.getActividadPrincipal());
        System.out.println("Cuartel: " + (cuartel != null ? cuartel.getNombreCuartel() : "Sin asignar"));
        System.out.println("Servicio en Ejecución: " + (servicioEnEjecucion != null ? servicioEnEjecucion.getDescripcion() : "Sin asignar"));
    }
}
