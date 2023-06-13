public class FuncionarioCorteUnha extends Funcionario {
    public FuncionarioCorteUnha(Funcionario funcionarioProximoSetor) {
        listaServicos.add(TipoServicoCorteUnha.getTipoServicoCorteUnha());
        setFuncionarioProximoSetor(funcionarioProximoSetor);
    }

    public String getDescricaoCargo() {
        return "Profissional de Corte de Unha";
    }
}
