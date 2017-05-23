/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.tributos.bean;

/**
 *
 * @author Cesar Searlini
 */
public class TipoMercadoria {

    private final String id;
    private final String codigo;
    private final String descricao;

    public TipoMercadoria(String id, String codigo, String descricao) {
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
