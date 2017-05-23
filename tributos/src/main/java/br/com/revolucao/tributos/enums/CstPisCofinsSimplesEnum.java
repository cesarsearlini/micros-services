package br.com.revolucao.tributos.enums;

/**
 *
 * @see CST PIS Cofins Simples Nacional.
 */
public enum CstPisCofinsSimplesEnum {

    S49("49", "49 - Outras Operaçoes de Saída"),
    S99("99", "99 - Outras");

    private final String codigo;
    private final String descricao;

    private CstPisCofinsSimplesEnum(String codigo, String descricao) {
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
