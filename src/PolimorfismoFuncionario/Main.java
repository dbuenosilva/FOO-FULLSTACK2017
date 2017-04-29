/**
 * 
 */
package PolimorfismoFuncionario;

/**
 * @author diego
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Stub de construtor gerado automaticamente
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double valorTotalDaFolhaDePagamento = 0;
		
		Funcionario[] funcionarios = new Funcionario[10];
				
		funcionarios[0] = new Horista(1,"Jose Horista",40, 80.00);
		funcionarios[1] = new Horista(2,"Joao Horista",20, 80.00);
	
		funcionarios[2] = new Gerente(3,"Jose Gerente",1000.00, 3500.00);
		
		funcionarios[3] = new Administrador(4,"Jose Administrador", 3500.00);
		funcionarios[4] = new Administrador(5,"Maria Administrador", 4500.00);
		funcionarios[5] = new Administrador(6,"Luana Administrador", 1500.00);
		funcionarios[6] = new Administrador(7,"Juliana Administrador", 2500.00);
		
		funcionarios[7] = new Comissionado(8,"Jose Comissionado", 150, 3500.00);
		funcionarios[8] = new Comissionado(8,"Maria Comissionada", 100, 1200.00);
		funcionarios[9] = new Comissionado(8,"Joana Comissionada", 180, 4000.00);
		
		
		for(Funcionario funcionario : funcionarios ) {
			valorTotalDaFolhaDePagamento += funcionario.salarioBase;			
		}
		
		
		System.out.println("O valor total da Folha de Pagamento é R$ " + valorTotalDaFolhaDePagamento);
		

	}

}
