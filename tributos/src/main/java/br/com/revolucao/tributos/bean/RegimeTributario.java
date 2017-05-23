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
public class RegimeTributario {

    private final String id;
    private final String regime;

    public RegimeTributario(String id, String regime) {
        this.id = id;
        this.regime = regime;
    }

    public String getId() {
        return id;
    }

    public String getRegime() {
        return regime;
    }

}
