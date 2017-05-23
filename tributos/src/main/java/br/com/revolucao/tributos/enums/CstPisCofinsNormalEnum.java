package br.com.revolucao.tributos.enums;

/**
 *
 * @see CST PIS Cofins - Lucro Real e Presumido
 */
public enum CstPisCofinsNormalEnum {

    N01("01", "01 - Operação Tributável com Alíquota Básica"),
    N02("02", "02 - Operação Tributável com Alíquota Diferenciada"),
    N03("03", "03 - Operação Tributável com Alíquota por Unidade de Medida de Produto"),
    N04("04", "04 - Operação Tributável Monofásica – Revenda a Alíquota Zero"),
    N05("05", "05 - Operação Tributável por Substituição Tributária"),
    N06("06", "06 - Operação Tributável a Alíquota Zero"),
    N07("07", "07 - Operação Isenta da Contribuição"),
    N08("08", "08 - Operação sem Incidência da Contribuição"),
    N09("09", "09 - Operação com Suspensão da Contribuição"),
    N49("49", "49 - Outras Operaçoes de Saída");

    private final String codigo;
    private final String descricao;

    private CstPisCofinsNormalEnum(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    


}
