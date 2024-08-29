public class CuerpoDeEjercito {
    private String codigoCuerpo;
    private String denominacion;

    public CuerpoDeEjercito(String codigoCuerpo, String denominacion) {
        this.codigoCuerpo = codigoCuerpo;
        this.denominacion = denominacion;
    }

    public String getCodigoCuerpo() {
        return codigoCuerpo;
    }

    public String getDenominacion() {
        return denominacion;
    }
}
