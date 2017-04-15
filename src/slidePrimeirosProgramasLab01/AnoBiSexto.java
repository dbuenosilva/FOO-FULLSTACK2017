/**
 * 
 */
package slidePrimeirosProgramasLab01;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class AnoBiSexto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite o ano: " );
		int ano = Integer.parseInt(scan.nextLine());
		
		if (ano < 400 && (ano % 4 == 0)  ) { 
			System.out.println("Ano é bissexto!");
		}
		else if ( ano >= 400 && (ano % 4 == 0) && ano % 100 != 0)
			System.out.println("Ano é bissexto!");
		else
			System.out.println("Ano não é bissextto!");
	}
}
