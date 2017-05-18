package GwMarket;

public class UnidadeDeMedida extends ItemDeLista{

    private int id;
    private String descricao;
    private boolean utilizaBalanca;

    public UnidadeDeMedida() {
    }
    
       
    public UnidadeDeMedida(int id){
        this.id=id;
    }

    public UnidadeDeMedida(int id, String descricao, boolean utilizaBalanca) {
        this.id = id;
        this.descricao = descricao;
        this.utilizaBalanca = utilizaBalanca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isUtilizaBalanca() {
        return utilizaBalanca;
    }

    public void setUtilizaBalanca(boolean utilizaBalaca) {
        this.utilizaBalanca = utilizaBalaca;
    }
    
   @Override
    public String toString(){  
        return("Codigo : "+getId()+", Descrição : "+getDescricao()+( ! this.utilizaBalanca  ? ", Utiliza Balança ? Não" : ", Utiliza Balança ? Sim")+ "\n");
    }
}
