

package LojaCdFilmesJogos;


public class Filmes extends Midia {

	private String diretor;

	public Filmes() {

	}

	public Filmes(String titulo, int ano, double tempoDeDuracao, String comentarios, String diretor) {
		super( titulo, ano, tempoDeDuracao, comentarios);
		this.diretor = diretor;
		
	}

	public String getDiretor() {
		return(this.diretor);
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;

	}

	public String toString() {
		
		return( super.toString() +  "Diretor: " + this.diretor);
	}
	
}
