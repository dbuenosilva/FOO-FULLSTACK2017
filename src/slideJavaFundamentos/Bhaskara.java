/**
 * 
 */
package slideJavaFundamentos;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author diego
 *
 */
public class Bhaskara {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws IOException {
		
		double a = 0;
		double b = 0;
		double c = 0;
		double x1= 0;
		double x2= 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o coeficiente do termo que possui a incógnita ao quadrado (x2): " );
        a = Double.parseDouble(scan.nextLine());
		System.out.println("Número " + a + " registrado.");

		System.out.println("Digite coeficiente do termo que possui a incógnita (x): " );
        b = Double.parseDouble(scan.nextLine());
		System.out.println("Número " + b + " registrado.");
        
  
		System.out.println("Digite o coeficiente do termo independente: " );
        c = Double.parseDouble(scan.nextLine());
		System.out.println("Número " + c + " registrado.");
		
		//Bhaskara
		x1 = ( - b + Math.sqrt( (b*b) - 4 * a * c  ) ) / 2 * a;
		x2 = ( - b - Math.sqrt( (b*b) - 4 * a * c  ) ) / 2 * a;
		
		System.out.println("O valor de X1 é " + x1 );
		System.out.println("\n\n");
		System.out.println("O valor de X2 é " + x2 );

	}

}
