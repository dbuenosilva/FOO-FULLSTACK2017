/**
 * 
 */
package slideJavaFundamentos;

/**
 * @author diego
 *
 */
public class FatorialDe1a10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int fatorial = 1;
		
		for( int i = 1; i <= 10; i++ )
		{ 
		     fatorial *= i;
		     System.out.println( "O fatorial de " + i + " é igual a " + fatorial );
		}
		
	}

}
