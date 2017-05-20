
package GwMarket;

import java.util.Iterator;
import java.util.LinkedList;

public class Model {

	private int qtdAtual;
	private LinkedList<ItemModel> listaDeObjetos;
	
	public Model() {
		this.listaDeObjetos = new LinkedList<ItemModel>();
		this.qtdAtual = 0;
	}

	public void adicionaNaLista( ItemModel obj ) {
		listaDeObjetos.add(obj);
	}
	
	public void removeDaLista( ItemModel obj ) {
		listaDeObjetos.remove(obj);
	}
	
	public int getQtdAtual() {
		return(this.qtdAtual);
	}

	public LinkedList<ItemModel> getLista() {
		return(this.listaDeObjetos);
	}
	
	public String imprimeLista( Object obj) {
		String impressaoObj = "";
        Iterator i = this.getLista().iterator();
        while (i.hasNext()) {
        	 obj =  i.next();
        	impressaoObj += obj.toString();
        }
        return(impressaoObj);
	}
	
}
