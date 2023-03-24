package abstractfactory;

public class Empresa {

    private Empresa empresa;
    private Historico historico;

    public Empresa() {
        this.empresa = fabrica.createEmpresa();
        this.historico = fabrica.createHistorico();
    }

    public String emitirEmpresa() {
        return this.empresa.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }


}