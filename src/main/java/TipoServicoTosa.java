public class TipoServicoTosa implements TipoServico {
    private static TipoServicoTosa tipoServicoTosa = new TipoServicoTosa();

    private TipoServicoTosa() {};

    public static TipoServicoTosa getTipoServicoTosa() {
        return tipoServicoTosa;
    }
}
