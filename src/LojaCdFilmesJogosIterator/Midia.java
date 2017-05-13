
package LojaCdFilmesJogosIterator;



public class Midia {

	private String titulo;

	private int ano;

	private double tempoDeDuracao;

	private String comentarios;

	
	public Midia() {
		
	}
	
	public Midia( String titulo, int ano, double tempoDeDuracao, String comentarios )  {
		this.titulo = titulo;
		this.ano = ano;
		this.tempoDeDuracao = tempoDeDuracao;
		this.comentarios = comentarios;
	}
	
	public String getTitulo() {
		return(this.titulo);
	}

	public int getAno() {
		return(this.ano);
	}

	public double getTempoDeDuracao() {
		return(this.tempoDeDuracao);
	}

	public String getComentarios() {
		return(this.comentarios);
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;

	}

	public void setAno(int ano) {
		this.ano = ano;

	}

	public void setTempoDeDuracao(double tempoDeDuracao) {
		this.tempoDeDuracao = tempoDeDuracao;

	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;

	}
	
	public String toString() {
		return( " Titulo:  " + this.titulo + ",  Ano: " + ano + ", Tempo de Duração: " + tempoDeDuracao +  ", Comentários: " +  comentarios  );
	}

}
