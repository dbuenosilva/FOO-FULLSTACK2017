package GwMarket;

public class Item {

    private Produto produto;
    private double quantidade;
    private UnidadeDeMedida unidadeDeMedida;
    private double valorUnitario;

    public Item() {
    }

    public Item(Produto produto, double quantidade, UnidadeDeMedida unidadeDeMedida, double valorUnitario) {

        this.produto = produto;
        this.quantidade = quantidade;
        this.produto = produto;
        this.valorUnitario = valorUnitario;

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
        this.valorUnitario = valorUnitario;
    }

    public UnidadeDeMedida getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(UnidadeDeMedida unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public double buscaPrecoProduto() {
        return (this.produto.getPrecoNaPrimeiraUnidadeDeMedida());
    }

}
