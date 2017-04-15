/**
 * 
 */
package primeiraListaDeProblemas;

import javax.swing.JOptionPane;

/**
 * @author diego
 *
 */
public class Matriz3x3ApartirDoVetorDe9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		int vetor[] = new int[9];
		int matriz[][] = new int[3][3];
		
		String vetorImpresso = " [ ";
		String matrizImpressa = " \n\n[ ";
		
		for( int i = 0; i < vetor.length; i++){
		
			vetor[i]  = Integer.parseInt( JOptionPane.showInputDialog("Valor " + ( i + 1) + ": ") );	
		
			// formata impressão do vetor
			if (i + 1 == vetor.length )
				vetorImpresso += "  " + vetor[i] + " ]";
			else
				vetorImpresso += "  " + vetor[i] + ", ";
			
		}
		
		// preenche a matriz
		for(int j = 0; j < (matriz.length); j++) {
			
			matrizImpressa += "[ ";
			
			for( int g = 0; g < matriz[j].length; g++) {
				matriz[j][g] = vetor[ j + g + (j*2)];
			
				// formata impressão da matriz
				if (g + 1 == matriz[j].length )
					matrizImpressa += "  " + matriz[j][g] + " ]";
				else
					matrizImpressa += "  " + matriz[j][g] + ", ";
				
			}	
			if (j + 1 < matriz[j].length )
				matrizImpressa += ", \n";
			
		}
		matrizImpressa += " ] ";
		
		JOptionPane.showMessageDialog(null, vetorImpresso + matrizImpressa ,"Vetor de 9 Posições e Matriz 3x3",
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0); 
		

	}

}
