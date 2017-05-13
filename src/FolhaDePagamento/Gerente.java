
package FolhaDePagamento;

public class Gerente extends Funcionario {

	private String area;

	public Gerente( String nome, Data nascimento, float salario, String area ) {
		super(nome, nascimento, salario);
		this.area = area;
	}
	
	public double calculaImposto() {
		return( super.getSalario() * IRRF_FAIXA_2 );
	}

	@Override
	public void imprimeDados() {
		System.out.println( this.getClass() + " = " + super.toString() + ", Salário: " + super.getSalario() + ", IRRF: " + this.calculaImposto() );
	}
	
	public String geArea() {
        return(this.area);
    }

    public void setArea(String area) {
        this.area = area;
    }

}
