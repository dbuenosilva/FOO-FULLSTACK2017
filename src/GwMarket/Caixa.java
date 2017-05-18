package GwMarket;

public class Caixa {

    private int id;
    private Balanca balanca;
    private Funcionario operador;
    private Venda vendaSendoRealiza;

    public Caixa() {
    }

    public Caixa(Funcionario operador) {
        this.operador = operador;
    }

    public boolean atribuirFuncionario(Funcionario funcionario) {

        if (this.operador == null && this.operador.getCargo().getAcessoVenda()) {
            this.operador = funcionario;
        } else {
            return (false);
        }

        return (true);
    }

    public boolean removerFuncionario() {

        if (this.operador == null) {
            return (false);
        } else {
            this.operador = null;
        }

        return (true);
    }

    public boolean atribuirBalanca(Balanca balanca) {

        if (this.balanca == null) {
            this.balanca = balanca;
        } else {
            return (false);
        }

        return (true);
    }

    public boolean removerBalanca() {

        if (this.balanca == null) {
            return (false);
        } else {
            this.balanca = null;
        }

        return (true);
    }

    public boolean iniciarVenda() {

        if (this.operador == null) {
            return (false);
        } else {
            vendaSendoRealiza = new Venda();
        }

        return (true);
    }

    public boolean leProximoItem(Produto produto, double quantidade, UnidadeDeMedida unidadeDeMedida) {

        if (produto.checarEstoque(quantidade, unidadeDeMedida)) {
            vendaSendoRealiza.getItens().adicionaNaLista(new Item(produto, quantidade, unidadeDeMedida));
        } else {
            return (false);
        }

        return (true);
    }

    public void finalizarVenda(ListaDeObjetos relacaoDeVendasRealizadas) {
        relacaoDeVendasRealizadas.adicionaNaLista(this.vendaSendoRealiza);
        this.vendaSendoRealiza = null;
    }

}
