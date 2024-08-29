public class Oficial extends Suboficial {
    public Oficial(String nombre, String apellido, int id) {
        super(nombre, apellido, id);
    }

    public void mostrarInformacionSoldado(Soldado soldado) {
        soldado.mostrarInformacion();
    }
}
