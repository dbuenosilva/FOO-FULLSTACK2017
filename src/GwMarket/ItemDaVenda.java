package GwMarket;

public class ItemDaVenda extends ItemModel {

    private Produto produto;
    private double quantidade;
    private UnidadeDeMedida unidadeDeMedida;
    private double valorUnitario;

    public ItemDaVenda() {
    }

    public ItemDaVenda(Produto produto, double quantidade, UnidadeDeMedida unidadeDeMedida) {

        this.produto = produto;
        this.quantidade = quantidade;
        this.unidadeDeMedida = unidadeDeMedida;
        this.valorUnitario = buscaPrecoProduto(unidadeDeMedida);

    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = buscaPrecoProduto(this.unidadeDeMedida);
    }

    public UnidadeDeMedida getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(UnidadeDeMedida unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    private double buscaPrecoProduto( UnidadeDeMedida unidadeDeMedida) {
    	
    	if (this.produto.getPrimeiraUnidadeDeMedida().equals(unidadeDeMedida)) {
    		return (this.produto.getPrecoNaPrimeiraUnidadeDeMedida());	
    	}
    	else if (this.produto.getSegundaUnidadeDeMedida().equals(unidadeDeMedida)) {
    		return (this.produto.getPrecoNaSegundaUnidadeDeMedida());
    	}
    	
    	return(0);
    }

    public String toString() {
    	return(   "Produto : "+ this.produto + " | " + ", Quantidade :"+ this.quantidade + " , Unidade de medida" + this.unidadeDeMedida + " | Valor R$ : " + this.valorUnitario);
    }
    
}
