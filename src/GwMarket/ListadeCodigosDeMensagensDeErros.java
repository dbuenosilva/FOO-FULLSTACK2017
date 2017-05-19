/**
 *
 */
package GwMarket;

/**
 * @author diego
 *
 */
public interface ListadeCodigosDeMensagensDeErros {

    public final static int SUCESSO = 0;
    public final static int ERR_SALDO = 1;
    public final static int ERR_UNIDADE_MEDIDA = 2;
    public final static int ERR_JA_EXISTE_OPERADOR = 3;
    public final static int ERR_NAO_EXISTE_OPERADOR = 4;
    public final static int ERR_JA_EXISTE_BALANCA = 5;
    public final static int ERR_NAO_EXISTE_BALANCA = 6;
    public final static int ERR_VENDA_JA_EM_EXECUCAO = 7;
    public final static int ERR_VENDA_NAO_EXISTE = 8;
    public final static int ERR_NAO_PODE_LANCAR_ENTRADA = 9;
    public final static int ERR_COMPRA_NAO_EXISTE = 10;
    public final static int ERR_COMPRA_JA_EM_EXECUCAO = 10;

    public final static CodigoDeMensagensDeErro[] codigos = {
        new CodigoDeMensagensDeErro(SUCESSO, "Sucesso!"),
        new CodigoDeMensagensDeErro(ERR_SALDO, "Saldo insuficiente"),
        new CodigoDeMensagensDeErro(ERR_UNIDADE_MEDIDA, "Produto não está configurado para Unidade de Medida especificada"),
        new CodigoDeMensagensDeErro(ERR_JA_EXISTE_OPERADOR, "Já existe operador informado!"),
        new CodigoDeMensagensDeErro(ERR_NAO_EXISTE_OPERADOR, "Não existe operador!"),
        new CodigoDeMensagensDeErro(ERR_JA_EXISTE_BALANCA, "Já existe balança informada!"),
        new CodigoDeMensagensDeErro(ERR_NAO_EXISTE_BALANCA, "Não existe balança!"),
        new CodigoDeMensagensDeErro(ERR_VENDA_JA_EM_EXECUCAO, "Já existe uma venda em execução, encerre a atual antes de iniciar outra!"),
        new CodigoDeMensagensDeErro(ERR_VENDA_NAO_EXISTE, "Não há venda em execução, por favor inicie uma venda!"),
        new CodigoDeMensagensDeErro(ERR_NAO_PODE_LANCAR_ENTRADA, "So é permitido um gerente lançar esse pedido !"),
        new CodigoDeMensagensDeErro(ERR_COMPRA_NAO_EXISTE, "Não há compra em execução, por favor inicie uma venda! "),
        new CodigoDeMensagensDeErro(ERR_COMPRA_JA_EM_EXECUCAO, "Já existe uma compra em execução, encerre a atual antes de iniciar outra!"),
        new CodigoDeMensagensDeErro(-1, " ")};
}
