

package FolhaDePagamento;

public class Funcionario extends Pessoa implements Constantes {

	private float salario = 0;

	public Funcionario( String nome, Data nascimento, float salario ) {
		super(nome, nascimento);
		this.salario = salario;
	}
	
	public double calculaImposto() {
		return( this.salario * IRRF_FAIXA_1 );
	}

	@Override
	public void imprimeDados() {
		System.out.println( this.getClass() + " = " + super.toString() + ", Salário: " + this.salario + ", IRRF: " + this.calculaImposto() );
	}
	
	public float getSalario(){
        return(this.salario);
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
