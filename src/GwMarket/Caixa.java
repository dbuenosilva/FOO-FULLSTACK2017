package GwMarket;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Caixa extends ItemModel implements ListadeCodigosDeMensagensDeErros {

    private String id;
    private String descricao;
    private Balanca balanca;
    private Funcionario operador;
    private Venda vendaSendoRealiza;

    public Caixa() {
    }

    public Caixa(String id, String descricao, Funcionario operador, Balanca balanca) {

        this.id = id;
        this.descricao = descricao;
        this.operador  = operador;
        this.balanca = balanca;

    }

    public Caixa(String id, String descricao) {
        this.id = id;
        this.operador = operador;
    }

    public String getId() {
        return (this.id);
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getDescricao(){
    	return(this.descricao);
    }
    
    public void setDescricao(String descricao) {
    	this.descricao = descricao;
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
        	this.vendaSendoRealiza = new Venda();
        }

        return (SUCESSO);
    }

    public int addItemNaVenda(Produto produto, double quantidade, UnidadeDeMedida unidadeDeMedida) {

        if (produto.checarEstoque(quantidade*(-1), unidadeDeMedida) == SUCESSO
                && produto.atualizaEstoque(quantidade * (-1), unidadeDeMedida) == SUCESSO) {
        	this.vendaSendoRealiza.getItens().adicionaNaLista(new ItemDaVenda(produto, quantidade, unidadeDeMedida));
        } else {
            return (ERR_SALDO);
        }

        return (SUCESSO);
    }

    public int finalizarVenda(Model relacaoDeVendasRealizadas) {

        if (this.vendaSendoRealiza != null) {
        	this.vendaSendoRealiza.setFuncionario(this.getOperador());
        	
        	Date date = new Date();
        	LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        	int year  = localDate.getYear();
        	int month = localDate.getMonthValue();
        	int day   = localDate.getDayOfMonth();
        	
        	this.vendaSendoRealiza.setData( new Data( day, month, year  ));
            relacaoDeVendasRealizadas.adicionaNaLista(this.vendaSendoRealiza);
            this.vendaSendoRealiza = null;
        } else {
            return (ERR_VENDA_NAO_EXISTE);
        }
        return (SUCESSO);
    }
    
     @Override
    public String toString(){
        return( getId() + " - "+getDescricao()  );
    }   

}
