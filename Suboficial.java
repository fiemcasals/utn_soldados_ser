public class Suboficial extends Persona {
    public Suboficial(String nombre, String apellido, int id) {
        super(nombre, apellido, id);
    }

    public void asignarServicio(Soldado soldado, Servicio servicio) {
        soldado.asignarServicio(servicio);
    }

    public void asignarCuartel(Soldado soldado, Cuartel cuartel) {
        soldado.setCuartel(cuartel);
    }
}