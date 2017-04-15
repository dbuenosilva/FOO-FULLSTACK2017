/**
 * 
 */
package slideInOutConsole;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class QuadradoRaiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite o número : " );
		double a = Double.parseDouble(scan.nextLine());
		
		System.out.println("A raiz quadrada de " + a + " é " + Math.sqrt(a));
		
		System.out.println("O número " + a + " elevado ao quadrado é " + Math.pow(a, 2));
		
	}

}
