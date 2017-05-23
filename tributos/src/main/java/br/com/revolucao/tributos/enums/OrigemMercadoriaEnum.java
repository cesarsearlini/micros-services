package br.com.revolucao.tributos.enums;

public enum OrigemMercadoriaEnum {

    OM0("0", "0 - Nacional"),
    OM1("1", "1 - Estrangeira-Importação Direta"),
    OM2("2", "2 - Estrangeira-Adquirida no Mercado Interno"),
    OM3("3", "3 - Nacional,Mercadoria ou bem com Conteúdo de Importação Superior a 40%"),
    OM4("4", "4 - Nacional,cuja Produção tenha sido feita em Conformidade com os Processos Produtivos Básicos"),
    OM5("5", "5 - Nacional,Mercadoria ou bem com Conteúdo de Importação Inferior ou Igual a 40%"),
    OM6("6", "6 - Estrangeira,Importação Direta, sem similar Nacional"),
    OM7("7", "7 - Estrangeira,Adquirida no Mercado Interno,sem similar Nacional"),
    OM8("8", "8 - Nacional,Mercadoria ou bem com Conteúdo de Importação Superior a 70%");

    private final String codigo;
    private final String descricao;

    private OrigemMercadoriaEnum(String codigo, String descricao) {
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
