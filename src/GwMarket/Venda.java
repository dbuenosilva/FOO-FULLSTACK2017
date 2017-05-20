package GwMarket;

public class Venda extends ItemModel {

    private double valorTotalDaVenda;
    private FormaDePagamento formaDePagamento;
    private double valorEntreguePeloCliente;
    private Data data;
    private Model itens;
    private Caixa caixa;
    private Funcionario funcionario;

    public Venda() {
    }

    public Venda(double valorTotalDaVenda, FormaDePagamento formaDePagamento, double valorEntreguePeloCliente, Data data, Caixa caixa, Funcionario funcionario) {

        this.valorTotalDaVenda = valorTotalDaVenda;
        this.formaDePagamento = formaDePagamento;
        this.valorEntreguePeloCliente = valorEntreguePeloCliente;
        this.data = data;
        this.caixa = caixa;
        this.funcionario = funcionario;

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
    

}
