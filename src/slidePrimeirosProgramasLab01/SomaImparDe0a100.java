/**
 * 
 */
package slidePrimeirosProgramasLab01;

/**
 * @author diego
 *
 */
public class SomaImparDe0a100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double soma = 0;

		for( int i = 2; i <= 100; i++) {
			
			if ( i % 2 != 0) {
				soma += i;
				System.out.println(" " +  i );
			}
		}
		System.out.println("A soma dos ímpares de 0 à 100 é " +  soma );
	}

}
