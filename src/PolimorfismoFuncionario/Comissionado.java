/**
 * 
 */
package PolimorfismoFuncionario;

/**
 * @author diego
 *
 */
public class Comissionado extends Funcionario {

	/**
	 * 
	 */
	
	private double quantidadeDeItensVendidos;
	private double valorPorItemVendido;
	
	
	public Comissionado() {
		quantidadeDeItensVendidos = 0;
		valorPorItemVendido = 0;
	}
	
	public Comissionado(int matricula, String nome, double quantidadeDeItensVendidos, double valorPorItemVendido) {
		super.setMatricula(matricula);
		super.setNome(nome);
		this.quantidadeDeItensVendidos = quantidadeDeItensVendidos;
		this.valorPorItemVendido = valorPorItemVendido;
	}

	public double calculaSalario() {
		return( super.salarioBase + ( this.quantidadeDeItensVendidos * this.valorPorItemVendido ) );
	}
	
	public double getQuantidadeDeItensVendidos() {
		return(this.quantidadeDeItensVendidos);
	}

	public void setQuantidadeDeItensVendidos( double quantidadeDeItensVendidos) {
		this.quantidadeDeItensVendidos = quantidadeDeItensVendidos;
	}
	
	public double getValorPorItemVendido() {
		return(this.valorPorItemVendido);
	}

	public void setValorPorItemVendido( double valorPorItemVendido) {
		this.valorPorItemVendido = valorPorItemVendido;
	}
	
}
