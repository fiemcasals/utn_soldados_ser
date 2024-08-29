public class Cuartel {
    private String codigoCuartel;
    private String nombreCuartel;
    private String ubicacion;

    public Cuartel(String codigoCuartel, String nombreCuartel, String ubicacion) {
        this.codigoCuartel = codigoCuartel;
        this.nombreCuartel = nombreCuartel;
        this.ubicacion = ubicacion;
    }

    public String getCodigoCuartel() {
        return codigoCuartel;
    }

    public String getNombreCuartel() {
        return nombreCuartel;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
