/**
 * 
 */
package LojaCdFilmesJogos;

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
		
		Midia[] midias = new Midia[10];
					
		midias[0] = new CompactDisc( "Tião Carreiro e Pardinho - as 20 mais", 1987, 3.5, "Seleção das melhoras faixas", "Tião Carreiro e Pardinho", 20 );
		midias[1] = new CompactDisc( "XUXA", 1989, 2, "Só para baixinhos", "Xuxa Meneguel", 10 );
		midias[2] = new Filmes( "O Gladiador", 2003, 1.7, "Historia antiga em Roma", " Stive" );
		midias[3] = new Jogos("Mortal Kombat", 1988, 2, "Jogo top ", 2, "Nitendo");
		midias[4] = new Jogos("Sonic", 2011, 2, "Jogo ... ", 2, "Sony PlayStation");
				
		for ( int i = 0; i < midias.length; i++ ) {
						
			System.out.println(  midias[i] );			
			
			if ( midias[i] instanceof Jogos ) {
				
				Jogos aux = (Jogos) midias[i];
				
				System.out.println(  aux.getPlataforma());	
			} 
		}

	}

}
