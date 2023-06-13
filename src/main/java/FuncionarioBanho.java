public class FuncionarioBanho extends Funcionario {
    public FuncionarioBanho(Funcionario funcionarioProximoSetor) {
        listaServicos.add(TipoServicoBanho.getTipoServicoBanho());
        setFuncionarioProximoSetor(funcionarioProximoSetor);
    }

    public String getDescricaoCargo() {
        return "Profissional de Banho";
    }
}
