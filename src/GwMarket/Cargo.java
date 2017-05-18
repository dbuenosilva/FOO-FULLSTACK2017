package GwMarket;

public class Cargo extends ItemDeLista {

    private int id;
    private String descricao;
    private boolean acessoVenda;
    private boolean acessoAoEstoque;

    public Cargo() {
    }
    
    public Cargo (int id){
        this.id= id;
    }

    public Cargo(int id, String descricao, boolean acessoVenda, boolean acessoAoEstoque) {
        this.id = id;
        this.descricao = descricao;
        this.acessoVenda = acessoVenda;
        this.acessoAoEstoque = acessoAoEstoque;
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

    @Override
    public String toString() {
        return ("Codigo : " + getId() + ", Descrição : " + getDescricao() + (!this.getAcessoVenda() ? ", Vai ter acesso a Venda ? Não" : ", Vai ter acesso a Venda ? Sim") + (!this.getAcessoAoEstoque() ? ", Vai ter acesso ao estoque ? Não" : ", Vai ter acesso ao estoque ? Sim") + "\n");
    }

}
