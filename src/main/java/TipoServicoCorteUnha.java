public class TipoServicoCorteUnha implements TipoServico {
    private static TipoServicoCorteUnha tipoServicoCorteUnha = new TipoServicoCorteUnha();

    private TipoServicoCorteUnha() {};

    public static TipoServicoCorteUnha getTipoServicoCorteUnha() { return tipoServicoCorteUnha; }
}
