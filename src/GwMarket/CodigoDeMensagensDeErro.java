/**
 * 
 */
package GwMarket;

/**
 * @author diego
 *
 */
public class CodigoDeMensagensDeErro  {

	/**
	 * 
	 */
	private int codigo;
	private String descricao;
	
	
	public CodigoDeMensagensDeErro(int codigo, String descricao ) {

		this.codigo = codigo;
		this.descricao = descricao;
		
	}
	
	public String getDescricao() {
		return(this.descricao);
	}
	
	public int getCodigo(){
		return(this.codigo);
	}
	
	public String toString(){
		return(this.getCodigo() + " - " + this.getDescricao() );
	}

}
