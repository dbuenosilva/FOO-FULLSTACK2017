/**
 * 
 */
package slideJavaFundamentos;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Diego Bueno
 *
 */
public class MaiorMenor {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: " );
        a = Double.parseDouble(scan.nextLine());
		System.out.println("Número " + a + " registrado.");

		System.out.println("Digite o segundo número: " );
        b = Double.parseDouble(scan.nextLine());
		System.out.println("Número " + b + " registrado.");
        
  
		System.out.println("Digite o terceiro número: " );
        c = Double.parseDouble(scan.nextLine());
		System.out.println("Número " + c + " registrado.");

        
    	System.out.println("O maior número digitado é " + Math.max( a, Math.max(b, c)) );
    	
    	System.out.println("O menor número digitado é " + Math.min( a, Math.min(b, c)) );
    	 
	}

}
