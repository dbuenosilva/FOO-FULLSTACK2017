package GwMarket;

import java.util.Iterator;

public class Compra extends ItemModel {

    private Data data;
    private Model itens;

    public Compra(Data data) {

        this.data = data;
        this.itens = new Model();
    }
    public Compra(){
       this.itens = new Model();
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Model getItens() {
        return (this.itens);
    }
    
     public String toString() {
        String impressao = "Data: " + this.getData()+ "\n";
     
        
        Iterator i = this.getItens().getLista().iterator();

        while (i.hasNext()) {
        	ItemDaCompra itemDaCompra = (ItemDaCompra) i.next(); 
            impressao += " " + itemDaCompra + "\n";
        }
        return( impressao );
    }
 
}
