package br.com.revolucao.tributos.bean;

public class CstPisCofins {

    private final String id;
    private final String codigo;
    private final String descricao;

    public CstPisCofins(String id, String codigo, String descricao) {
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
