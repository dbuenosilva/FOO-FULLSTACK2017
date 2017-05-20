package GwMarket;

import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class View implements ListadeCodigosDeMensagensDeErros {

    // Simula as tabelas no Banco de Dados .
    private Model cadastroDeClientes = new Model();
    private Model cadastroDeFuncionarios = new Model();
    private Model cadastroDeCargos = new Model();
    private Model cadastroDeCaixas = new Model();
    private Model cadastroDeBalancas = new Model();
    private Model cadastroDeFormaDePagamento = new Model();
    private Model cadastroDeProdutos = new Model();
    private Model cadastroDeUnidadeDeMedidas = new Model();
    private Model relacaoDeVendasRealizadas = new Model();
    private Model relacaoDeComprasRealizadas = new Model();

    private String impressao;
    private boolean resultPermiteTroco = false;

    private String opcao;
    private String opcao2;

    public String getOpcao() {
        return (this.opcao);
    }

    public String getOpcao2() {
        return (this.opcao2);
    }

    public void setOpcao(String opc) {
        this.opcao = opc;
    }

    public void setOpcao2(String opc2) {
        this.opcao2 = opc2;
    }

    public String viewInicial() {
        String opcaoDeviewEmCaracter = JOptionPane.showInputDialog(null, "Seja Bem Vindo ! \n"
                + "\n"
                + "\n"
                + "1 - Cadastros \n"
                + "2 - Relatórios \n"
                + "3 - Efetuar Venda \n"
                + "4 - Efetuar Compra \n"
                + "\n"
                + "0 - Sair ",
                "INICIO", JOptionPane.PLAIN_MESSAGE);

        return (opcaoDeviewEmCaracter);
    }

    public String subview() {
        String opcaoDeviewEmCaracter = JOptionPane.showInputDialog(null, " \n"
                + "1 - Forma de Pagamento \n"
                + "2 - Unidade de Medida \n"
                + "3 - Produtos \n"
                + "4 - Cargo \n"
                + "5 - Funcionario \n"
                + "6 - Clientes \n"
                + "7 - Balanças \n"
                + "8 - Caixas \n"
                + (this.opcao.equals("1") ? "" : "9 - Compras \n")
                + (this.opcao.equals("1") ? "" : "10 - Vendas \n")
                + "\n"
                + "Digite 0 para Voltar ao menu inicial",
                (this.opcao.equals("1")) ? "CADASTROS" : (this.opcao.equals("2") ? "RELATORIOS" : (this.opcao.equals("3") ? "VENDA" : "COMPRA")), JOptionPane.PLAIN_MESSAGE);

        return (opcaoDeviewEmCaracter);
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
        String nomeDoCaixa = JOptionPane.showInputDialog("Digite a descrição do caixa : ");

        Funcionario operador;
        final JComboBox<Funcionario> comboOperador = new JComboBox<Funcionario>();
        Iterator i = cadastroDeFuncionarios.getLista().iterator();
        while (i.hasNext()) {
            operador = (Funcionario) i.next();
            comboOperador.addItem(operador);
        }
        String[] options = {"OK", "Cancel"};
        JOptionPane.showOptionDialog(null, comboOperador, "Informe o Operador do Caixa :",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
        operador = (Funcionario) comboOperador.getSelectedItem();

        // Escolha da Balanca
        final JComboBox<Balanca> combo = new JComboBox<Balanca>();
        i = cadastroDeBalancas.getLista().iterator();
        while (i.hasNext()) {
            Balanca cb = (Balanca) i.next();
            combo.addItem(cb);
        }
        //String[] options = {"OK", "Cancel"};
        JOptionPane.showOptionDialog(null, combo, "Informa a balanca utilizada por este Caixa :",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
        Balanca balanca = (Balanca) combo.getSelectedItem();

        cadastroDeCaixas.adicionaNaLista(new Caixa(codigoEmCaracter, nomeDoCaixa, operador, balanca));
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
        String cpf = JOptionPane.showInputDialog("Digite o CPF/CNPJ do Cliente.");
        String rg = JOptionPane.showInputDialog("Digite o Rg/IE do Cliente.");
        String endereco = JOptionPane.showInputDialog("Digite o Endereço do Cliente.");
        String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento/abertura.");

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
        JOptionPane.showOptionDialog(null, combo, "Informe o cargo do Funcionario :",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);

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
            this.impressao += u + "\n";
        }
        JOptionPane.showMessageDialog(null, this.impressao, "Relatório de Unidade de Medida", JOptionPane.PLAIN_MESSAGE);

    }

    public void relCliente() {
        this.impressao = "";
        Iterator i = cadastroDeClientes.getLista().iterator();
        while (i.hasNext()) {
            Cliente c = (Cliente) i.next();
            this.impressao += c + "\n";
        }
        JOptionPane.showMessageDialog(null, this.impressao, "Relatório de Formas de Clientes", JOptionPane.PLAIN_MESSAGE);

    }

    public void relFuncionario() {
        this.impressao = "";
        Iterator i = cadastroDeFuncionarios.getLista().iterator();
        while (i.hasNext()) {
            Funcionario fun = (Funcionario) i.next();
            this.impressao += fun + "\n";
        }
        JOptionPane.showMessageDialog(null, this.impressao, "Relatório de Funcionários", JOptionPane.PLAIN_MESSAGE);

    }

    public void relCargo() {
        this.impressao = "";
        Iterator i = cadastroDeCargos.getLista().iterator();
        while (i.hasNext()) {
            Cargo cg = (Cargo) i.next();
            this.impressao += cg + "\n";
        }
        JOptionPane.showMessageDialog(null, this.impressao, "Relatório de Cargos", JOptionPane.PLAIN_MESSAGE);

    }

    public void relFormaPagto() {
        this.impressao = "";
        Iterator i = cadastroDeFormaDePagamento.getLista().iterator();

        while (i.hasNext()) {
            FormaDePagamento f = (FormaDePagamento) i.next();
            this.impressao += f + "\n";
        }
        JOptionPane.showMessageDialog(null, this.impressao, "Relatório de Formas de Pagamento", JOptionPane.PLAIN_MESSAGE);

    }

    public void relProduto() {
        this.impressao = "";
        Iterator i = cadastroDeProdutos.getLista().iterator();

        while (i.hasNext()) {
            Produto p = (Produto) i.next();
            this.impressao += p.imprimeProd() + "\n";
        }
        JOptionPane.showMessageDialog(null, this.impressao, "Relatório de Produtos", JOptionPane.PLAIN_MESSAGE);

    }

    public void relBalanca() {
        this.impressao = "";
        Iterator i = cadastroDeBalancas.getLista().iterator();

        while (i.hasNext()) {
            Balanca b = (Balanca) i.next();
            this.impressao += b + "\n";
        }
        JOptionPane.showMessageDialog(null, this.impressao, "Relatório de Balanças", JOptionPane.PLAIN_MESSAGE);

    }

    public void relCaixa() {
        this.impressao = "";
        Iterator i = cadastroDeCaixas.getLista().iterator();

        while (i.hasNext()) {
            Caixa cx = (Caixa) i.next();
            this.impressao += cx + "\n";
        }
        JOptionPane.showMessageDialog(null, this.impressao, "Relatório de Caixas", JOptionPane.PLAIN_MESSAGE);

    }

    /*
     * 
     * Venda
     * 
     * 
     */
    public void venda() {

        Caixa caixa;

        // Monta combo para escolha do caixa
        final JComboBox<Caixa> combo = new JComboBox<Caixa>();
        Iterator i = cadastroDeCaixas.getLista().iterator();
        while (i.hasNext()) {
            caixa = (Caixa) i.next();
            combo.addItem(caixa);
        }
        String[] options = {"OK", "Cancel"};

        while (true) {

            JOptionPane.showOptionDialog(null, combo, "Efetuar venda pelo caixa :",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                    options, options[0]);

            caixa = (Caixa) combo.getSelectedItem();

            if (caixa.getOperador().getCargo().getAcessoVenda()) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Operador " + caixa.getOperador().getNome() + " do caixa " + caixa.getDescricao() + " não tem acesso a vendas!", "Permissão de Venda", JOptionPane.PLAIN_MESSAGE);
                this.setOpcao(this.viewInicial());
            }

        }

        int result = caixa.iniciarVenda();

        if (result == SUCESSO) {

            boolean continua = true;

            // Obtem o cliente da venda

            // Monta combo para escolha do cliente
            final JComboBox<Cliente> comboCliente = new JComboBox<Cliente>();
            i = cadastroDeClientes.getLista().iterator();
            while (i.hasNext()) {
                comboCliente.addItem((Cliente) i.next());
            }
            
            JOptionPane.showOptionDialog(null, comboCliente, "Cliente :",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                    options, options[0]);
            
            caixa.getVenda().setCliente( (Cliente) comboCliente.getSelectedItem() );            
            
            while (continua) {

                // Monta combo para escolha do produto
                Produto produto;
                final JComboBox<Produto> comboProduto = new JComboBox<Produto>();
                i = cadastroDeProdutos.getLista().iterator();
                while (i.hasNext()) {
                    produto = (Produto) i.next();
                    comboProduto.addItem(produto);
                }
                // String[] options = {"OK", "Cancel"};

                JOptionPane.showOptionDialog(null, comboProduto, "Produto :",
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

                JOptionPane.showOptionDialog(null, comboUM, "Unidade De Medida :",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                        options, options[0]);

                um = (UnidadeDeMedida) comboUM.getSelectedItem();

                if (um.equals(produto.getPrimeiraUnidadeDeMedida()) || um.equals(produto.getSegundaUnidadeDeMedida())) {

                    String stringConstante = JOptionPane.showInputDialog("Informe a Quantidade em " + um.getDescricao());
                    double quantidade = Double.parseDouble(stringConstante);

                    result = caixa.addItemNaVenda(produto, quantidade, um);
                    if (result != SUCESSO) {
                        JOptionPane.showMessageDialog(null, codigos[result].getDescricao(), "Adicionar novo Item na Venda", JOptionPane.PLAIN_MESSAGE);
                    }

                    if (JOptionPane.NO_OPTION == JOptionPane.showConfirmDialog(null, "Deseja adicionar mais produtos?", "Adicionar mais produtos", JOptionPane.YES_NO_OPTION)) {
                        continua = false;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Produto  " + produto.getDescricao() + " não configurado para Unidade de Medida " + um.getDescricao() + "!", "Unidade de Vendida Inválida", JOptionPane.PLAIN_MESSAGE);
                    if (JOptionPane.NO_OPTION == JOptionPane.showConfirmDialog(null, "Deseja adicionar mais produtos?", "Adicionar mais produtos", JOptionPane.YES_NO_OPTION)) {
                        continua = false;
                    }
                }

            }
            
            caixa.finalizarVenda(relacaoDeVendasRealizadas);
            

        } else {
            JOptionPane.showMessageDialog(null, codigos[result].getDescricao(), "Iniciar Venda", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void compra() {

        Recepcao recepcao = new Recepcao();

        Funcionario operador;

        final JComboBox<Funcionario> comboOperador = new JComboBox<Funcionario>();
        Iterator i = cadastroDeFuncionarios.getLista().iterator();
        while (i.hasNext()) {
            operador = (Funcionario) i.next();
            comboOperador.addItem(operador);
        }
        String[] options = {"OK", "Cancel"};
        JOptionPane.showOptionDialog(null, comboOperador, "Informe o Operador do Caixa :",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
        recepcao.setFuncionario((Funcionario) comboOperador.getSelectedItem());

        if (recepcao.getOperador().getCargo().getAcessoAoEstoque()) {

            int result = recepcao.iniciarCompra();

            if (result == SUCESSO) {

                boolean continua = true;

//            String[] options = {"OK", "Cancel"};
                while (continua) {

                    // Monta combo para escolha do produto
                    Produto produto;
                    final JComboBox<Produto> comboProduto = new JComboBox<Produto>();
                    i = cadastroDeProdutos.getLista().iterator();
                    while (i.hasNext()) {
                        produto = (Produto) i.next();
                        comboProduto.addItem(produto);
                    }
                    // String[] options = {"OK", "Cancel"};

                    JOptionPane.showOptionDialog(null, comboProduto, "Produto :",
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

                    JOptionPane.showOptionDialog(null, comboUM, "Unidade De Medida :",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                            options, options[0]);

                    um = (UnidadeDeMedida) comboUM.getSelectedItem();

                    if (um.equals(produto.getPrimeiraUnidadeDeMedida()) || um.equals(produto.getSegundaUnidadeDeMedida())) {

                        String stringConstante = JOptionPane.showInputDialog("Informe a Quantidade em " + um.getDescricao());
                        double quantidade = Double.parseDouble(stringConstante);

                        result = recepcao.addItemNaCompra(produto, quantidade, um);
                        if (result != SUCESSO) {
                            JOptionPane.showMessageDialog(null, codigos[result].getDescricao(), "Adicionar novo Item na Venda", JOptionPane.PLAIN_MESSAGE);
                        }

                        if (JOptionPane.NO_OPTION == JOptionPane.showConfirmDialog(null, "Deseja adicionar mais produtos?", "Adicionar mais produtos", JOptionPane.YES_NO_OPTION)) {
                            continua = false;
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Produto  " + produto.getDescricao() + " n„o configurado para Unidade de Medida " + um.getDescricao() + "!", "Permiss„o de compras", JOptionPane.PLAIN_MESSAGE);
                        if (JOptionPane.NO_OPTION == JOptionPane.showConfirmDialog(null, "Deseja adicionar mais produtos?", "Adicionar mais produtos", JOptionPane.YES_NO_OPTION)) {
                            continua = false;
                        }
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, codigos[result].getDescricao(), "Iniciar compra", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"So Gerentes podem ter acesso!");
        }
    }
    

    public void relCompra() {

         Iterator i = relacaoDeComprasRealizadas.getLista().iterator();

        while (i.hasNext()) {
            Compra compra = (Compra) i.next();
            this.impressao += compra;
        }
        JOptionPane.showMessageDialog(null, this.impressao, "Relatório de compras", JOptionPane.PLAIN_MESSAGE);

    }

    public void relVenda() {

        this.impressao = "";
        Iterator i = relacaoDeVendasRealizadas.getLista().iterator();

        while (i.hasNext()) {
            Venda venda = (Venda) i.next();
            this.impressao += venda;
        }
        JOptionPane.showMessageDialog(null, this.impressao, "Relatório de Vendas", JOptionPane.PLAIN_MESSAGE);

    }

}
