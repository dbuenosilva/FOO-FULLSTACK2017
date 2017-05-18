

package GwMarket;

public class Cliente extends Pessoa  {

	private int codigo;
	private String endereco;

	public Cliente(int codigo, String nome, Data nascimento, String cpf, String rg, String endereco) {
		super(nome, nascimento, cpf, rg);
		this.codigo = codigo;
		this.endereco = endereco;
	}

	public int getCodigo() {
		return(this.codigo);
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEndereco( ) {
		return(this.endereco);
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}