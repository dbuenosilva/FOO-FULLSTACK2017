/**
 * 
 */
package primeiraListaDeProblemas;

import javax.swing.JOptionPane;

/**
 * @author diego
 *
 */
public class Matriz5x7 {

	/**
	 * @param args
	 */
	private final static int MAIOR_ELEMENTO 	   = 0;
	private final static int LINHA_MAIOR_ELEMENTO  = 1;
	private final static int COLUNA_MAIOR_ELEMENTO = 2;
	
	public static void main(String[] args) {
		
		int matriz[][] = new int[5][7];
		int maiorElemento[] = new int[3]; 
		
		// preenche a matriz
		for(int j = 0; j < (matriz.length); j++) {
			for( int k = 0; k < matriz[j].length; k++) {
				matriz[j][k] =  Integer.parseInt( JOptionPane.showInputDialog("Valor [" + ( j + 1) + "][" + ( k + 1) + "] : ") );
			}
		}
		
		// obtem maoir elementro
		for(int j = 0; j < (matriz.length); j++) {
			for( int k = 0; k < matriz[j].length; k++) {
				if (matriz[j][k] > maiorElemento[MAIOR_ELEMENTO] ) {
					maiorElemento[MAIOR_ELEMENTO] = matriz[j][k];
					maiorElemento[LINHA_MAIOR_ELEMENTO] = j + 1;
					maiorElemento[COLUNA_MAIOR_ELEMENTO] = k + 1;
					
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, "O maior elemento digita na matriz é " + maiorElemento[MAIOR_ELEMENTO] 
				+ ". Esta na linha " + maiorElemento[LINHA_MAIOR_ELEMENTO] + " e coluna " + maiorElemento[COLUNA_MAIOR_ELEMENTO],"Maior Elemento na Matriz 5x7",
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0); 
	}
	
}
