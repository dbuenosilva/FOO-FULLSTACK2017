/**
 * 
 */
package FolhaDePagamento;

/**
 * @author diego
 *
 */
public class TestaCadastro {

	/**
	 * 
	 */
	public TestaCadastro() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CadastroPessoas pessoas = new CadastroPessoas();
		
		pessoas.cadastrarPessoa( new Funcionario("Adryano", new Data( 23, 07, 1983) , 1000) );
		pessoas.cadastrarPessoa(new Gerente("Tarcisio", new Data( 14, 07, 1995) , 2500, "Scrum") );
		pessoas.cadastrarPessoa( new Cliente("Diego Bueno", new Data( 23, 07, 1983 ), 1 ) );

		pessoas.imprimeCadastro();
		
		System.out.println(pessoas.getQtdAtual() + " pessoas cadastradas!");
		
		
	}

}
