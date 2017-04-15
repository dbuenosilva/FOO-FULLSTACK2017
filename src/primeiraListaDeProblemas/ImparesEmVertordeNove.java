/**
 * 
 */
package primeiraListaDeProblemas;

import javax.swing.JOptionPane;

/**
 * @author diego
 *
 */
public class ImparesEmVertordeNove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int vetor[] = new int[9];
		String impares = "";
		
		for( int i = 0; i < vetor.length; i++){
		
			vetor[i]  = Integer.parseInt( JOptionPane.showInputDialog("Valor " + ( i + 1) + ": ") );	
		
			if ( ! (vetor[i] % 2 == 0) ) {
				impares += " Número " + vetor[i] + " na posição " + ( i + 1) + "\n";
			}
			
			
		}
		
		JOptionPane.showMessageDialog(null, impares ,"Número Ímpares informados no vetor",
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0); 
		
		

	}

}
