package GwMarket;

import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Menu implements  ListadeCodigosDeMensagensDeErros {

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
    
    private String opcao;
    private String opcao2;
    
    public String getOpcao(){
    	return(this.opcao);
    }

    public String getOpcao2() {
    	return(this.opcao2);
    }
    
    public void setOpcao(String opc){
    	this.opcao = opc;
    }

    public void setOpcao2( String opc2 ) {
    	this.opcao2 = opc2;
    }
    
    public String menuInicial() {
        String opcaoDeMenuEmCaracter = JOptionPane.showInputDialog(null, "Seja Bem Vindo ! \n"
                + "Menu de opções: \n"
                + "\n"
                + "1 - Cadastros \n"
                + "2 - Relatórios \n"
                + "3 - Efetuar Venda \n"
                + "4 - Efetuar Compra \n"
                + "\n"
                + "0 - Sair "
         ,"INICIO" , JOptionPane.PLAIN_MESSAGE);

        return (opcaoDeMenuEmCaracter);
    }

    public String subMenu() {
        String opcaoDeMenuEmCaracter = JOptionPane.showInputDialog(null, " \n"
                + "1 - Forma de Pagamento \n"
                + "2 - Unidade de Medida \n"
                + "3 - Produtos \n"
                + "4 - Cargo \n"
                + "5 - Funcionario \n"
                + "6 - Clientes \n"
                + "7 - Balanças \n"
                + "8 - Caixas \n"
                + "\n"
                + "Digite 0 para Voltar ao menu inicial"
          ,  ( this.opcao.equals("1")  ) ?  "CADASTROS" : ( this.opcao.equals("2") ? "RELATORIOS" : ( this.opcao.equals("3") ? "VENDA" : "COMPRA" ) )  , JOptionPane.PLAIN_MESSAGE);

        return (opcaoDeMenuEmCaracter);
    }

    
    
    
    /*
     * 
     * Cadastros
     * 
     * 
     */
    public void cadFormaPagto() {
        String codigoEmCaracter = JOptionPane.showInputDialog("Digite o codigo da Forma de pagamento.");
        String descricao = JOptionPane.showInputDialog("Digite a descrição da forma de Pagamento");
        int logico = JOptionPane.showConfirmDialog(null, "Forma de Pagamento Permite Troco ?");
        cadastroDeFormaDePagamento.adicionaNaLista(new FormaDePagamento(codigoEmCaracter, descricao, logico != 1));
    }

    public void cadBalanca() {
        String codigoEmCaracter = JOptionPane.showInputDialog("Digite o codigo da Balança : ");
        String descricao = JOptionPane.showInputDialog("Digite a descrição da Balança : ");
        //int logico = JOptionPane.showConfirmDialog(null, "Forma de Pagamento Permite Troco ?");
        cadastroDeBalancas.adicionaNaLista(new Balanca(codigoEmCaracter, descricao));
    }

    public void cadCaixa() {
        String codigoEmCaracter = JOptionPane.showInputDialog("Digite o codigo do caixa : ");
        String nomeDoCaixa      = JOptionPane.showInputDialog("Digite a descrição do caixa : ");
        final JComboBox<Balanca> combo = new JComboBox<Balanca>();
        Iterator i = cadastroDeBalancas.getLista().iterator();
        while (i.hasNext()) {
            Balanca cb = (Balanca) i.next();
            combo.addItem(cb);
        }
        String[] options = {"OK", "Cancel"};
        JOptionPane.showOptionDialog(null, combo, "Digite a balanca :",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
        Balanca balanca = (Balanca) combo.getSelectedItem();

        cadastroDeCaixas.adicionaNaLista(new Caixa(codigoEmCaracter, nomeDoCaixa, balanca));
    }

    public void cadProduto() {

        String codigoEmNumeros = JOptionPane.showInputDialog("Digite o codigo do Produto : ");

        String descricao = JOptionPane.showInputDialog("Digite a descrição do produto : ");

        // Monta combo para escolha da Unidade De Medida
        final JComboBox<UnidadeDeMedida> combo = new JComboBox<UnidadeDeMedida>();
        Iterator i = cadastroDeUnidadeDeMedidas.getLista().iterator();
        while (i.hasNext()) {
            UnidadeDeMedida um = (UnidadeDeMedida) i.next();
            combo.addItem(um);
        }
        String[] options = {"OK", "Cancel"};
        JOptionPane.showOptionDialog(null, combo, "Escolha a Primeira Unidade de Medida do produto :",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
        UnidadeDeMedida primeiraUnidadeDeMedida = (UnidadeDeMedida) combo.getSelectedItem();

        // Monta combo para escolha da Segunda Unidade De Medida
        JOptionPane.showOptionDialog(null, combo, "Escolha a Segunda Unidade de Medida do produto :",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
        UnidadeDeMedida segundaUnidadeDeMedida = (UnidadeDeMedida) combo.getSelectedItem();

        // Monta combo para escolha da Unidade De Medida
        final JComboBox<String> comboFator = new JComboBox<String>();
        comboFator.addItem("Multiplicação");
        comboFator.addItem("Divisão");
        JOptionPane.showOptionDialog(null, comboFator, "Tipo de Conversão para Segunda Unidade de Medida :",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
        Character tipoDeConversao = comboFator.getSelectedItem().toString().charAt(0);

        String stringConstante = JOptionPane.showInputDialog("Digite o Fator de Conversão do produto : ");
        double fatorDeConversao = Double.parseDouble(stringConstante);

        //
        stringConstante = JOptionPane.showInputDialog("Digite o Preço na primeira unidade de Medida : ");
        double precoNaPrimeiraUnidadeDeMedida = Double.parseDouble(stringConstante);

        cadastroDeProdutos.adicionaNaLista(new Produto(codigoEmNumeros, descricao, primeiraUnidadeDeMedida, segundaUnidadeDeMedida,
                precoNaPrimeiraUnidadeDeMedida, fatorDeConversao, tipoDeConversao));
    }

    public void cadCargo() {
        String codigoEmNumeros = JOptionPane.showInputDialog("Digite o codigo do Cargo : ");
        //int codigoEmNumeros = Integer.parseInt(codigoEmCaracter);
        String descricao = JOptionPane.showInputDialog("Digite a descrição do Cargo");
        int logico = JOptionPane.showConfirmDialog(null, "Vai ter acesso a venda ?");
        int logico2 = JOptionPane.showConfirmDialog(null, "Vai ter acesso ao estoque ?");

        cadastroDeCargos.adicionaNaLista(new Cargo(codigoEmNumeros, descricao, logico != 1, logico2 != 1));
    }

    public void cadCliente() {

        String codigoEmNumeros = JOptionPane.showInputDialog("Digite o codigo do Cliente.");
        //int codigoEmNumeros = Integer.parseInt(codigoEmCaracter);
        String nome = JOptionPane.showInputDialog("Digite o Nome do Cliente.");
        String cpf = JOptionPane.showInputDialog("Digite o cpf do Cliente.");
        String rg = JOptionPane.showInputDialog("Digite o Rg do Cliente.");
        String endereco = JOptionPane.showInputDialog("Digite o Endereço do Cliente.");
        String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento do Cliente.");

        int vetor[] = {Integer.parseInt(nascimento.substring(0, 2)), Integer.parseInt(nascimento.substring(3, 5)), Integer.parseInt(nascimento.substring(6, 10))};

        cadastroDeClientes.adicionaNaLista(new Cliente(codigoEmNumeros, nome, new Data(vetor[0], vetor[1], vetor[2]), cpf, rg, endereco));

    }

    public void cadFuncionario() {

        String codigo = JOptionPane.showInputDialog("Digite a Matricula do Funcionario : ");
        String nome = JOptionPane.showInputDialog("Digite o Nome do Funcionario .");
        String cpf = JOptionPane.showInputDialog("Digite o cpf do Funcionario.");
        String rg = JOptionPane.showInputDialog("Digite o Rg do Funcionario.");
        String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento do Funcionario.");

        int vetor[] = {Integer.parseInt(nascimento.substring(0, 2)), Integer.parseInt(nascimento.substring(3, 5)), Integer.parseInt(nascimento.substring(6, 10))};

        final JComboBox<Cargo> combo = new JComboBox<Cargo>();
        Iterator i = cadastroDeCargos.getLista().iterator();
        while (i.hasNext()) {
            Cargo cg = (Cargo) i.next();
            combo.addItem(cg);
        }
        String[] options = {"OK", "Cancel"};
        Cargo cargo = (Cargo) combo.getSelectedItem();

        cadastroDeFuncionarios.adicionaNaLista(new Funcionario(codigo, nome, new Data(vetor[0], vetor[1], vetor[2]), cpf, rg, cargo));
    }

    public void cadUnidadeDeMedida() {
        String codigoEmCaracter = JOptionPane.showInputDialog("Digite o codigo da Unidade de Medida : ");
        //String codigoEmNumeros = codigoEmCaracter;
        String descricao = JOptionPane.showInputDialog("Digite a descrição da Unidade de Medida : ");
        int logico = JOptionPane.showConfirmDialog(null, "Utiliza Balança ? ");
        cadastroDeUnidadeDeMedidas.adicionaNaLista(new UnidadeDeMedida(codigoEmCaracter, descricao, logico != 1));
    }

    
    
    
    /*
     * 
     * Relatorios
     * 
     * 
     */
       
    public void relUnidadeDeMedida() {
    	this.impressao = "";
        Iterator i = cadastroDeUnidadeDeMedidas.getLista().iterator();
        while (i.hasNext()) {
            UnidadeDeMedida u = (UnidadeDeMedida) i.next();
            this.impressao += u;
        }
        JOptionPane.showMessageDialog(null, this.impressao,  "Relatório de Unidade de Medida" , JOptionPane.PLAIN_MESSAGE  );

        
    }

    public void relCliente() {
    	this.impressao = "";
        Iterator i = cadastroDeClientes.getLista().iterator();
        while (i.hasNext()) {
            Cliente c = (Cliente) i.next();
            this.impressao += c;
        }
        JOptionPane.showMessageDialog(null, this.impressao,  "Relatório de Formas de Clientes" , JOptionPane.PLAIN_MESSAGE  );
       
    }

    public void relFuncionario() {
    	this.impressao = "";
        Iterator i = cadastroDeFuncionarios.getLista().iterator();
        while (i.hasNext()) {
            Funcionario fun = (Funcionario) i.next();
            this.impressao += fun;
        }
        JOptionPane.showMessageDialog(null, this.impressao,  "Relatório de Funcionários" , JOptionPane.PLAIN_MESSAGE  );

    }

    public void relCargo() {
    	this.impressao = "";
        Iterator i = cadastroDeCargos.getLista().iterator();
        while (i.hasNext()) {
            Cargo cg = (Cargo) i.next();
            this.impressao += cg;
        }
        JOptionPane.showMessageDialog(null, this.impressao,  "Relatório de Cargos" , JOptionPane.PLAIN_MESSAGE  );

    }

    public void relFormaPagto() {
    	this.impressao = "";
        Iterator i = cadastroDeFormaDePagamento.getLista().iterator();

        while (i.hasNext()) {
            FormaDePagamento f = (FormaDePagamento) i.next();
            this.impressao += f;
        }
        JOptionPane.showMessageDialog(null, this.impressao, "Relatório de Formas de Pagamento" , JOptionPane.PLAIN_MESSAGE );
        
    }

    public void relProduto() {
    	this.impressao = "";
        Iterator i = cadastroDeProdutos.getLista().iterator();

        while (i.hasNext()) {
            Produto p = (Produto) i.next();
            this.impressao += p;
        }
        JOptionPane.showMessageDialog(null, this.impressao,  "Relatório de Formas de Produtos" , JOptionPane.PLAIN_MESSAGE  );


    }

    public void relBalanca() {
    	this.impressao = "";
        Iterator i = cadastroDeBalancas.getLista().iterator();

        while (i.hasNext()) {
            Balanca b = (Balanca) i.next();
            this.impressao += b;
        }
        JOptionPane.showMessageDialog(null, this.impressao,  "Relatório de Balanças" , JOptionPane.PLAIN_MESSAGE  );

    }

    public void relCaixa() {
    	this.impressao = "";
        Iterator i = cadastroDeCaixas.getLista().iterator();

        while (i.hasNext()) {
            Caixa cx = (Caixa) i.next();
            this.impressao += cx;
        }
        JOptionPane.showMessageDialog(null, this.impressao,  "Relatório de Formas de Pagamento" , JOptionPane.PLAIN_MESSAGE  );

    }
    
    
    
    
    /*
     * 
     * Venda
     * 
     * 
     */
    
    public void venda( ) {
    	
    	 
    	 Caixa caixa;
    	
        // Monta combo para escolha do caixa
        final JComboBox<Caixa> combo = new JComboBox<Caixa>();
        Iterator i = cadastroDeCaixas.getLista().iterator();
        while (i.hasNext()) {
            caixa = (Caixa) i.next();
            combo.addItem(caixa);
        }
        String[] options = {"OK", "Cancel"};
        
        while(true) {
        
        	JOptionPane.showOptionDialog(null, combo, "CAIXA :",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);

        	caixa = (Caixa) combo.getSelectedItem();

        	if (caixa.getOperador().getCargo().getAcessoVenda()) {
        		break;
        	}
        	else {
                JOptionPane.showMessageDialog(null, "Operador " + caixa.getOperador().getNome() + " do caixa " + caixa.getDescricao() + " não tem acesso a vendas!", "Permissão de Venda" , JOptionPane.PLAIN_MESSAGE  );	
        	}
           
        } 
        
        int result = caixa.iniciarVenda();
        
        if (result == SUCESSO ) {
        
        	boolean continua = true;
        	
        	while( continua ) {
        		
        		
               // Monta combo para escolha do produto
               Produto produto;
               final JComboBox<Produto> comboProduto = new JComboBox<Produto>();
               i = cadastroDeProdutos.getLista().iterator();
               while (i.hasNext()) {
                   produto = (Produto) i.next();
                   comboProduto.addItem(produto);
               }
               // String[] options = {"OK", "Cancel"};
                            
              JOptionPane.showOptionDialog(null, combo, "Produto :",
                       JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                       options, options[0]);

              produto = (Produto) comboProduto.getSelectedItem();
                            
              // Monta escolha de Unidade de Medida
              UnidadeDeMedida um;
              final JComboBox<UnidadeDeMedida> comboUM = new JComboBox<UnidadeDeMedida>();
              i = cadastroDeUnidadeDeMedidas.getLista().iterator();
              while (i.hasNext()) {
                  um = (UnidadeDeMedida) i.next();
                  comboUM.addItem(um);
              }
              // String[] options = {"OK", "Cancel"};
                
             JOptionPane.showOptionDialog(null, combo, "Unidade De Medida :",
                      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                      options, options[0]);

             um = (UnidadeDeMedida) comboUM.getSelectedItem();

             if (  um.equals(produto.getPrimeiraUnidadeDeMedida()) || um.equals(produto.getSegundaUnidadeDeMedida() ) ) {
            
                 String stringConstante = JOptionPane.showInputDialog("Informe a Quantidade em " + um.getDescricao() );
                 double quantidade = Double.parseDouble(stringConstante);               
            	 
                 if ( caixa.addItemNaVenda(produto, quantidade, um) != SUCESSO )  {
                     JOptionPane.showMessageDialog(null, codigos[result].getDescricao() , "Adicionar novo Item na Venda" , JOptionPane.PLAIN_MESSAGE  );                    
                 }
                 
                 if ( JOptionPane.NO_OPTION == JOptionPane.showConfirmDialog(null, "Deseja adicionar mais produtos?", "Adicionar mais produtos", JOptionPane.YES_NO_OPTION ) ) {
                	 continua = false;
                 }
                 	                             	 
             }                   
         	else {
                JOptionPane.showMessageDialog(null, "Produto  " + produto.getDescricao() + " não configurado para Unidade de Medida " + um.getDescricao() + "!", "Permissão de Venda" , JOptionPane.PLAIN_MESSAGE  );
                continue;
        	}
              
         }
        	
        }
        else {
            JOptionPane.showMessageDialog(null, codigos[result].getDescricao() , "Iniciar Venda" , JOptionPane.PLAIN_MESSAGE  );	        	
        }     
    }        
}
