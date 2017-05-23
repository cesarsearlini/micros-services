/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.controller;

import br.com.revolucao.cadastros.bean.CidadeEstadoResponseBean;
import br.com.revolucao.cadastros.model.Cidade;
import br.com.revolucao.cadastros.repository.CidadeRepository;
import br.com.revolucao.cadastros.service.CidadeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cesar Searlini
 */
@RestController
public class CidadeController {

    @Autowired
    private CidadeRepository cidadeRepository;
    
    @Autowired
    private CidadeService cidadeService;
    
    @GetMapping("cidades")
    @ResponseBody
    public List<Cidade> listAll() {
        return cidadeRepository.findAll();
    }
    
    @GetMapping("cidade/{id}")
    @ResponseBody
    public Cidade getCidade(@PathVariable Long id) {
        return this.cidadeRepository.findById(id);
    }
    
    @GetMapping("cidadeEstado/{id}")
    @ResponseBody
    public CidadeEstadoResponseBean getCidadeEstado(@PathVariable Long id) {
        return this.cidadeService.getCidadeEstado(id);
    }

}