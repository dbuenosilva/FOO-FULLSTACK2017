/**
 * 
 */
package slidePrimeirosProgramasLab01;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class MenorNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite o primeiro número : " );
		double a = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o segundo número : " );
		double b = Double.parseDouble(scan.nextLine());
		
		System.out.println("O menor número é " + Math.min(a, b));
			

	}

}
