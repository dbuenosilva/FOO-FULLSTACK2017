package GwMarket;

public class FormaDePagamento extends ItemDeLista {

    private int id;
    private String descricao;
    private boolean permiteTroco;
    
    public FormaDePagamento(){}
    
    public FormaDePagamento(int id, String descricao, boolean permiteTroco){
        
        this.id = id;
        this.descricao=descricao;
        this.permiteTroco = permiteTroco;
        
    }

    public int getId() {
        return(this.id);
    }

    public void setId(int id) {
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
        return("Codigo : "+getId()+", Descrição : "+getDescricao()+( ! this.permiteTroco  ? ", Troco : Não" : ", Troco : Sim")+ "\n");
    }
}
   