package br.com.revolucao.tributos.enums;

/**
 *
 * @see CST IPI Saida Simples Nacional.
 */
public enum CstIpiSaidaSimplesEnum {

    IPIS99("99", "99 - Outras");

    private final String codigo;
    private final String descricao;

    private CstIpiSaidaSimplesEnum(String codigo, String descricao) {
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
