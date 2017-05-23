package br.com.revolucao.cadastros.enums;

public enum TipoPessoaEnum {

    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    private final String descricao;

    private TipoPessoaEnum(String descrição) {
        this.descricao = descrição;
    }

    public String getDescricao() {
        return descricao;
    }

}