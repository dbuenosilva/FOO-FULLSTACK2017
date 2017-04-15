/**
 * 
 */
package slideInOutConsole;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class ValidaNomeTelefone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite o nome : " );
        String nome = scan.nextLine();
			
        System.out.println("Digite o telefone : " );
		String telefone = scan.nextLine().replace('-',' ').replace('(', ' ').replace(')', ' ').trim();
		
		if( isNome( nome) ){
			System.out.println("Nome cadastrado com sucesso!" );
		}
		else {
			System.out.println("Nome contém caracteres inválidos!" );
		}

		if( isTelefone( telefone ) ){
			System.out.println("Telefone cadastrado com sucesso!" );
		}
		else {
			System.out.println("Telefone contém digítos inválidos!" );
		}
		
	}

	private static boolean isNome( String nome) {
		
		if( nome.isEmpty())
			return false;
		
		for( int i = 0; i < nome.length(); i++) {
			
			if (!  Character.isLetter(nome.charAt(i))  && nome.charAt(i) != ' ' )  {
				return false;
			}											
		}		
		return true;
	}
	

	private static boolean isTelefone( String telefone) {
		
		if (telefone.isEmpty())
			return false;
		
		for( int i = 0; i < telefone.length(); i++) {
			
			if (!  Character.isDigit(telefone.charAt(i))   && telefone.charAt(i) != ' ') {
				return false;
			}											
		}		
		return true;
	}
	
}
