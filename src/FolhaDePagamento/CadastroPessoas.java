
package FolhaDePagamento;

import java.util.Iterator;
import java.util.LinkedList;

public class CadastroPessoas {

	private int qtdAtual;

	private LinkedList<Pessoa> listaDePessoas = new LinkedList<Pessoa>();
	
	
	// Contrutores
	public CadastroPessoas() {
	
	}

	public CadastroPessoas(Pessoa pess) {
		listaDePessoas.add(pess);
		qtdAtual++;
	}
	//
	
	
	
	
	public void cadastrarPessoa( Pessoa pess) {
		listaDePessoas.add(pess);
		qtdAtual++;
	}
	
	public void imprimeCadastro() {
		
		Iterator i = listaDePessoas.iterator();
		
		while(i.hasNext()) {
			
			Pessoa p = (Pessoa) i.next();
			p.imprimeDados();
			
		//	Pessoa teste = (Cliente) i.next(); => erro de cast Gerente <> Cliente
		//	teste.imprimeDados();
			
		}	
	}
	
	
	
	public int getQtdAtual() {
		return(qtdAtual);
	}
	
	
	
	public LinkedList<Pessoa> getListaDePessoas() {
		return(this.listaDePessoas);
	}



}
