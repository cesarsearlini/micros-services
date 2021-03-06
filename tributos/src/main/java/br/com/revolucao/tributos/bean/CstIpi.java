package br.com.revolucao.tributos.bean;

/**
 *
 * @author Cesar Searlini
 */
public class CstIpi {

    private final String id;
    private final String codigo;
    private final String descricao;

    public CstIpi(String id, String codigo, String descricao) {
        this.id = id;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

}
