package br.com.revolucao.tributos.enums;

/**
 * 
 * @see CST IPI Saida Normal  - Lucro Real e Presumido.
 */
public enum CstIpiSaidaNormalEnum {
    
    IPI50("50", "50 - Saída Tributada "),
    IPI51("51", "51 - Saída Tributável com Alíquota Zero"),
    IPI52("52", "52 - Saída Isenta"),
    IPI53("53", "53 - Saída Não Tributada"),
    IPI54("54", "54 - Saída Imune"),
    IPI55("55", "55 - Saída com Suspensão"),
    IPI99("99", "99 - Outras Saídas");
     
    private final String codigo;
    private final String descricao;

    private CstIpiSaidaNormalEnum(String codigo, String descricao) {
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
