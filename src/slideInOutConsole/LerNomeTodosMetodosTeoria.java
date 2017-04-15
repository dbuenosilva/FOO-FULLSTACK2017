/**
 * 
 */
package slideInOutConsole;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class LerNomeTodosMetodosTeoria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome: " );
        String a = (scan.nextLine());

        System.out.println("O nome digitado em maiúsculo: " + a.toUpperCase() );
        System.out.println("O nome digitado em minúsculo: " + a.toLowerCase() );
        System.out.println("O nome digitado contém " + a.length() + " caracteres."); 
        System.out.println("O nome digitado entre parênteses: " + "(".concat(a).concat(")")  );
        System.out.println("O nome digitado tem primeiro caracter : " + a.charAt(0));
        System.out.println("O nome digitado é igual à Gwaya? " + a.equalsIgnoreCase("Gwaya"));
        System.out.println("O nome digitado tem os 3 primeiros caracteres : " + a.substring(0, 3) );
        System.out.println("O nome digitado sem espaços em branco: " + a.trim());
        System.out.println("Criptografando o nome digitado : " + a.replace('a', '@').replace('i', '1').replace('e','3').replace('o', '0') );
        System.out.println("A última ocorrencia da lebra 'a' ocorreu no character de posição " + a.lastIndexOf('a'));
	}

}
