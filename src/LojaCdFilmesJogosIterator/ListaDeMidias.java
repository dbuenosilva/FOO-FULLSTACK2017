package LojaCdFilmesJogosIterator;

import java.util.Iterator;
import java.util.LinkedList;

import LojaCdFilmesJogos.Jogos;

public class ListaDeMidias {

	private LinkedList<Midia> linkedlist = new LinkedList<Midia>();
	
	public ListaDeMidias() {
	
	}
	
	
	public void adiciona( Midia midia) {
		linkedlist.add(midia);
	}
	
	public LinkedList<Midia>  getListaDeMidia() {
		return(this.linkedlist);
	}
	
	public int GetQuantidadeDeJogos(){
		int qtdeJogos     = 0;
		Iterator i = linkedlist.iterator();
		
		while(i.hasNext()) {
			if ( i.next() instanceof Jogos ) {
				qtdeJogos++;
			}
		}
	return(qtdeJogos);
	}
	
	public int GetQuantidadeDeFilmes(){
		int qtdeFilmes     = 0;
		Iterator i = linkedlist.iterator();
		
		while(i.hasNext()) {
			if ( i.next() instanceof Filmes ) {
				qtdeFilmes++;
			}
		}
	return(qtdeFilmes);
	}
	
	public int GetQuantidadeDeCD(){
		int qtdeCD     = 0;
		Iterator i = linkedlist.iterator();
		
		while(i.hasNext()) {
			if ( i.next() instanceof CompactDisc) {
				qtdeCD++;
			}
		}
	return(qtdeCD);
	}

}
