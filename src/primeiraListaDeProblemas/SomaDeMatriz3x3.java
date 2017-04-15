/**
 * 
 */
package primeiraListaDeProblemas;

import javax.swing.JOptionPane;

/**
 * @author diego
 *
 */
public class SomaDeMatriz3x3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String matrizImpressa = " \n\n[ ";
		
		int matrizA[][] = new int[3][3];
		int matrizB[][] = new int[3][3];
		int matrizR[][] = new int[3][3];
		 
		// preenche a matriz A
		for(int j = 0; j < (matrizA.length); j++) {
			for( int k = 0; k < matrizA[j].length; k++) {
				matrizA[j][k] =  Integer.parseInt( JOptionPane.showInputDialog("Valor MatrizA[" + ( j + 1) + "][" + ( k + 1) + "] : ") );
			}
		}
		
		// preenche a matriz B
		for(int j = 0; j < (matrizB.length); j++) {
			for( int k = 0; k < matrizB[j].length; k++) {
				matrizB[j][k] =  Integer.parseInt( JOptionPane.showInputDialog("Valor MatrizB[" + ( j + 1) + "][" + ( k + 1) + "] : ") );
			}
		}

		// Soma as Matrizes
		for(int j = 0; j < (matrizR.length); j++) {
			matrizImpressa += "[ ";
			for( int k = 0; k < matrizR[j].length; k++) {
				matrizR[j][k] = matrizA[j][k] + matrizB[j][k];
				
				// formata impressão da matriz
				if (k + 1 == matrizR[j].length )
					matrizImpressa += "  " + matrizR[j][k] + " ]";
				else
					matrizImpressa += "  " + matrizR[j][k] + ", ";
			}
			if (j + 1 < matrizR[j].length )
				matrizImpressa += ", \n";
		}
		matrizImpressa += " ] ";
		
		JOptionPane.showMessageDialog(null, "O soma da MatrizA com MatrizB é " + matrizImpressa,"Soma de Matrizes 3x3",
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0); 
		
	}

}
