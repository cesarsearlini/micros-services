/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.controller;

import br.com.revolucao.cadastros.bean.Pais;
import br.com.revolucao.cadastros.service.PaisService;
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
public class PaisController {
    
    @Autowired
    private PaisService paisService;
    
    @GetMapping("paises")
    @ResponseBody
    public List<Pais> getEstados() {
        return paisService.getPaises();
    }
    
    @GetMapping("pais/{codigo}")
    @ResponseBody
    public Pais getEstados(@PathVariable String codigo) {
        return paisService.getPaisCodigo(codigo);
    }   

}