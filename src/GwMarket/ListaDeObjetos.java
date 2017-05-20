
package GwMarket;

import java.util.Iterator;
import java.util.LinkedList;

public class ListaDeObjetos {

	private int qtdAtual;
	private LinkedList<ItemDeLista> listaDeObjetos;
	
	public ListaDeObjetos() {
		this.listaDeObjetos = new LinkedList<ItemDeLista>();
		this.qtdAtual = 0;
	}

	public void adicionaNaLista( ItemDeLista obj ) {
		listaDeObjetos.add(obj);
	}
	
	public void removeDaLista( ItemDeLista obj ) {
		listaDeObjetos.remove(obj);
	}
	
	public int getQtdAtual() {
		return(this.qtdAtual);
	}

	public LinkedList<ItemDeLista> getLista() {
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
