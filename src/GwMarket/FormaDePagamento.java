package GwMarket;

public class FormaDePagamento extends ItemDeLista {

    private String id;
    private String descricao;
    private boolean permiteTroco;
    
    public FormaDePagamento(){}
    
    public FormaDePagamento(String id, String descricao, boolean permiteTroco){
        
        this.id = id;
        this.descricao=descricao;
        this.permiteTroco = permiteTroco;
        
    }

    public String getId() {
        return(this.id);
    }

    public void setId( String id) {
        this.id = id;
    }

    public String getDescricao() {
        return(this.descricao);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getPermiteTroco() {
        return(this.permiteTroco);
    }

    public void setPermiteTroco(boolean permiteTroco) {
        this.permiteTroco = permiteTroco;
    }
    
    @Override
    public String toString(){  
        return( getId() + " - " + getDescricao() + "\n");
    }
}
   