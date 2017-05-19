package GwMarket;

public class Caixa extends ItemDeLista implements ListadeCodigosDeMensagensDeErros {

    private String id;
    private Balanca balanca;
    private Funcionario operador;
    private Venda vendaSendoRealiza;

    public Caixa() {
    }

    public Caixa(String id, Balanca balanca) {

        this.id = id;
        this.balanca = balanca;

    }

    public Caixa(String id, Funcionario operador) {
        this.id = id;
        this.operador = operador;
    }

    public String getId() {
        return (this.id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public Funcionario getOperador() {
        return (this.operador);
    }

    public Balanca getBalanca() {
        return (this.balanca);
    }

    public Venda getVenda() {
        return (this.vendaSendoRealiza);
    }

    public int atribuirFuncionario(Funcionario funcionario) {

        if (this.operador == null && this.operador.getCargo().getAcessoVenda()) {
            this.operador = funcionario;
        } else {
            return (ERR_JA_EXISTE_OPERADOR);
        }
        return (SUCESSO);
    }

    public int removerFuncionario() {

        if (this.operador == null) {
            return (ERR_NAO_EXISTE_OPERADOR);
        } else {
            this.operador = null;
        }

        return (SUCESSO);
    }

    public int atribuirBalanca(Balanca balanca) {

        if (this.balanca == null) {
            this.balanca = balanca;
        } else {
            return (ERR_JA_EXISTE_BALANCA);
        }

        return (SUCESSO);
    }

    public int removerBalanca() {

        if (this.balanca == null) {
            return (ERR_NAO_EXISTE_BALANCA);
        } else {
            this.balanca = null;
        }

        return (SUCESSO);
    }

    public int iniciarVenda() {

        if (this.operador == null) {
            return (ERR_NAO_EXISTE_OPERADOR);
        } else if (this.vendaSendoRealiza != null) {
            return (ERR_VENDA_JA_EM_EXECUCAO);
        } else {
            vendaSendoRealiza = new Venda();
        }

        return (SUCESSO);
    }

    public int leProximoItem(Produto produto, double quantidade, UnidadeDeMedida unidadeDeMedida) {

        if (produto.checarEstoque(quantidade, unidadeDeMedida) == SUCESSO
                && produto.atualizaEstoque(quantidade * (-1), unidadeDeMedida) == SUCESSO) {
            vendaSendoRealiza.getItens().adicionaNaLista(new Item(produto, quantidade, unidadeDeMedida));
        } else {
            return (ERR_SALDO);
        }

        return (SUCESSO);
    }

    public int finalizarVenda(ListaDeObjetos relacaoDeVendasRealizadas) {

        if (this.vendaSendoRealiza != null) {
            relacaoDeVendasRealizadas.adicionaNaLista(this.vendaSendoRealiza);
            this.vendaSendoRealiza = null;
        } else {
            return (ERR_VENDA_NAO_EXISTE);
        }
        return (SUCESSO);
    }
    
     @Override
    public String toString(){
        return("Codigo do caixa : "+getId()+", Balança : "+getBalanca());
    }   

}
