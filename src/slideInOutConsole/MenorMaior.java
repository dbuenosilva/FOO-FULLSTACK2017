/**
 * 
 */
package slideInOutConsole;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class MenorMaior {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite o primeiro número : " );
		double a = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o segundo número : " );
		double b = Double.parseDouble(scan.nextLine());
		
		System.out.println("O maior número é " + Math.max(a, b) + " e o menor número é " + Math.min(a, b));
			
	}

}
