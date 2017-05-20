package GwMarket;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Venda extends ItemModel {

    private double valorTotalDaVenda;
    private FormaDePagamento formaDePagamento;
    private double valorEntreguePeloCliente;
    private Data data;
    private Model itens;
    private Caixa caixa;
    private Funcionario funcionario;
    private Cliente cliente;
    
    public Venda() {
    	 this.itens = new Model();
    }

    public Venda(double valorTotalDaVenda, FormaDePagamento formaDePagamento, double valorEntreguePeloCliente, Data data, Caixa caixa, Funcionario funcionario) {

        this.valorTotalDaVenda = valorTotalDaVenda;
        this.formaDePagamento = formaDePagamento;
        this.valorEntreguePeloCliente = valorEntreguePeloCliente;
        this.data = data;
        this.caixa = caixa;
        this.funcionario = funcionario;
        this.itens = new Model();

    }

    public double getValorTotalDaVenda() {
        return valorTotalDaVenda;
    }

    public void setValorTotalDaVenda(double valorTotalDaVenda) {
        this.valorTotalDaVenda = valorTotalDaVenda;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public double getValorEntreguePeloCliente() {
        return valorEntreguePeloCliente;
    }

    public void setValorEntreguePeloCliente(double valorEntreguePeloCliente) {
        this.valorEntreguePeloCliente = valorEntreguePeloCliente;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double calculaTroco() {
        double result = 0;
        if (this.formaDePagamento.getPermiteTroco()) {
            result = this.valorEntreguePeloCliente - this.valorTotalDaVenda;
        }
        return (result);
    }
    
    public Model getItens() {
    	return( this.itens );
    }
    
    public Cliente getCliente() {
    	return( this.cliente);
    }
    
    public void setCliente( Cliente cliente ) {
    	this.cliente = cliente;
    }
    
    public String toString() {
        String impressao = "Data: " + this.getData() + " | Cliente: " + this.getCliente() + " | Valor Total da Venda: " + this.getValorTotalDaVenda() + "\n";
        impressao += "----------------------------------------------------------------------------------------------------------";
//        impressao += "Operador: " + this.getCaixa().getOperador().toString() + " | Caixa: " + this.getCaixa().toString() + " | Balança: " + this.getCaixa().getBalanca().toString(); 

        impressao += "----------------------------------------------------------------------------------------------------------";
        impressao += "Produto-------------------Quantidade-----------Unidade Medida ---------------------Preço------------------";
        
        Iterator i = this.getItens().getLista().iterator();

        while (i.hasNext()) {
        	ItemDaVenda itemDaVenda = (ItemDaVenda) i.next(); 
            impressao += " " + itemDaVenda + "\n";
        }
        return( impressao );
    }
    
}
