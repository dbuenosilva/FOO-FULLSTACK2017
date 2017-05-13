
package LojaCdFilmesJogos;


public class CompactDisc extends Midia {

	private String artista;
	private int quantidadeDeFaixas;

	public CompactDisc() {
	}

	public CompactDisc(String titulo, int ano, double tempoDeDuracao, String comentarios, String artista, int quantidadeDeFaixas) {
	
		super( titulo, ano, tempoDeDuracao, comentarios);
		this.artista = artista;
		this.quantidadeDeFaixas = quantidadeDeFaixas;
		
	}

	public String getArtista() {
		return( this.artista );
	}

	public int getQuantidadeDeFaixas() {
		return (this.quantidadeDeFaixas);
	}

	public void setArtista(String artista) {
		this.artista = artista;

	}

	public void setQuantidadeDeFaixas(int quantidadeDeFaixas) {
		this.quantidadeDeFaixas = quantidadeDeFaixas;

	}
	
	public String toString() {
		return( super.toString() + " Artista: " + this.artista + ", Quantidade De Faixas: " + this.quantidadeDeFaixas );
	}

}
