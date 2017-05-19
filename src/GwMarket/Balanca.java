package GwMarket;

public class Balanca extends ItemDeLista{

    private String id;
    private String descricao;
    private double peso;

    public Balanca() {
    }
    
    public Balanca(String id, String descricao) {
        
        this.id = id;
        this.descricao = descricao;
        
    }

    public Balanca(String id, String descricao, double peso) {
        this.id = id;
        this.descricao = descricao;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String toString(){   
        return("Codigo : "+getId()+", Descrição : "+ ", Peso : "+getPeso());
    }

}
