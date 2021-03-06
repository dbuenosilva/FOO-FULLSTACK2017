

package FolhaDePagamento;

public abstract class Pessoa {

	private String nome;
	private Data nascimento;

	public abstract void imprimeDados();
	
	public Pessoa( String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public String getNome() {
        return(this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return (this.nascimento);
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }	
    
    public String toString() {
    	return( "Nome: " + this.getNome()  + ", Data Nascimento: " + this.getNascimento() );
    }
  

}
