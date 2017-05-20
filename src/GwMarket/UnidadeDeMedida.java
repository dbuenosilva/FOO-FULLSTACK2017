package GwMarket;

public class UnidadeDeMedida extends ItemModel{

    private String id;
    private String descricao;
    private boolean utilizaBalanca;

    public UnidadeDeMedida() {
    }
    
       
    public UnidadeDeMedida(  String id  ){
        this.id=id;
    }

    public UnidadeDeMedida(  String id , String descricao, boolean utilizaBalanca) {
        this.id = id;
        this.descricao = descricao;
        this.utilizaBalanca = utilizaBalanca;
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

    public boolean isUtilizaBalanca() {
        return utilizaBalanca;
    }

    public void setUtilizaBalanca(boolean utilizaBalaca) {
        this.utilizaBalanca = utilizaBalaca;
    }
    
   @Override
    public String toString(){  
        return(getId()+" - "+getDescricao() );
    }
}
