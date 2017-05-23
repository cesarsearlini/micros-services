/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.bean;

import br.com.revolucao.cadastros.model.Cidade;
import br.com.revolucao.cadastros.model.Estado;
import java.util.Set;

/**
 *
 * @author Cesar Searlini
 */
public class EstadoCidadeResponseBean {

    private Long id;
    private String nome;
    private Set<Cidade> cidade;

    public EstadoCidadeResponseBean(Estado estado) {
        this.id = estado.getId();
        this.nome = estado.getNome();
        this.cidade = estado.getCidade();
        this.cidade.forEach(c -> c.setEstado(null));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Cidade> getCidade() {
        return cidade;
    }

    public void setCidade(Set<Cidade> cidade) {
        this.cidade = cidade;
    }

}
