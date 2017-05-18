package GwMarket;

public class Principal {
 
    public static void main(String[] args) {
   
        Menu menu = new Menu();
        int opcao;
        int opcao2;      

        opcao = menu.menuInicial();

        while (opcao != 0) {

            if (opcao == 1) {//Se Cadastro.
                opcao2 = menu.subMenu();
                if (opcao2 == 1) {
                    menu.cadFormaPagto();
                }
                else if (opcao2==2){
                    menu.cadProduto();
                }
                else if (opcao2==3){
                    menu.cadCliente();
                }
                else if (opcao2 == 4) {
                    menu.cadCargo();
                }
                else if (opcao2 == 5) {
                    menu.cadUnidadeDeMedida();
                }
                else if (opcao2 == 6) {
                    menu.cadFuncionario();
                }
                else if (opcao2 == 0) {
                    opcao = menu.menuInicial();
                }
            }
            if (opcao == 2) {//Se Relatório.
                opcao2 = menu.subMenu();
                if (opcao2 == 1) {
                    menu.relFormaPagto();
                }
                else if (opcao2==2){
                    menu.relProduto();
                }
                else if (opcao2==3){
                    menu.relCliente();
                }    
                else if (opcao2 == 4) {
                    menu.relCargo();
                }
                 else if (opcao2 == 5) {
                    menu.relUnidadeDeMedida();
                }
                  else if (opcao2 == 6) {
                    menu.relFuncionario();
                }
                else if (opcao2 == 0) {
                    opcao = menu.menuInicial();
                }
            }
        }
    }

}
