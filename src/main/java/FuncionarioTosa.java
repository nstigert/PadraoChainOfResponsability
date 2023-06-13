public class FuncionarioTosa  extends Funcionario {
    public FuncionarioTosa(Funcionario funcionarioProximoSetor) {
        listaServicos.add(TipoServicoTosa.getTipoServicoTosa());
        setFuncionarioProximoSetor(funcionarioProximoSetor);
    }

    public String getDescricaoCargo() {
        return "Profissional de Tosa";
    }
}
