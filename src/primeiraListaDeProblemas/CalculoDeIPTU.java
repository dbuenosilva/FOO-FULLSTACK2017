/**
 * 
 */
package primeiraListaDeProblemas;

import javax.swing.JOptionPane;

/**
 * @author diego
 *
 */
public class CalculoDeIPTU {

	/**
	 * @param args
	 */
	
	public static final double TAXA_POR_METRO_DE_AREA = 3.80;
	public static final double TAXA_POR_METRO_CONTRUIDO = 5.00;
	
	public static void main(String[] args) {
	
		double nAreaTotal      = Double.parseDouble(JOptionPane.showInputDialog("Área Total (m2): ").replace(',', '.'));
		double nAreaConstruida = Double.parseDouble(JOptionPane.showInputDialog("Área Construída (m2): ").replace(',', '.'));
			
		JOptionPane.showMessageDialog(null, "IPTU:   " +  ( ( (nAreaTotal - nAreaConstruida) * TAXA_POR_METRO_DE_AREA )  + ( nAreaConstruida * TAXA_POR_METRO_CONTRUIDO ) ) ,"Calculo do IPTU",
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0); 
		

	}

}
