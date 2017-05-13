/**
 * 
 */
package LojaCdFilmesJogosIterator;
import java.util.Iterator;

import PolimorfismoFuncionario.Funcionario;

/**
 * @author diego
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Stub de construtor gerado automaticamente
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ListaDeMidias lista = new ListaDeMidias();
		
		lista.adiciona( new CompactDisc( "Tião Carreiro e Pardinho - as 20 mais", 1987, 3.5, "Seleção das melhoras faixas", "Tião Carreiro e Pardinho", 20 ) );
		lista.adiciona( new CompactDisc( "XUXA", 1989, 2, "Só para baixinhos", "Xuxa Meneguel", 10 ) );
		lista.adiciona(new Filmes( "O Gladiador", 2003, 1.7, "Historia antiga em Roma", " Stive" ) );
		lista.adiciona( new Jogos("Mortal Kombat", 1988, 2, "Jogo top ", 2, "Nitendo") );
		lista.adiciona( new Jogos("Sonic", 2011, 2, "Jogo ... ", 2, "Sony PlayStation") );			
				
		System.out.println(" A quantidade de CD`s são: " + lista.GetQuantidadeDeCD());
		System.out.println(" A quantidade de Filmes são: " + lista.GetQuantidadeDeFilmes());
		System.out.println(" A quantidade de Jogos são: " + lista.GetQuantidadeDeJogos());
		
	}

}
