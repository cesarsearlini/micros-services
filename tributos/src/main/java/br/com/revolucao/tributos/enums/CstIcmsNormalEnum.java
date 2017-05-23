package br.com.revolucao.tributos.enums;


/**
 * 
 * @see CST ICMS Regime Normal - Lucro Real e Presumido.
 */
public enum CstIcmsNormalEnum {
    
    N000("000", "000 - Tributada integralmente"),
    N010("010", "010 - Tributada e com cobrança do ICMS por substituição tributária"),
    N020("020", "020 - Com redução de base de cálculo"),
    N030("030", "030 - Isenta ou não tributada e com cobrança do ICMS por substituição tributária"),
    N040("040", "040 - Isenta"),
    N041("041", "041 - Não tributada"),
    N050("050", "050 - Com suspensão"),
    N051("051", "051 - Com diferimento"),
    N060("060", "060 - ICMS cobrado anteriormente por substituição tributária "),
    N070("070", "070 - Com redução de base de cálculo e cobrança do ICMS por substituição tributária"),
    N090("090", "090 - Outras");
    
    private final String codigo;
    private final String descricao;
    
    private CstIcmsNormalEnum(String codigoCst,String descricaoCst){
        this.codigo = codigoCst;
        this.descricao = descricaoCst;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
