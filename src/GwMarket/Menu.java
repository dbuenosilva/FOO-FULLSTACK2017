package GwMarket;

import javax.swing.JOptionPane;

public class Menu {

    ListaDeFormasDePgto list = new ListaDeFormasDePgto();
    FormaDePagamento formaDePagamento = new FormaDePagamento();
    private String impressao;

    public int menuInicial() {
        String opcaoDeMenuEmCaracter = JOptionPane.showInputDialog(null, "Seja Bem Vindo ! \n"
                + "Menu de opções: \n"
                + "0 - Sair\n"
                + "1 - Cadastros \n"
                + "2 - Relatórios \n");
        int opcaoDeMenuEmNumeros = Integer.parseInt(opcaoDeMenuEmCaracter);
        return (opcaoDeMenuEmNumeros);
    }

    public int subMenu() {
        String opcaoDeMenuEmCaracter = JOptionPane.showInputDialog(null, "Digite 0 para Voltar ao menu inicial \n"
                + "1 - Forma de Pagamento \n"
                + "2 - Produtos \n"
                + "3 - Clientes \n"
                + "4 - Venda \n"
                + "5 - Relatórios \n");

        int opcaoDeMenuEmNumerosSub = Integer.parseInt(opcaoDeMenuEmCaracter);
        return (opcaoDeMenuEmNumerosSub);
    }

    public void cadFormaPagto() {
        String codigoEmCaracter = JOptionPane.showInputDialog("Digite o codigo da Forma de pagamento.");
        int codigoEmNumeros = Integer.parseInt(codigoEmCaracter);
        String descricao = JOptionPane.showInputDialog("Digite a descrição da forma de Pagamento");
        String permiteTrocoEmCaracter = JOptionPane.showInputDialog("Deseja troco :\n"
                + "1 - Sim \n"
                + "2 - Não \n");
        int permiteTrocoEmNumeros = Integer.parseInt(permiteTrocoEmCaracter);
        if (permiteTrocoEmNumeros == 1) {
            boolean resultPermiteTroco = true;
            list.list.add(new FormaDePagamento(codigoEmNumeros, descricao, resultPermiteTroco));
        } else {
            boolean resultPermiteTroco = false;
            list.list.add(new FormaDePagamento(codigoEmNumeros, descricao, resultPermiteTroco));
        }
    }

    public void relFormaPagto() {
        int n = list.list.size();
        for (int i = 0; i < n; i++) {
            String Logico = list.list.get(i).getPermiteTroco() != true ? ", Troco : Não" : ", Troco : Sim";
            this.impressao += list.list.get(i).mostraDados() + Logico + "\n";
        }
        JOptionPane.showMessageDialog(null,this.impressao);
        this.impressao = "";
        String Logico = "";
    }

}
