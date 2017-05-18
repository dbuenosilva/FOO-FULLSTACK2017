/**
 * 
 */
package GwMarket;

/**
 * @author diego
 *
 */
public class testaAsListas {

	/**
	 * 
	 */
	public testaAsListas() {
		// TODO Stub de construtor gerado automaticamente
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		Cliente d;
		
		Cliente c = new Cliente(1, "Diego", new Data(23,07,1983), "938.317.651-20", "4125393", "Rua T-64");		
		ListaDeObjetos cadastroDeClientes = new ListaDeObjetos();	
		
		cadastroDeClientes.adicionaNaLista(c);
	
		cadastroDeClientes.getLista().remove(c);
		
		
		
		
	}

}
