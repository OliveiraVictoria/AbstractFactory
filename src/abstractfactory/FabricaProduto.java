package abstractfactory;

public class FabricaEmpresa implements FabricaAbstrata {

    @Override
    public Empresa createEmpresa() {
        return new Empresa();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoProduto();
    }
}
