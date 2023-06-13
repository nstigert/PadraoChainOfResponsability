public class TipoServicoBanho implements TipoServico {
    private static TipoServicoBanho tipoServicoBanho = new TipoServicoBanho();

    private TipoServicoBanho() {};

    public static TipoServicoBanho getTipoServicoBanho() {
        return tipoServicoBanho;
    }
}
