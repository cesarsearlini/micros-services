/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.controller;

import br.com.revolucao.cadastros.bean.EstadoCidadeResponseBean;
import br.com.revolucao.cadastros.model.Estado;
import br.com.revolucao.cadastros.repository.EstadoRepository;
import br.com.revolucao.cadastros.service.EstadoService;
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
public class EstadoController {

    @Autowired
    private EstadoRepository estadoRepository;
    
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping("estados")
    @ResponseBody
    public List<Estado> getEstados() {
        return estadoRepository.findAll();
    }
    
    @GetMapping("estado/sigla/{sigla}")
    @ResponseBody
    public Estado getEstadosBySigla(@PathVariable String sigla) {
        return estadoRepository.findBySigla(sigla);
    }
    
    @GetMapping("estado/codigo/{id}")
    @ResponseBody
    public Estado getEstadosById(@PathVariable Long id) {
        return estadoRepository.findById(id);
    }
    
    @GetMapping("estadosCidades")
    @ResponseBody
    public List<EstadoCidadeResponseBean> getEstadosCidades() {
        return estadoService.getEstadosCidades();
    }
    
    @GetMapping("estadoCidades/sigla/{sigla}")
    @ResponseBody
    public EstadoCidadeResponseBean getEstadoCidadesBySiglas(@PathVariable String sigla) {
        return estadoService.getEstadoCidades(sigla);
    }
    
    @GetMapping("estadoCidades/codigo/{id}")
    @ResponseBody
    public EstadoCidadeResponseBean getEstadoCidadesById(@PathVariable Long id) {
        return estadoService.getEstadoCidades(id);
    }

}