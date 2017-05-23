/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.tributos.controller;

import br.com.revolucao.tributos.bean.CstIcms;
import br.com.revolucao.tributos.service.CstIcmsService;
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
public class CstIcmsController {

    @Autowired
    private CstIcmsService cstIcmsService;

    @GetMapping("cstICMS/lucrosNormais")
    @ResponseBody
    public List<CstIcms> getCstIcmsRegimeLucrosNormais() {
        return this.cstIcmsService.getAllRegimeNormal();
    }

    @GetMapping("cstICMS/simplesNacional")
    @ResponseBody
    public List<CstIcms> getCstIcmsRegimeSimplesNacional() {
        return this.cstIcmsService.getAllSimplesNacional();
    }

}
