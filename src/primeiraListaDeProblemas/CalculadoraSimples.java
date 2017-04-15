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
public class CalculadoraSimples {

	/**
	 * @param args
	 */
	

	public static final String[] operacoesAritimeticas = { "+ Soma", "- Subtração", "* Multiplicação", "/ Divisão" };
	
	public static void main(String[] args) {
		
		String sOperacao ; 

		double a, b, resultado = 0; 		

		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: ").replace(',', '.'));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: ").replace(',', '.')) ;
		
		JFrame frame = new JFrame("Escolha a Operação Aritimética");				
		sOperacao = (String) JOptionPane.showInputDialog(frame, 
		        "Qual operação executar?",
		        "Operações",
		        JOptionPane.QUESTION_MESSAGE, 
		        null, 
		        operacoesAritimeticas, 
		        operacoesAritimeticas[0]);

		char cOperacao = sOperacao.charAt(0);
		
		switch( cOperacao ) {
			case '+':
				resultado = a + b;
				break;
			case '-':
				resultado = a - b;
				break;
			case '*':
				resultado = a * b;
				break;
			case '/':
			{
				if ( b == 0) {
					JOptionPane.showMessageDialog(null, "Não é possível dividi " + a + " por zero!", "Total",
							JOptionPane.PLAIN_MESSAGE);
					System.exit(0); 
				}
				else {
					resultado = a / b;
				}
					
			}
				break;
			default :
				resultado = 0.0;
				break;
		}
		
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Total",
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0); 
		
	}

}
