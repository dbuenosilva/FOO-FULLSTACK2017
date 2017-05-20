/**
 * 
 */
package calculadora;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * @author diego
 *
 */
public class Calculadora {

	/**
	 * 
	 */
	
	final JComboBox<String> comboOperador = new JComboBox<String>();
	private double valorA;
	private double valorB;

	public Calculadora() {
		
		valorA = 0;
		valorB = 0;
		
		comboOperador.addItem("(+) Soma");
		comboOperador.addItem("(-) Subtração");
		comboOperador.addItem("(*) Multiplicação");
		comboOperador.addItem("(/) Divisão");
		
	}
	
	public double soma(  ) {
		return( this.valorA + this.valorB);
	}
	
	public double subtrai(  ) {
		return( this.valorA - this.valorB);
	}
	
	public double multiplica(  ) {
		return( this.valorA * this.valorB);
	}
	
	public double divide(  ) {
		
		if ( valorB == 0) {
			throw new DivisaoPorZeroExecption("Não pode dividir por zero!");
		}
		
		return( this.valorA / this.valorB);
	}
		
	public double getValorA() {
		return(this.valorA);
	}
	
	public void setValorA(double valor ) {
		this.valorA = valor;
	}

	public double getValorB() {
		return(this.valorB);
	}
	
	public void setValorB(double valor ) {
		this.valorB = valor;
	}
	

}
