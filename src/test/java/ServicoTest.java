import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoTest {
    FuncionarioBanho funcionarioBanho;
    FuncionarioTosa funcionarioTosa;
    FuncionarioCorteUnha funcionarioCorteUnha;

    @BeforeEach
    void setUp() {
        funcionarioBanho = new FuncionarioBanho(funcionarioTosa);
        funcionarioTosa = new FuncionarioTosa(funcionarioCorteUnha);
        funcionarioCorteUnha = new FuncionarioCorteUnha(null);
    }

    @Test
    void deveRetornarProfissionalDeBanhoParaExecutarServicoDeBanho() {
        assertEquals("Profissional de Banho", funcionarioBanho.executarServico(new Servico(TipoServicoBanho.getTipoServicoBanho())));
    }

    @Test
    void deveRetornarProfissionalDeTosaParaExecutarServicoDeTosa() {
        assertEquals("Profissional de Tosa", funcionarioTosa.executarServico(new Servico(TipoServicoTosa.getTipoServicoTosa())));
    }

    @Test
    void deveRetornarProfissionalDeCorteDeUnhaParaExecutarServicoDeCorteDeUnha() {
        assertEquals("Profissional de Corte de Unha", funcionarioCorteUnha.executarServico(new Servico(TipoServicoCorteUnha.getTipoServicoCorteUnha())));
    }

    @Test
    void deveRetornarSemExecucaoParaServicoDePasseio() {
        assertEquals("Não executado", funcionarioBanho.executarServico(new Servico(TipoServicoPasseio.getTipoServicoPasseio())));
    }
}