/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.tributos.controller;

import br.com.revolucao.tributos.bean.TipoMercadoria;
import br.com.revolucao.tributos.service.TipoMercadoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cesar Searlini
 */
@RestController
public class TipoMercadoriaController {

    @Autowired
    private TipoMercadoriaService tipoMercadoriaService;

    @GetMapping("tipoMercadoria")
    @ResponseBody
    public List<TipoMercadoria> getOrigemMercadoria() {
        return this.tipoMercadoriaService.getAllTipoMercadoria();
    }

}
