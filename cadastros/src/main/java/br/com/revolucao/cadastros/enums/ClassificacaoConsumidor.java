package br.com.revolucao.cadastros.enums;

public enum ClassificacaoConsumidor {

    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    private final String descricao;

    private ClassificacaoConsumidor(String descrição) {
        this.descricao = descrição;
    }

    public String getDescricao() {
        return descricao;
    }

}