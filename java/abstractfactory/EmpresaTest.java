package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveEmitirHistoricoProduto() {
        FabricaAbstrata fabrica = new FabricaProduto();
        Empresa empresa = new Empresa(fabrica);
        assertEquals("Histórico de Produto", empresa.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoEstoqueProduto() {
        FabricaAbstrata fabrica = new FabricaEstoqueProduto();
        Empresa empresa = new Empresa(fabrica);
        assertEquals("Histórico de Estoque de Produto", empresa.emitirHistorico());
    }

    @Test
    void deveEmitirDiplomaProduto() {
        FabricaAbstrata fabrica = new FabricaProduto();
        Empresa empresa = new Empresa(fabrica);
        assertEquals("Histórico de Produto", aluno.emitirHistoricoProduto());
    }

    @Test
    void deveEmitirDiplomaPosGraduacao() {
        FabricaAbstrata fabrica = new FabricaEstoqueProduto();
        Empresa empresa = new Empresa(fabrica);
        assertEquals("Histórico de Estoque de Produto", empresa.emitirHistoricoProduto());
    }

}