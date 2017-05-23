/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.service;

import br.com.revolucao.cadastros.bean.CidadeEstadoResponseBean;
import br.com.revolucao.cadastros.model.Cidade;
import br.com.revolucao.cadastros.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar Searlini
 */
@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;
    
    public CidadeEstadoResponseBean getCidadeEstado(Long id) {
        Cidade cidade = this.cidadeRepository.findById(id);
        CidadeEstadoResponseBean cidadeEstadoResponseBean = new CidadeEstadoResponseBean(cidade);
        return cidadeEstadoResponseBean;
    }

}
