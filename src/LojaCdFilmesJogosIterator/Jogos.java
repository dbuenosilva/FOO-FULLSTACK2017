

package LojaCdFilmesJogosIterator;


public class Jogos extends Midia {

	private int numeroDeJogadores;

	private String plataforma;

	public int getNumeroDeJogadores() {
		return( this.numeroDeJogadores);
	}

	public String getPlataforma() {
		return( this.plataforma );
	}

	public void setNumeroDeJogadores(int numeroDeJogadores) {
		this.numeroDeJogadores = numeroDeJogadores;
		return ;

	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Jogos() {

	}

	public Jogos(String titulo, int ano, double tempoDeDuracao, String comentarios, int numeroDeJogadores, String plataforma) {
		super( titulo, ano, tempoDeDuracao, comentarios);
		this.numeroDeJogadores = numeroDeJogadores;
		this.plataforma = plataforma;

	}
	
	public String toString() {
		return( super.toString() + "Numero de Jogadores: " + this.numeroDeJogadores + ", Plataforma: " + this.plataforma);
	}

}
