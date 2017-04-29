/**
 * 
 */
package PolimorfismoFuncionario;

/**
 * @author diego
 *
 */
public class Administrador extends Funcionario {

	/**
	 * 
	 */
	
	private double bonusPLR;
	
	
	public Administrador() {
		bonusPLR = 0;
	}
	
	public Administrador(int matricula, String nome, double bonusPLR) {
		super.setMatricula(matricula);
		super.setNome(nome);
		this.bonusPLR = bonusPLR;
	}
	
	public double calculaSalario(  ) {
		return( super.salarioBase + this.bonusPLR );
	}

	public double getPLR() {
		return(this.bonusPLR);
	}

	public void setPLR( double bonusPLR) {
		this.bonusPLR = bonusPLR;
	}
	
}
