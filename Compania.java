public class Compania {
    private String idCompania;
    private String actividadPrincipal;

    public Compania(String idCompania, String actividadPrincipal) {
        this.idCompania = idCompania;
        this.actividadPrincipal = actividadPrincipal;
    }

    public String getIdCompania() {
        return idCompania;
    }

    public String getActividadPrincipal() {
        return actividadPrincipal;
    }
}
