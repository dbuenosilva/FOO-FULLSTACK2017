package GwMarket;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Menu menu = new Menu();
        
        menu.setOpcao(menu.menuInicial() );

        while (! menu.getOpcao().equals("0")) {

            if (menu.getOpcao().equals("0") || (menu.getOpcao().equals("1") || (menu.getOpcao().equals("2") || (menu.getOpcao().equals("3") || (menu.getOpcao().equals("4")))))) {

                if (menu.getOpcao().equals("1")) { //Se Cadastro.
                    menu.setOpcao2(menu.subMenu());
                    if ((menu.getOpcao2().equals("0")) || (menu.getOpcao2().equals("1")) || (menu.getOpcao2().equals("2"))
                            || (menu.getOpcao2().equals("3")) || (menu.getOpcao2().equals("4")) || (menu.getOpcao2().equals("5")) || (menu.getOpcao2().equals("6"))
                            || (menu.getOpcao2().equals("7")) || (menu.getOpcao2().equals("8"))) {

                        if (menu.getOpcao2().equals("1")) {
                            menu.cadFormaPagto();
                        } else if (menu.getOpcao2().equals("2")) {
                            menu.cadUnidadeDeMedida();
                        } else if (menu.getOpcao2().equals("3")) {
                            menu.cadProduto();
                        } else if (menu.getOpcao2().equals("4")) {
                            menu.cadCargo();
                        } else if (menu.getOpcao2().equals("5")) {
                            menu.cadFuncionario();
                        } else if (menu.getOpcao2().equals("6")) {
                            menu.cadCliente();
                        } else if (menu.getOpcao2().equals("7")) {
                            menu.cadBalanca();
                        } else if (menu.getOpcao2().equals("8")) {
                            menu.cadCaixa();
                        } else if (menu.getOpcao2().equals("0")) {
                            menu.setOpcao(menu.menuInicial());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor digite uma opção correta.");
                        menu.setOpcao2(menu.subMenu());
                    }
                }
                if (menu.getOpcao().equals("2")) {//Se Relatorios.
                	menu.setOpcao2( menu.subMenu() );
                    if ((menu.getOpcao2().equals("0")) || (menu.getOpcao2().equals("1")) || (menu.getOpcao2().equals("2"))
                            || (menu.getOpcao2().equals("3")) || (menu.getOpcao2().equals("4")) || (menu.getOpcao2().equals("5")) || (menu.getOpcao2().equals("6"))
                            || (menu.getOpcao2().equals("7")) || (menu.getOpcao2().equals("8"))) {

                        if (menu.getOpcao2().equals("1")) {
                            menu.relFormaPagto();
                        } else if (menu.getOpcao2().equals("2")) {
                            menu.relUnidadeDeMedida();
                        } else if (menu.getOpcao2().equals("3")) {
                            menu.relProduto();
                        } else if (menu.getOpcao2().equals("4")) {
                            menu.relCargo();
                        } else if (menu.getOpcao2().equals("5")) {
                            menu.relFuncionario();
                        } else if (menu.getOpcao2().equals("6")) {
                            menu.relCliente();
                        } else if (menu.getOpcao2().equals("7")) {
                            menu.relBalanca();
                        } else if (menu.getOpcao2().equals("8")) {
                            menu.relCaixa();
                        } else if (menu.getOpcao2().equals("0")) {
                        	menu.setOpcao( menu.menuInicial()) ;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor digite uma opção correta.");
                        menu.setOpcao( menu.menuInicial()) ;

                    }
                }
                
                if (menu.getOpcao().equals("3")) {//Se venda
                	menu.venda();               	
                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite uma opção correta.");
                menu.setOpcao(menu.menuInicial());
            }
        }
    }
}
