package primeiraListaDeProblemas;

import javax.swing.JOptionPane;

public class FolhaDePagamento {

	private final static double PROPORCAO_DEPENDENTE = 50;
	private final static double LIMITE_INSS = 1000;
	private final static double TAXA_1_INSS = 0.085;
	private final static double TAXA_2_INSS = 0.09;
	private final static double TAXA_1_IRRF = 0.05;
	private final static double TAXA_2_IRRF = 0.07;
	
	public static void main(String[] args) {
		
		double nHoras = Double.parseDouble(JOptionPane.showInputDialog("Horas trabalhadas: ").replace(',', '.'));
		double nSalarioHora = Double.parseDouble(JOptionPane.showInputDialog("Salário Hora (R$): ").replace(',', '.'));
		int nDependentes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Dependentes: "));
		
		double salario = getSalarioBruto(nHoras, nSalarioHora, nDependentes);
		double inss = getDescontoINSS(salario);  
		double irrf = getDescontoIRRF(salario);
		
		JOptionPane.showMessageDialog(null, "Salário Bruto   " + salario + "\n" 
										+	"INSS            " + inss    + "\n"
										+   "IRRF            " + irrf    + "\n"
										+   "Salário Líquido " + (salario - inss - irrf)
				, "HOLERITE",
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0); 
		
	

	}
	
	private static double getSalarioBruto( double nHoras, double nSalarioHora, int nDependentes ) {
		//Salário Bruto: Horas trabalhadas * salário hora + (50 * número de dependentes)
		
		return( ( nHoras * nSalarioHora ) + ( PROPORCAO_DEPENDENTE * nDependentes ) );
	}
	
	
	private static double getDescontoINSS( double nSalarioBruto ) {
		// Se salário bruto <= 1000 INSS=salário bruto * 8.5/100 
		//Se salário bruto > 1000 INSS=salário bruto * 9/100
		
		if (nSalarioBruto <= LIMITE_INSS) {
			return( nSalarioBruto * TAXA_1_INSS);
		}
		else {
			return( nSalarioBruto * TAXA_2_INSS);
		}
		
	}
	
	private static double getDescontoIRRF( double nSalarioBruto ) {
		
		//Se salário bruto <= 500 IR=0
		//Se salário bruto > 500 e <= 1000 IR=salário bruto*5/100 
		//Se salário bruto > 1000 IR=salário bruto*7/100
		
		if (nSalarioBruto > 500 && nSalarioBruto <= 1000) {
			return( nSalarioBruto * TAXA_1_IRRF );
		}
		else if ( nSalarioBruto > 1000 ) {
			return( nSalarioBruto * TAXA_2_IRRF );
		}
		
		return(0.0);
		
	}
}