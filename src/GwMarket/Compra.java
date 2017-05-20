package GwMarket;

public class Compra extends ItemModel {

    private Data data;
    private Model itens;

    public Compra(Data data, Model itens) {

        this.data = data;
        this.itens = itens;
    }
    public Compra(){}

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Model getItens() {
        return (this.itens);
    }

}
