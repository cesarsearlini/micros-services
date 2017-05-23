package br.com.revolucao.tributos.enums;

/**
 * 
 * @see CST IPI Entrada
 */
public enum CstIpiEntradaEnum {
    
    IPI00("00", "00 - Entrada com Recuperação de Crédito"),
    IPI01("01", "01 - Entrada Tributável com Alíquota Zero"),
    IPI02("02", "02 - Entrada Isenta"),
    IPI03("03", "03 - Entrada Não Tributada"),
    IPI04("04", "04 - Entrada Imune "),
    IPI05("05", "05 - Entrada com Suspensão"),
    IPI49("49", "49 - Outras Entradas");

    private final String codigo;
    private final String descricao;

    private CstIpiEntradaEnum(String codigo, String descricao) {
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
