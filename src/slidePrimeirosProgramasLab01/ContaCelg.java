/**
 * 
 */
package slidePrimeirosProgramasLab01;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class ContaCelg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite o consumo de engercia em quilowatts : " );
		double consumo = Double.parseDouble(scan.nextLine());
        System.out.println("Digite o valor unitário do quilowatts cobrado pela CELG : " );
		double valorUnitario = Double.parseDouble(scan.nextLine());
		
		double conta = consumo * valorUnitario;
		conta = conta - ( conta * 0.10 );
				
		System.out.println("Sua conta, com os 10% de desconto é de R$ " + conta );
		

	}

}
