/**
 * 
 */
package primeiraListaDeProblemas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author diego
 *
 */
public class ValorComImpostos {

	/**
	 * @param args
	 */
	
	public static final String[] codigosDeAumento = { "1 - 10%", "2 - 25%", "3 - 30%", "4 - 50%" };
	
	public static final double AUMENTO_1 = 0.01;
	public static final double AUMENTO_2 = 0.25;
	public static final double AUMENTO_3 = 0.3;
	public static final double AUMENTO_4 = 0.5;
	
	public static final double IMP_1000_TO_5000 = 0.01;
	public static final double IMP_5000_TO_10000 = 0.02;
	public static final double IMP_MORE_10000 = 0.03;
	
	public static void main(String[] args) {

		String cValorDoProduto;
		String cEscolha ; 

		double nValorDoProduto, taxa, totalSemImpostos, totalComImpostos; 		
		int aumento;

		cValorDoProduto = JOptionPane.showInputDialog("Digite o Valor do Produto: ").replace(',', '.') ;
		nValorDoProduto = Double.parseDouble(cValorDoProduto);
		
		JFrame frame = new JFrame("Escolha o código de aumento");				
		cEscolha = (String) JOptionPane.showInputDialog(frame, 
		        "Qual o código de aumento?",
		        "Código de aumento",
		        JOptionPane.QUESTION_MESSAGE, 
		        null, 
		        codigosDeAumento, 
		        codigosDeAumento[0]);

		aumento = Integer.parseInt(cEscolha.substring(0,1));
					
		switch( aumento ) {
			case 1:
				taxa = AUMENTO_1;
				break;
			case 2:
				taxa = AUMENTO_2;
				break;
			case 3:
				taxa = AUMENTO_3;
				break;
			case 4:
				taxa = AUMENTO_4;
				break;
			default :
				taxa = 0.0;
				break;
		}
			
		// Aplica-se o aumento escolhido
		totalSemImpostos = nValorDoProduto + ( nValorDoProduto * taxa);

		// Aplica-se a tributação
		if( totalSemImpostos >= 1000 && totalSemImpostos <= 5000 ) {
			totalComImpostos = totalSemImpostos + ( totalSemImpostos * IMP_1000_TO_5000 );
		}
		else if( totalSemImpostos >= 5000.01 && totalSemImpostos <= 10000 ) {
			totalComImpostos = totalSemImpostos + ( totalSemImpostos * IMP_5000_TO_10000);
		}
		else if( totalSemImpostos >= 1000.01  ) {
			totalComImpostos = totalSemImpostos + ( totalSemImpostos * IMP_MORE_10000);
		}
		else {
			totalComImpostos = totalSemImpostos;
		}
		
		JOptionPane.showMessageDialog(null, "O valor total do produto com impostos é " + totalComImpostos, "Totais",
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0); 

	}

}
