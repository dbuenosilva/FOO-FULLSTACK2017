/**
 * 
 */
package primeiraListaDeProblemas;

import javax.swing.JOptionPane;

/**
 * @author diego
 *
 */
public class VetorDe50ElementosReais {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double vetor[] = new double[50];
		String vetorImpresso = " [ ";
		
		// Preenche o vetor
		for( int i = 0; i < vetor.length; i++){
			
			if ( i == 0 || i == vetor.length )
				vetor[i] = 100.00;
			else
				vetor[i] = Math.pow(i - 1, 2) + Math.sqrt(i + 1) ;
	
			// formata impressão do vetor
			if (i + 1 == vetor.length )
				vetorImpresso += "  " + vetor[i] + " ]";
			else
				vetorImpresso += "  " + vetor[i] + ", \n ";
			
		}
		
		JOptionPane.showMessageDialog(null, vetorImpresso ,"Vetor de 50 Elementos Reais",
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0); 
		

	}

}
