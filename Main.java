import java.util.Date;
            

public class Main {
    public static void main(String[] args) {
        // Crear Cuerpos de Ejército
        CuerpoDeEjercito infanteria = new CuerpoDeEjercito("C001", "Infantería");
        CuerpoDeEjercito artilleria = new CuerpoDeEjercito("C002", "Artillería");
        CuerpoDeEjercito armada = new CuerpoDeEjercito("C003", "Armada");

        // Crear Compañía
        Compania compania1 = new Compania("CO001", "Vigilancia");

        // Crear Cuartel
        Cuartel cuartel1 = new Cuartel("Q001", "Cuartel Central", "Ubicación A");

        // Crear Servicios
        Servicio servicio1 = new Servicio("S001", "Correr", new Date(), new Date());
        Servicio servicio2 = new Servicio("S002", "Limpiar", new Date(), new Date());

        // Crear Soldado
        Soldado soldado1 = new Soldado("Juan", "Perez", 1, "Cabo", infanteria, compania1);

        // Crear Suboficial
        Suboficial suboficial1 = new Suboficial("Carlos", "Gomez", 2);

        // Asignar Cuartel y Servicio
        suboficial1.asignarCuartel(soldado1, cuartel1);
        suboficial1.asignarServicio(soldado1, servicio1);
        suboficial1.asignarServicio(soldado1, servicio2);

        // Crear Oficial
        Oficial oficial1 = new Oficial("Luis", "Rodriguez", 3);

        // Mostrar Información del Soldado
        oficial1.mostrarInformacionSoldado(soldado1);

        // Mostrar Servicios Realizados
        System.out.println("Servicios Realizados:");
        for (Servicio servicio : soldado1.getServiciosRealizados()) {
            System.out.println(servicio.getDescripcion());
        }
    }
}
