
package FolhaDePagamento;

public class Cliente extends Pessoa  {

	private int codigo;
	
	public Cliente(String nome, Data nascimento, int codigo ) {
		super(nome, nascimento);
		this.codigo = codigo;
	}
	
	public int getCodigo() {
        return(this.codigo);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
	public void imprimeDados() {
		System.out.println( this.getClass() + " = Nome: " + super.getNome()  + ", Data Nascimento: " + super.getNascimento().toString() + ", Código: " + this.getCodigo() );
	}
    
}
