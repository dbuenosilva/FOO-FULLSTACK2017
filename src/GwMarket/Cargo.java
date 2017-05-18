package GwMarket;

public class Cargo {

    private int id;
    private String descricao;
    private boolean acessoVenda;
    private boolean acessoAoEstoque;
    
    public Cargo(){}
    
    public Cargo(int id,String descricao,boolean acessoVenda,boolean acessoAoEstoque){
        this.id =id;
        this.descricao=descricao;
        this.acessoVenda=acessoVenda;
        this.acessoAoEstoque=acessoAoEstoque;
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

    public boolean getAcessoVenda() {
        return acessoVenda;
    }

    public void setAcessoVenda(boolean acessoVenda) {
        this.acessoVenda = acessoVenda;
    }

    public boolean getAcessoAoEstoque() {
        return acessoAoEstoque;
    }

    public void setAcessoAoEstoque(boolean acessoAoEstoque) {
        this.acessoAoEstoque = acessoAoEstoque;
    }

}
