package br.com.revolucao.tributos.enums;

public enum RegimeTributarioEnum {
    
    SN("Simples Nacional"),
    LP("Lucro Presumido"),
    LR("Lucro Real");
    
    private final String descricao;
    
    private RegimeTributarioEnum(String descrição){
        this.descricao = descrição;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
