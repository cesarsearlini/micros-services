/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.tributos.controller;

import br.com.revolucao.tributos.bean.CstPisCofins;
import br.com.revolucao.tributos.service.CstPisCofinsService;
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
public class CstPisConfinsController {

    @Autowired
    private CstPisCofinsService cstPisCofinsService;

    @GetMapping("cstPisCofins/lucrosNormais")
    @ResponseBody
    public List<CstPisCofins> getCstPisConfinsNormal() {
        return this.cstPisCofinsService.getCstPisConfinsNormal();
    }

    @GetMapping("cstPisCofins/simplesNacional")
    @ResponseBody
    public List<CstPisCofins> getCstPisConfinsSimples() {
        return this.cstPisCofinsService.getCstPisConfinsSimples();
    }

}
