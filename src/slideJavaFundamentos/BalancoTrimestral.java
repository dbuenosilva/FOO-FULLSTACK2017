/**
 * 
 */
package slideJavaFundamentos;

/**
 * @author diego
 *
 */
public class BalancoTrimestral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double gastosJaneiro   = 15000.00;
		double gastosFevereiro = 23000.00;
		double gastosMarco	   = 17000.00;
		
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

		System.out.println("Gastos no primeiro Trimestre R$ " + gastosTrimestre );
		double mediaMensal = gastosTrimestre / 3;
		System.out.println("Valor da média mensal = " +  mediaMensal );
		 
	}

}
