/**
 * 
 */
package slidePrimeirosProgramasLab01;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class MediaFinalIC {

	/**
	 * @param args
	 */
	
	final static int p1 = 0;
	final static int p2 = 1;
	final static int p3 = 2;
	final static int nt = 3;
	
	public static void main(String[] args) {
		
		double notas[] = new double[4];
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite a P1: " );
		notas[p1] = Double.parseDouble(scan.nextLine());
        
		System.out.println("Digite a P2: " );
		notas[p2] = Double.parseDouble(scan.nextLine());
        
		System.out.println("Digite a P3: " );
		notas[p3] = Double.parseDouble(scan.nextLine());
        
		System.out.println("Digite a NT: " );
		notas[nt] = Double.parseDouble(scan.nextLine());
        
		double media = ( ((notas[p1] * 0.2) + (notas[p2] * 0.3) + (notas[p3] * 0.5)) * 0.85 ) + (notas[nt] * 0.15);     
		
		System.out.println("O média final do aluno em Indrodução a Computação é " +  media);
			
		
	}

}
