/**
 * 
 */
package PolimorfismoFuncionario;

/**
 * @author diego
 *
 */
public class Gerente extends Funcionario {

	/**
	 * 
	 */
	
	private double gratificacao;
	private double bonusPLR;
	
	public Gerente() {
		gratificacao = 0;
		bonusPLR = 0;
	}
	
	public Gerente (int matricula, String nome, double gratificacao, double bonusPLR) {
		super.setMatricula(matricula);
		super.setNome(nome);
		this.bonusPLR = bonusPLR;
		this.gratificacao = gratificacao;
	}
	
	
	public double calculaSalario() {
		return( super.salarioBase + this.gratificacao + this.bonusPLR );
	}
	
	public double getGratificacao() {
		return(this.gratificacao);
	}

	public void setGratificacao( double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	public double getPLR() {
		return(this.bonusPLR);
	}

	public void setPLR( double bonusPLR) {
		this.bonusPLR = bonusPLR;
	}

}
