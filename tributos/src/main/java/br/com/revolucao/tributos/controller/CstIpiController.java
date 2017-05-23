/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.tributos.controller;

import br.com.revolucao.tributos.bean.CstIpi;
import br.com.revolucao.tributos.service.CstIpiService;
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
public class CstIpiController {

    @Autowired
    private CstIpiService cstIpiService;

    @GetMapping("cstIPI/entrada")
    @ResponseBody
    public List<CstIpi> getCstIpiEntrada() {
        return this.cstIpiService.getAllEntrada();
    }

    @GetMapping("cstIPI/saida/lucrosNormais")
    @ResponseBody
    public List<CstIpi> getCstIpiSaidaNormal() {
        return this.cstIpiService.getAllSaidaRegimeNormal();
    }

    @GetMapping("cstIPI/saida/simplesNacional")
    @ResponseBody
    public List<CstIpi> getCstIpiSaidaSimplesNacional() {
        return this.cstIpiService.getAllSaidaSimplesNacional();
    }

}
