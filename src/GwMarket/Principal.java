package GwMarket;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Menu menu = new Menu();
        String opcao;
        String opcao2;

        opcao = menu.menuInicial();

        while (!opcao.equals("0")) {

            if (opcao.equals("0") || (opcao.equals("1") || (opcao.equals("2") || (opcao.equals("3") || (opcao.equals("4")))))) {

                if (opcao.equals("1")) {//Se Cadastro.
                    opcao2 = menu.subMenu();
                    if ((opcao2.equals("0")) || (opcao2.equals("1")) || (opcao2.equals("2"))
                            || (opcao2.equals("3")) || (opcao2.equals("4")) || (opcao2.equals("5")) || (opcao2.equals("6"))
                            || (opcao2.equals("7")) || (opcao2.equals("8"))) {

                        if (opcao2.equals("1")) {
                            menu.cadFormaPagto();
                        } else if (opcao2.equals("2")) {
                            menu.cadUnidadeDeMedida();
                        } else if (opcao2.equals("3")) {
                            menu.cadProduto();
                        } else if (opcao2.equals("4")) {
                            menu.cadCargo();
                        } else if (opcao2.equals("5")) {
                            menu.cadFuncionario();
                        } else if (opcao2.equals("6")) {
                            menu.cadCliente();
                        } else if (opcao2.equals("7")) {
                            menu.cadBalanca();
                        } else if (opcao2.equals("8")) {
                            menu.cadCaixa();
                        } else if (opcao2.equals("0")) {
                            opcao = menu.menuInicial();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor digite uma opção correta.");
                        opcao2 = menu.subMenu();
                    }
                }
                if (opcao.equals("2")) {//Se Cadastro.
                    opcao2 = menu.subMenu();
                    if ((opcao2.equals("0")) || (opcao2.equals("1")) || (opcao2.equals("2"))
                            || (opcao2.equals("3")) || (opcao2.equals("4")) || (opcao2.equals("5")) || (opcao2.equals("6"))
                            || (opcao2.equals("7")) || (opcao2.equals("8"))) {

                        if (opcao2.equals("1")) {
                            menu.relFormaPagto();
                        } else if (opcao2.equals("2")) {
                            menu.relUnidadeDeMedida();
                        } else if (opcao2.equals("3")) {
                            menu.relProduto();
                        } else if (opcao2.equals("4")) {
                            menu.relCargo();
                        } else if (opcao2.equals("5")) {
                            menu.relFuncionario();
                        } else if (opcao2.equals("6")) {
                            menu.relCliente();
                        } else if (opcao2.equals("7")) {
                            menu.relBalanca();
                        } else if (opcao2.equals("8")) {
                            menu.relCaixa();
                        } else if (opcao2.equals("0")) {
                            opcao = menu.menuInicial();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor digite uma opção correta.");
                        opcao = menu.menuInicial();

                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite uma opção correta.");
                opcao = menu.menuInicial();
            }
        }
    }
}
