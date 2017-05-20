package GwMarket;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        View view = new View();

        view.setOpcao(view.viewInicial());

        while (!view.getOpcao().equals("0")) {

            if (view.getOpcao().equals("0") || (view.getOpcao().equals("1") || (view.getOpcao().equals("2") || (view.getOpcao().equals("3") || (view.getOpcao().equals("4")))))) {

                if (view.getOpcao().equals("1")) { //Se Cadastro.
                    view.setOpcao2(view.subview());
                    if ((view.getOpcao2().equals("0")) || (view.getOpcao2().equals("1")) || (view.getOpcao2().equals("2"))
                            || (view.getOpcao2().equals("3")) || (view.getOpcao2().equals("4")) || (view.getOpcao2().equals("5")) || (view.getOpcao2().equals("6"))
                            || (view.getOpcao2().equals("7")) || (view.getOpcao2().equals("8"))) {

                        if (view.getOpcao2().equals("1")) {
                            view.cadFormaPagto();
                        } else if (view.getOpcao2().equals("2")) {
                            view.cadUnidadeDeMedida();
                        } else if (view.getOpcao2().equals("3")) {
                            view.cadProduto();
                        } else if (view.getOpcao2().equals("4")) {
                            view.cadCargo();
                        } else if (view.getOpcao2().equals("5")) {
                            view.cadFuncionario();
                        } else if (view.getOpcao2().equals("6")) {
                            view.cadCliente();
                        } else if (view.getOpcao2().equals("7")) {
                            view.cadBalanca();
                        } else if (view.getOpcao2().equals("8")) {
                            view.cadCaixa();
                        } else if (view.getOpcao2().equals("0")) {
                            view.setOpcao(view.viewInicial());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor digite uma opção correta.");
                        view.setOpcao2(view.subview());
                    }
                }
                if (view.getOpcao().equals("2")) {//Se Relatorios.
                    view.setOpcao2(view.subview());
                    if ((view.getOpcao2().equals("0")) || (view.getOpcao2().equals("1")) || (view.getOpcao2().equals("2"))
                            || (view.getOpcao2().equals("3")) || (view.getOpcao2().equals("4")) || (view.getOpcao2().equals("5")) || (view.getOpcao2().equals("6"))
                            || (view.getOpcao2().equals("7")) || (view.getOpcao2().equals("8") || (view.getOpcao2().equals("9") || (view.getOpcao2().equals("10"))))) {

                        if (view.getOpcao2().equals("1")) {
                            view.relFormaPagto();
                        } else if (view.getOpcao2().equals("2")) {
                            view.relUnidadeDeMedida();
                        } else if (view.getOpcao2().equals("3")) {
                            view.relProduto();
                        } else if (view.getOpcao2().equals("4")) {
                            view.relCargo();
                        } else if (view.getOpcao2().equals("5")) {
                            view.relFuncionario();
                        } else if (view.getOpcao2().equals("6")) {
                            view.relCliente();
                        } else if (view.getOpcao2().equals("7")) {
                            view.relBalanca();
                        } else if (view.getOpcao2().equals("8")) {
                            view.relCaixa();
                        } else if (view.getOpcao2().equals("9")) {
                            view.relCompra();
                        } else if (view.getOpcao2().equals("10")) {
                            view.relVenda();
                        } else if (view.getOpcao2().equals("0")) {
                            view.setOpcao(view.viewInicial());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor digite uma opção correta.");
                        view.setOpcao(view.viewInicial());

                    }
                }

                if (view.getOpcao().equals("3")) {//Se venda
                    view.venda();
                    view.setOpcao(view.viewInicial());
                }
                if (view.getOpcao().equals("4")) {//Se venda

                    view.compra();
                    view.setOpcao(view.viewInicial());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite uma opção correta.");
                view.setOpcao(view.viewInicial());
            }
        }
    }
}
