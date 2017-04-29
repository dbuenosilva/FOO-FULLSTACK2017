package PolimorfismoFuncionario;

public abstract class Funcionario {
	
	
	private int matricula;
	private String nome;
	protected double salarioBase;
	
	Funcionario() {
		matricula = 0;
		nome = "";
		salarioBase = 0.0;
	}
	
	public abstract double calculaSalario();
	
	public int getMatricula() {
		return(this.matricula);
	}

	public void setMatricula( int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return(this.nome);
	}

	public void setNome( String nome) {
		this.nome = nome;
	}

}

