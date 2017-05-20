package GwMarket;

public class Recepcao implements ListadeCodigosDeMensagensDeErros {

    private String id;
    private Balanca balanca;
    private Funcionario operador;
    private Compra compraSendoRealiza;

    public Recepcao() {
    }

    public Recepcao(String id, Funcionario operador) {
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
    
    public void setFuncionario(Funcionario operador){
        this.operador=operador;
    }

    public Balanca getBalanca() {
        return (this.balanca);
    }

    public Compra getCompra() {
        return (this.compraSendoRealiza);
    }

    public int atribuirFuncionario(Funcionario funcionario) {

        if (this.operador == null && this.operador.getCargo().getAcessoAoEstoque()) {
            this.operador = funcionario;
        } else {
            return (ERR_NAO_PODE_LANCAR_ENTRADA);
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

    public int iniciarCompra() {

        if (this.operador == null) {
            return (ERR_NAO_EXISTE_OPERADOR);
        } else if (this.compraSendoRealiza != null) {
            return (ERR_COMPRA_JA_EM_EXECUCAO);
        } else {
            compraSendoRealiza = new Compra();
        }

        return (SUCESSO);
    }

    public int leProximoItem(Produto produto, double quantidade, UnidadeDeMedida unidadeDeMedida) {

        if (produto.checarEstoque(quantidade, unidadeDeMedida) == SUCESSO
                && produto.atualizaEstoque(quantidade, unidadeDeMedida) == SUCESSO) {
            compraSendoRealiza.getItens().adicionaNaLista(new ItemDaVenda(produto, quantidade, unidadeDeMedida));
        } else {
            return (ERR_SALDO);
        }

        return (SUCESSO);
    }
     public int addItemNaCompra(Produto produto, double quantidade, UnidadeDeMedida unidadeDeMedida) {

        if (produto.checarEstoque(quantidade, unidadeDeMedida) == SUCESSO
                && produto.atualizaEstoque(quantidade * 1, unidadeDeMedida) == SUCESSO) {
            compraSendoRealiza.getItens().adicionaNaLista(new ItemDaVenda(produto, quantidade, unidadeDeMedida));
        } else {
            return (ERR_SALDO);
        }

        return (SUCESSO);
    }

    public int finalizarCompra(Model relacaoDeComprasRealizadas) {

        if (this.compraSendoRealiza != null) {
            relacaoDeComprasRealizadas.adicionaNaLista(this.compraSendoRealiza);
            this.compraSendoRealiza = null;
        } else {
            return (ERR_COMPRA_NAO_EXISTE);
        }
        return (SUCESSO);
    }

}
