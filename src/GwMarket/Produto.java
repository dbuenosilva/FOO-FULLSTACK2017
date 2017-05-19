package GwMarket;

public class Produto extends ItemDeLista implements ListadeCodigosDeMensagensDeErros {
    
    private int id;
    private String descricao;
    private UnidadeDeMedida primeiraUnidadeDeMedida;
    private UnidadeDeMedida segundaUnidadeDeMedida;
    private double precoNaPrimeiraUnidadeDeMedida;
    private double fatorDeConversao;
    private char tipoDeConversao;
    private double saldoDoEstoqueNaPrimeiraUnidadeDeMedida;

    public Produto(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Produto(int id, String descricao, UnidadeDeMedida primeiraUnidadaDeMedida, double precoNaPrimeiraUnidadeDeMedida) {
        this.id = id;
        this.descricao = descricao;
        this.primeiraUnidadeDeMedida = primeiraUnidadaDeMedida;
        this.precoNaPrimeiraUnidadeDeMedida = precoNaPrimeiraUnidadeDeMedida;
    }
    
    public Produto(int id, String descricao, UnidadeDeMedida primeiraUnidadeDeMedida, UnidadeDeMedida segundaUnidadeDeMedida, double precoNaPrimeiraUnidadeDeMedida, double fatorDeConversao, char tipoDeConversao, double saldoDoEstoqueNaPrimeiraUnidadeDeMedida) {
        
        this.id = id;
        this.descricao = descricao;
        this.primeiraUnidadeDeMedida = primeiraUnidadeDeMedida;
        this.segundaUnidadeDeMedida = segundaUnidadeDeMedida;
        this.precoNaPrimeiraUnidadeDeMedida = precoNaPrimeiraUnidadeDeMedida;
        this.fatorDeConversao = fatorDeConversao;
        this.tipoDeConversao = tipoDeConversao;
        this.saldoDoEstoqueNaPrimeiraUnidadeDeMedida = saldoDoEstoqueNaPrimeiraUnidadeDeMedida;
    }

    public int getId() {
        return (this.id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return (this.descricao);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public UnidadeDeMedida getPrimeiraUnidadeDeMedida() {
        return (this.primeiraUnidadeDeMedida);
    }

    public void setPrimeiraUnidadeDeMedida(UnidadeDeMedida primeiraUnidadeDeMedida) {
        this.primeiraUnidadeDeMedida = primeiraUnidadeDeMedida;
    }

    public UnidadeDeMedida getSegundaUnidadeDeMedida() {
        return (this.segundaUnidadeDeMedida);
    }

    public void setSegundaUnidadeDeMedida(UnidadeDeMedida segundaUnidadeDeMedida) {
        this.segundaUnidadeDeMedida = segundaUnidadeDeMedida;
    }

    public double getPrecoNaPrimeiraUnidadeDeMedida() {
        return (this.precoNaPrimeiraUnidadeDeMedida);
    }

    public void setPrecoNaPrimeiraUnidadeDeMedida(double precoNaPrimeiraUnidadeDeMedida) {
        this.precoNaPrimeiraUnidadeDeMedida = precoNaPrimeiraUnidadeDeMedida;
    }

    public double getPrecoNaSegundaUnidadeDeMedida() {

        double precoNaSegundaUnidadeDeMedida = 0;

        if (this.tipoDeConversao == 'D') {  // ex.: primeira 1000 g , segunda 1 kg, faltor do tipo D (1000) 
            precoNaSegundaUnidadeDeMedida = (this.precoNaPrimeiraUnidadeDeMedida / this.fatorDeConversao);
        } else if (this.tipoDeConversao == 'M') { // ex.: primeira 1 Kg , segunda 1000 g, faltor do tipo M (1000) 
            precoNaSegundaUnidadeDeMedida = (this.precoNaPrimeiraUnidadeDeMedida * this.fatorDeConversao);
        }

        return (precoNaSegundaUnidadeDeMedida);
    }

    public void setPrecoNaPrimeiraSegundaDeMedida(double precoNaSegundaUnidadeDeMedida) {

        if (this.tipoDeConversao == 'D') {  // ex.: primeira 1000 g , segunda 1 kg, faltor do tipo D (1000) 
            this.precoNaPrimeiraUnidadeDeMedida = precoNaSegundaUnidadeDeMedida * this.fatorDeConversao;
        } else if (this.tipoDeConversao == 'M') { // ex.: primeira 1 Kg , segunda 1000 g, faltor do tipo M (1000) 
            this.precoNaPrimeiraUnidadeDeMedida = precoNaSegundaUnidadeDeMedida / this.fatorDeConversao;
        }

        this.precoNaPrimeiraUnidadeDeMedida = precoNaSegundaUnidadeDeMedida;
    }

    public double getFatorDeConversao() {
        return (this.fatorDeConversao);
    }

    public void setFatorDeConversao(double fatorDeConversao) {
        this.fatorDeConversao = fatorDeConversao;
    }

    public char getTipoDeConversao() {
        return (this.tipoDeConversao);
    }

    public void setTipoDeConversao(char tipoDeConversao) {
        this.tipoDeConversao = tipoDeConversao;
    }

    public double getSaldoDoEstoqueNaPrimeiraUnidadeDeMedida() {
        return (this.saldoDoEstoqueNaPrimeiraUnidadeDeMedida);
    }

    public void setSaldoDoEstoqueNaPrimeiraUnidadeDeMedida(double saldoDoEstoqueNaPrimeiraUnidadeDeMedida) {
        this.saldoDoEstoqueNaPrimeiraUnidadeDeMedida = saldoDoEstoqueNaPrimeiraUnidadeDeMedida;
    }

    public double getSaldoDoEstoqueNaSegundaUnidadeDeMedida() {

        double saldoDoEstoqueNaSegundaUnidadeDeMedida = 0;

        if (this.tipoDeConversao == 'D') {  // ex.: primeira 1000 g , segunda 1 kg, faltor do tipo D (1000) 
            saldoDoEstoqueNaSegundaUnidadeDeMedida = (this.saldoDoEstoqueNaPrimeiraUnidadeDeMedida / this.fatorDeConversao);
        } else if (this.tipoDeConversao == 'M') { // ex.: primeira 1 Kg , segunda 1000 g, faltor do tipo M (1000) 
            saldoDoEstoqueNaSegundaUnidadeDeMedida = (this.saldoDoEstoqueNaPrimeiraUnidadeDeMedida * this.fatorDeConversao);
        }

        return (saldoDoEstoqueNaSegundaUnidadeDeMedida);
    }

    public void setSaldoDoEstoqueNaSegundaUnidadeDeMedida(double saldoDoEstoqueNaSegundaUnidadeDeMedida) {

        if (this.tipoDeConversao == 'D') {  // ex.: primeira 1000 g , segunda 1 kg, faltor do tipo D (1000) 
            this.saldoDoEstoqueNaPrimeiraUnidadeDeMedida = saldoDoEstoqueNaSegundaUnidadeDeMedida * this.fatorDeConversao;
        } else if (this.tipoDeConversao == 'M') { // ex.: primeira 1 Kg , segunda 1000 g, faltor do tipo M (1000) 
            this.saldoDoEstoqueNaPrimeiraUnidadeDeMedida = saldoDoEstoqueNaSegundaUnidadeDeMedida / this.fatorDeConversao;
        }

    }

    public int checarEstoque(double quantidade, UnidadeDeMedida unidadeDeMedida) {
    	
    	if(this.getPrimeiraUnidadeDeMedida().equals(unidadeDeMedida)) {
    		if ( this.saldoDoEstoqueNaPrimeiraUnidadeDeMedida + quantidade >= 0 ) {
    			return(SUCESSO);
    		}
    		else{
    			return(ERR_SALDO);
    		}	
    	}
    	else if(this.getSegundaUnidadeDeMedida().equals(unidadeDeMedida)) {
    		if (this.getSaldoDoEstoqueNaSegundaUnidadeDeMedida() + quantidade >= 0 ) {
    			return(SUCESSO);
    		}
    		else {
    			return(ERR_SALDO);
    		}
    	}
    	
        return(ERR_UNIDADE_MEDIDA);
    }

    public int atualizaEstoque(double quantidade, UnidadeDeMedida unidadeDeMedida) {

    	if(this.getPrimeiraUnidadeDeMedida().equals(unidadeDeMedida)) {
    		this.saldoDoEstoqueNaPrimeiraUnidadeDeMedida += quantidade;		
    	}
    	else if(this.getSegundaUnidadeDeMedida().equals(unidadeDeMedida)) {
    		setSaldoDoEstoqueNaSegundaUnidadeDeMedida( this.getSaldoDoEstoqueNaSegundaUnidadeDeMedida() + quantidade );	
    	}
    	else {
    		return(ERR_UNIDADE_MEDIDA);
    	}
    	return(SUCESSO);
    }

    @Override
    public String toString() {
        return ("Codigo : " + getId() + ", Descrição : " + getDescricao() + ", Primeira Und.Medida" + getPrimeiraUnidadeDeMedida() + ", "
                + "Segunda Und.Medida : " + getSegundaUnidadeDeMedida() + ", " + getPrecoNaPrimeiraUnidadeDeMedida() + ", "
                + "Fator de Conversão : " + getFatorDeConversao() + ", Tipo de Conversão : " + getTipoDeConversao() + ", "
                + "Saldo : " + getSaldoDoEstoqueNaPrimeiraUnidadeDeMedida());
    }

}
