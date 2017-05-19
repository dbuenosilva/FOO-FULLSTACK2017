package GwMarket;

public class Compra extends ItemDeLista {

    private Data data;
    private ListaDeObjetos itens;

    public Compra(Data data, ListaDeObjetos itens) {

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

    public ListaDeObjetos getItens() {
        return (this.itens);
    }

}
