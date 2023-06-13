import java.util.ArrayList;

public abstract class Funcionario {
    protected ArrayList listaServicos = new ArrayList();
    private Funcionario funcionarioProximoSetor;

    public Funcionario getFuncionarioProximoSetor() {
        return funcionarioProximoSetor;
    }

    public void setFuncionarioProximoSetor(Funcionario funcionarioProximoSetor) {
        this.funcionarioProximoSetor = funcionarioProximoSetor;
    }

    public abstract String getDescricaoCargo();

    public String executarServico(Servico servico) {
        if (listaServicos.contains(servico.getTipoServico())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioProximoSetor != null) {
                return funcionarioProximoSetor.executarServico(servico);
            }
            else
            {
                return "Não executado";
            }
        }
    }
}
