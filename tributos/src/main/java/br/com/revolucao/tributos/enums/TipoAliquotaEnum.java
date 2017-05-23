package br.com.revolucao.tributos.enums;

/**
 *
 * @author Fred William Torno Junior - fredwilliam@gmail.com -
 * fredwilliam@outlook.com - www.fwtj.com.br - (19) 98215-5340
 */
public enum TipoAliquotaEnum {
    
    ICMS("ICMS","ICMS"),
    ISS("ISS","Serviço"),
    F("F","Retido na Fonte/Substituição Tributaria"),
    I("I","Isento"),
    N("N","Não Tributado");
    
    private String tipo;
    private String descricao;
    
    private TipoAliquotaEnum(String tipo, String descricao){
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getDescricao() {
        return descricao;
    }
}
