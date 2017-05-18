package GwMarket;

public class Funcionario extends Pessoa {

    private int matricula;
    private Cargo cargo;

    public Funcionario(int matricula, String nome, Data nascimento, String cpf, String rg, Cargo cargo) {
        super(nome, nascimento, cpf, rg);
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public int getMatricula() {
        return (this.matricula);
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return (this.cargo);
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {

        return ("Matricula : " + this.getMatricula() + ", Nome : " + this.getNome() + ", Nascimento : " + getNascimento() + ", Cargo : " + getCargo()+ ", Cpf : " + getCPF() + ", Rg : " + getRg() + "\n");

    }

}
