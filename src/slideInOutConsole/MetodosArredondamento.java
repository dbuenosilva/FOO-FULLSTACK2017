/**
 * 
 */
package slideInOutConsole;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class MetodosArredondamento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número fracionário (real): " );
        double a = Double.parseDouble(scan.nextLine());
        
        System.out.println("Arredondando o número " + a + " com médoto Math.round: " + Math.round(a) );

        System.out.println("Arredondando o número " + a + " com médoto Math.ceil: " + Math.ceil(a) );
       
        System.out.println("Arredondando o número " + a + " com médoto Math.floor: " + Math.floor(a) );
        
	}

}
