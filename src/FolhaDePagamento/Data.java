
package FolhaDePagamento;
public class Data {

    private int dia = 0;
    private int mes = 0;
    private int ano = 0;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {}
    
     public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;    }   
    

    public String toString() {
        return(this.dia + "/" + this.mes + "/" + this.ano);
    }
}
