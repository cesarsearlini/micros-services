/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.controller;

import br.com.revolucao.cadastros.bean.EmpresaJsonBean;
import br.com.revolucao.cadastros.bean.ResponseJsonBean;
import br.com.revolucao.cadastros.model.Empresa;
import br.com.revolucao.cadastros.repository.EmpresaRepository;
import br.com.revolucao.cadastros.service.EmpresaService;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 *
 * @author Cesar Searlini
 */
@RestController
public class EmpresaController {

    @Autowired
    private EmpresaRepository empresaRepository;
    
    @Autowired
    private EmpresaService empresaService;
    
    
    @RequestMapping(value = "empresas")
    public List<Empresa> getAllEmpresas() {
        return this.empresaRepository.findAll();
    }
    
    @GetMapping("empresa/{id}")
    @ResponseBody
    public Empresa getEmpresa(@PathVariable Long id) {
        return this.empresaRepository.findById(id);
    }

    @RequestMapping(value = "empresa/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseJsonBean salvar(@Valid @RequestBody EmpresaJsonBean empresaJsonBean) {
        return empresaService.salvar(empresaJsonBean);
    }


}