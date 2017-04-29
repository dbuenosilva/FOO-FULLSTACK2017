/**
 * 
 */
package PolimorfismoFuncionario;

/**
 * @author diego
 *
 */
public class Horista extends Funcionario {

	/**
	 * 
	 */
	
	private double quantidadeDeHorasTrabalhada;
	private double valorPorHoraTrabalhada;
	
	
	
	public Horista() {
		quantidadeDeHorasTrabalhada = 0;
		valorPorHoraTrabalhada = 0;
	}
	
	public Horista(double quantidadeDeHorasTrabalhada, double valorHoraTrabalhada) {
		this.quantidadeDeHorasTrabalhada = quantidadeDeHorasTrabalhada;
		this.valorPorHoraTrabalhada = valorHoraTrabalhada;
	}

	public Horista(int matricula, String nome, double quantidadeDeHorasTrabalhada, double valorHoraTrabalhada) {
		super.setMatricula(matricula);
		super.setNome(nome);
		this.quantidadeDeHorasTrabalhada = quantidadeDeHorasTrabalhada;
		this.valorPorHoraTrabalhada = valorHoraTrabalhada;
	}
	
	public double calculaSalario() {
		return( super.salarioBase + ( this.quantidadeDeHorasTrabalhada * this.valorPorHoraTrabalhada )  ) ;
	}
	
	public double getQuantidadeDeHorasTrabalhada() {
		return(this.quantidadeDeHorasTrabalhada);
	}

	public void setQuantidadeDeHorasTrabalhada( double quantidadeDeHorasTrabalhada) {
		this.quantidadeDeHorasTrabalhada = quantidadeDeHorasTrabalhada;
	}
	
	public double getValorPorHoraTrabalhada() {
		return(this.valorPorHoraTrabalhada);
	}

	public void setvalorPorHoraTrabalhada( double valorPorHoraTrabalhada) {
		this.valorPorHoraTrabalhada = valorPorHoraTrabalhada;
	}

}
