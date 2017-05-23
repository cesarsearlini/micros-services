package br.com.revolucao.tributos.enums;

public enum TipoMercadoriaEnum {

    TI00("00", "00 - Mercadoria para Revenda"),
    TI01("01", "01 - Matéria-Prima"),
    TI02("02", "02 - Embalagem"),
    TI03("03", "03 - Produto em Processo"),
    TI04("04", "04 - Produto Acabado"),
    TI05("05", "05 - Subproduto"),
    TI06("06", "06 - Produto Intermediário"),
    TI07("07", "07 - Material de Uso e Consumo"),
    TI08("08", "08 - Ativo Imobilizado"),
    TI09("09", "09 - Serviços"),
    TI10("10", "10 - Outros insumos"),
    TI99("99", "99 - Outras");

    private final String codigo;
    private final String descricao;

    private TipoMercadoriaEnum(String codigo, String descricao) {
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