

package GwMarket;

public abstract interface Pessoa  {

	private String nome;

	private int nascimento;

	private String cpf;

	private String rg;

	private Data  data ;

	private Data  data ;

	private ListaDeClientes listaDeClientes;

	public abstract Pessoa(String nome, int nascimento, String cpf, String rg);

	public abstract String getNome();

	public abstract void setNome(String nome);

	public abstract int getNascimento();

	public abstract void setNascimento(int nascimento);

	public abstract String getCPF();

	public abstract void setCPF(String cpf);

	public abstract String getRg();

	public abstract void setRg(String rg);

}
