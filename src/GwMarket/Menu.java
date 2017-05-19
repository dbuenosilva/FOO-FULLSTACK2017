package GwMarket;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Menu {

    // Simula as tabelas no Banco de Dados .
    private ListaDeObjetos cadastroDeClientes = new ListaDeObjetos();
    private ListaDeObjetos cadastroDeFuncionarios = new ListaDeObjetos();
    private ListaDeObjetos cadastroDeCargos = new ListaDeObjetos();
    private ListaDeObjetos cadastroDeCaixas = new ListaDeObjetos();
    private ListaDeObjetos cadastroDeBalancas = new ListaDeObjetos();
    private ListaDeObjetos cadastroDeFormaDePagamento = new ListaDeObjetos();
    private ListaDeObjetos cadastroDeProdutos = new ListaDeObjetos();
    private ListaDeObjetos cadastroDeUnidadeDeMedidas = new ListaDeObjetos();
    private ListaDeObjetos cadastroDeVendasRealizadas = new ListaDeObjetos();
    private ListaDeObjetos cadastroDeComprasRealizadas = new ListaDeObjetos();

    private String impressao;
    private boolean resultPermiteTroco = false;

    public int menuInicial() {
        String opcaoDeMenuEmCaracter = JOptionPane.showInputDialog(null, "Seja Bem Vindo ! \n"
                + "Menu de opções: \n"
                + "\n"
                + "1 - Cadastros \n"
                + "2 - Relatórios \n"
                + "3 - Venda \n"
        		+ "4 - Compra \n"
        		+ "\n"
        		+ "0 - Sair "
        		);
        int opcaoDeMenuEmNumeros = Integer.parseInt(opcaoDeMenuEmCaracter);
        return (opcaoDeMenuEmNumeros);
    }

    public int subMenu() {
        String opcaoDeMenuEmCaracter = JOptionPane.showInputDialog(null, "Digite 0 para Voltar ao menu inicial \n"
                + "1 - Forma de Pagamento \n"
                + "2 - Produtos \n"
                + "3 - Clientes \n"
                + "4 - Cargo \n"
                + "5 - Unidade de Medida \n"
                + "6 - Funcionario \n");

        int opcaoDeMenuEmNumerosSub = Integer.parseInt(opcaoDeMenuEmCaracter);
        return (opcaoDeMenuEmNumerosSub);
    }

    public void cadFormaPagto() {
        String codigoEmCaracter = JOptionPane.showInputDialog("Digite o codigo da Forma de pagamento.");
        int codigoEmNumeros = Integer.parseInt(codigoEmCaracter);
        String descricao = JOptionPane.showInputDialog("Digite a descrição da forma de Pagamento");
        int logico = JOptionPane.showConfirmDialog(null, "Forma de Pagamento Permite Troco ?");
        cadastroDeFormaDePagamento.adicionaNaLista(new FormaDePagamento(codigoEmNumeros, descricao, logico != 1));
    }

    public void cadProduto() {

        String stringConstante = JOptionPane.showInputDialog("Digite o codigo do Produto : ");
        int codigoEmNumeros = Integer.parseInt(stringConstante);
        String descricao = JOptionPane.showInputDialog("Digite a descrição do produto : ");
        stringConstante = JOptionPane.showInputDialog("Digite a Primeira Unidade de Medida do produto : ");
        int primeiraUnidadeDeMedida = Integer.parseInt(stringConstante);
        stringConstante = JOptionPane.showInputDialog("Digite a Segunda Unidade de Medida do produto : ");
        int segundaUnidadeDeMedida = Integer.parseInt(stringConstante);
        stringConstante = JOptionPane.showInputDialog("Digite o Preço na primeira unidade de Medida : ");
        double precoNaPrimeiraUnidadeDeMedida = Double.parseDouble(stringConstante);
        stringConstante = JOptionPane.showInputDialog("Digite o Fator de Conversão do produto : ");
        double fatorDeConversao = Double.parseDouble(stringConstante);
        stringConstante = JOptionPane.showInputDialog("Digite o Tipo de Conversão : : ");
        char tipoDeConversao = stringConstante.charAt(0);
        stringConstante = JOptionPane.showInputDialog("Digite o Saldo do estoque do produto : ");
        double saldoDoEstoqueNaPrimeiraUnidadeDeMedida = Double.parseDouble(stringConstante);

        cadastroDeProdutos.adicionaNaLista(new Produto(codigoEmNumeros, descricao, new UnidadeDeMedida(primeiraUnidadeDeMedida), 
        		new UnidadeDeMedida(segundaUnidadeDeMedida), precoNaPrimeiraUnidadeDeMedida, fatorDeConversao, tipoDeConversao, saldoDoEstoqueNaPrimeiraUnidadeDeMedida));                                                                   
    }

    public void cadCargo() {
        String codigoEmCaracter = JOptionPane.showInputDialog("Digite o codigo do Cargo : .");
        int codigoEmNumeros = Integer.parseInt(codigoEmCaracter);
        String descricao = JOptionPane.showInputDialog("Digite a descrição do Cargo");
        int logico = JOptionPane.showConfirmDialog(null, "Vai ter acesso a venda ?");
        int logico2 = JOptionPane.showConfirmDialog(null, "Vai ter acesso ao estoque ?");

        cadastroDeCargos.adicionaNaLista(new Cargo(codigoEmNumeros, descricao, logico != 1, logico2 != 1));
    }

    public void cadCliente() {

        String codigoEmCaracter = JOptionPane.showInputDialog("Digite o codigo do Cliente.");
        int codigoEmNumeros = Integer.parseInt(codigoEmCaracter);
        String nome = JOptionPane.showInputDialog("Digite o Nome do Cliente.");
        String cpf = JOptionPane.showInputDialog("Digite o cpf do Cliente.");
        String rg = JOptionPane.showInputDialog("Digite o Rg do Cliente.");
        String endereco = JOptionPane.showInputDialog("Digite o Endereço do Cliente.");
        String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento do Cliente.");

        int vetor[] = {Integer.parseInt(nascimento.substring(0, 2)), Integer.parseInt(nascimento.substring(3, 5)), Integer.parseInt(nascimento.substring(6, 10))};

        cadastroDeClientes.adicionaNaLista(new Cliente(codigoEmNumeros, nome, new Data(vetor[0], vetor[1], vetor[2]), cpf, rg, endereco));

    }
    
     public void cadFuncionario() {

        String codigoEmCaracter = JOptionPane.showInputDialog("Digite a Matricula do Funcionario : ");
        int codigoEmNumeros = Integer.parseInt(codigoEmCaracter);        
        String StringConstate = JOptionPane.showInputDialog("Digite o cargo do funcionario : ");
        int cargo = Integer.parseInt(StringConstate);              
        String nome = JOptionPane.showInputDialog("Digite o Nome do Funcionario .");
        String cpf = JOptionPane.showInputDialog("Digite o cpf do Funcionario.");
        String rg = JOptionPane.showInputDialog("Digite o Rg do Funcionario.");
        String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento do Funcionario.");

        int vetor[] = {Integer.parseInt(nascimento.substring(0, 2)), Integer.parseInt(nascimento.substring(3, 5)), Integer.parseInt(nascimento.substring(6, 10))};

        cadastroDeFuncionarios.adicionaNaLista(new Funcionario(codigoEmNumeros, nome, new Data(vetor[0], vetor[1], vetor[2]), cpf, rg, new Cargo(cargo)));

        //nt matricula, String nome, Data nascimento, String cpf, String rg, Cargo cargo
    }
    
    public void cadUnidadeDeMedida(){
        String codigoEmCaracter = JOptionPane.showInputDialog("Digite o codigo da Unidade de Medida : ");
        int codigoEmNumeros = Integer.parseInt(codigoEmCaracter);
        String descricao = JOptionPane.showInputDialog("Digite a descrição da Unidade de Medida : ");
        int logico = JOptionPane.showConfirmDialog(null, "Utiliza Balança ? ");
        cadastroDeUnidadeDeMedidas.adicionaNaLista(new UnidadeDeMedida(codigoEmNumeros, descricao, logico != 1));
    }
    public void relUnidadeDeMedida() {

        Iterator i = cadastroDeUnidadeDeMedidas.getLista().iterator();

        while (i.hasNext()) {
            UnidadeDeMedida u = (UnidadeDeMedida) i.next();
            this.impressao += u;
        }
        JOptionPane.showMessageDialog(null, this.impressao);
        this.impressao = "";
        String Logico = "";
    }
    
    

    public void relCliente() {

        Iterator i = cadastroDeClientes.getLista().iterator();

        while (i.hasNext()) {
            Cliente c = (Cliente) i.next();
            this.impressao += c;
        }
        JOptionPane.showMessageDialog(null, this.impressao);
        this.impressao = "";
        String Logico = "";
    }

     public void relFuncionario() {

        Iterator i = cadastroDeFuncionarios.getLista().iterator();

        while (i.hasNext()) {
            Funcionario fun = (Funcionario) i.next();
            this.impressao += fun;
        }
        JOptionPane.showMessageDialog(null, this.impressao);
        this.impressao = "";
        String Logico = "";
    }
    
    public void relCargo() {

        Iterator i = cadastroDeCargos.getLista().iterator();

        while (i.hasNext()) {
            Cargo cg = (Cargo) i.next();
            this.impressao += cg;
        }
        JOptionPane.showMessageDialog(null, this.impressao);
        this.impressao = "";
        String Logico = "";
    }

    public void relFormaPagto() {

        Iterator i = cadastroDeFormaDePagamento.getLista().iterator();

        while (i.hasNext()) {
            FormaDePagamento f = (FormaDePagamento) i.next();
            this.impressao += f;
        }
        JOptionPane.showMessageDialog(null, this.impressao);
        this.impressao = "";
        String Logico = "";
    }
    public void relProduto(){
        
        Iterator i = cadastroDeProdutos.getLista().iterator();

        while (i.hasNext()) {
            Produto p = (Produto) i.next();
            this.impressao += p;
        }
        JOptionPane.showMessageDialog(null, this.impressao);
        this.impressao = "";
        String Logico = "";
        
    }

}
