package GwMarket;

public class Cliente extends Pessoa {

    private String codigo;
    private String endereco;

    public Cliente(String codigo, String nome, Data nascimento, String cpf, String rg, String endereco) {
        super(nome, nascimento, cpf, rg);
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getCodigo() {
        return (this.codigo);
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return (this.endereco);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return ( getCodigo()+ " - " + super.getNome() );
    }

}
