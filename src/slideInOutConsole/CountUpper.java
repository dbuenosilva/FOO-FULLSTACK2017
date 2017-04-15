/**
 * 
 */
package slideInOutConsole;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class CountUpper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome: " );
        String a = (scan.nextLine());

        System.out.println("O nome digitado é " + a.toUpperCase() + " e contém " + a.length() + " caracteres.");
        
        
	}

}
