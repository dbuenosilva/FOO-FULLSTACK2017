
package GwMarket;

public class Pessoa extends ItemModel {

	private String nome;
	private Data nascimento;
	private String cpf;
	private String rg;

	public Pessoa(String nome, Data nascimento,String cpf, String rg) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getNome() {
		return(this.nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Data getNascimento() {
		return(this.nascimento);
	}
	
	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getCPF() {
		return(this.cpf);
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return(this.rg);
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String toString() {
		return( this.nome );
	}

}
