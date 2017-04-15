/**
 * 
 */
package primeiraListaDeProblemas;

import javax.swing.JOptionPane;

/**
 * @author diego
 *
 */
public class CalculoDoIMC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double nPeso   = Double.parseDouble(JOptionPane.showInputDialog("Peso (Kg): ").replace(',', '.'));
		double nAutura = Double.parseDouble(JOptionPane.showInputDialog("Autura (m): ").replace(',', '.'));
			
		JOptionPane.showMessageDialog(null, "IMC:   " + nPeso / Math.pow(nAutura, 2),"Calculo do IMC",
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0); 
		
	}

}
