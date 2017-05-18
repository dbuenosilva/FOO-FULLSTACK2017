package GwMarket;

public class UnidadeDeMedida {

    private int id;
    private String descricao;
    private boolean utilizaBalaca;

    public UnidadeDeMedida() {
    }

    public UnidadeDeMedida(int id, String descricao, boolean utilizaBalanca) {
        this.id = id;
        this.descricao = descricao;
        this.utilizaBalaca = utilizaBalanca;
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

    public boolean isUtilizaBalaca() {
        return utilizaBalaca;
    }

    public void setUtilizaBalaca(boolean utilizaBalaca) {
        this.utilizaBalaca = utilizaBalaca;
    }

}
