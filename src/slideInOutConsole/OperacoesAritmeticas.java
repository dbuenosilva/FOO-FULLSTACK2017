/**
 * 
 */
package slideInOutConsole;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class OperacoesAritmeticas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite o primeiro número : " );
		double a = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o segundo número : " );
		double b = Double.parseDouble(scan.nextLine());
		
		System.out.println("Soma: " + ( a + b) );
		System.out.println("Substração: " + ( a - b) );
		System.out.println("Multiplicação: " + ( a * b) );
		System.out.println("Divisão: " + ( a / b) );
			

	}

}
