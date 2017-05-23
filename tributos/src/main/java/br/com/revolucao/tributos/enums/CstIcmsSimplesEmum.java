package br.com.revolucao.tributos.enums;

/**
 * 
 * @see CST ICMS Regime Simples Nacional.
 */
public enum CstIcmsSimplesEmum {
    
    S101("101", "101 - Tributada pelo Simples Nacional com permissão de crédito"),
    S102("102", "102 - Tributada pelo Simples Nacional sem permissão de crédito"),
    S103("103", "103 - Isenção do ICMS no Simples Nacional para faixa de receita bruta"),
    S201("201", "201 - Tributada pelo Simples Nacional com permissão de crédito e com cobrança do ICMS por substituição tributária"),
    S202("202", "202 - Tributada pelo Simples Nacional sem permissão de crédito e com cobrança do ICMS por substituição tributária"),
    S203("203", "203 - Isenção do ICMS no Simples Nacional para faixa de receita bruta e com cobrança do ICMS por substituição tributária"),
    S300("300", "300 - Imune"),
    S400("400", "400 - Não tributada pelo Simples Nacional"),
    S500("500", "500 - ICMS cobrado anteriormente por substituição tributária (substituído) ou por antecipação"),
    S900("900", "900 - Outros");
    
    private final String codigo;
    private final String descricao;
    
    private CstIcmsSimplesEmum(String codigoCst,String descricaoCst){
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
