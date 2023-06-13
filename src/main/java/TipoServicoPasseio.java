public class TipoServicoPasseio implements TipoServico {
    private static TipoServicoPasseio tipoServicoPasseio = new TipoServicoPasseio();

    private TipoServicoPasseio() {};

    public static TipoServicoPasseio getTipoServicoPasseio() {
        return tipoServicoPasseio;
    }
}
