/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.service;

import br.com.revolucao.cadastros.bean.EmpresaJsonBean;
import br.com.revolucao.cadastros.bean.ResponseJsonBean;
import br.com.revolucao.cadastros.model.Cidade;
import br.com.revolucao.cadastros.model.Empresa;
import br.com.revolucao.cadastros.model.Estado;
import br.com.revolucao.cadastros.repository.CidadeRepository;
import br.com.revolucao.cadastros.repository.EmpresaRepository;
import br.com.revolucao.cadastros.repository.EstadoRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar Searlini
 */
@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private EstadoRepository estadoRepository;

    private SimpleDateFormat simpleDateFormatBanco;
    private ResponseJsonBean responseJsonBean;

    @PostConstruct
    public void ini() {
        simpleDateFormatBanco = new SimpleDateFormat("yyyy-MM-dd");
        responseJsonBean = new ResponseJsonBean();
    }

    public ResponseJsonBean salvar(EmpresaJsonBean empresaJsonBean) {
        Empresa empresa = new Empresa();
        try {
            empresa.setRazaoSocial(empresaJsonBean.getRazaoSocial());
            empresa.setCnpj(empresaJsonBean.getCnpj());
            empresa.setInscricaoEstadual(empresaJsonBean.getInscricaoEstadual());
            empresa.setInscricaoMunicipal(empresaJsonBean.getInscricaoMunicipal());
            empresa.setTipoInscricaoEstadual(empresaJsonBean.getTipoInscricaoEstadual());
            empresa.setEmail(empresaJsonBean.getEmail());
            empresa.setTelefone(empresaJsonBean.getTelefone());
            empresa.setCelular(empresaJsonBean.getCelular());
            empresa.setOptanteSimplesNacional(empresaJsonBean.getOptanteSimplesNacional());
            empresa.setCnaePrincipal(empresaJsonBean.getCnaePrincipal());
            empresa.setNire(empresaJsonBean.getNire());
            empresa.setDataNire(empresaJsonBean.getDataNire());
            empresa.setCep(empresaJsonBean.getCep());
            empresa.setEndereco(empresaJsonBean.getEndereco());
            empresa.setBairro(empresaJsonBean.getBairro());
            empresa.setNumero(empresaJsonBean.getNumero());
            empresa.setComplemento(empresaJsonBean.getComplemento());

            Cidade cidade = cidadeRepository.findById(empresaJsonBean.getCidade());
            if (cidade != null) {
                empresa.setCidade(cidade);
            }

            Estado estado = estadoRepository.findById(empresaJsonBean.getEstado());
            if (estado != null) {
                empresa.setEstado(estado);
            }

            empresa.setPais(empresaJsonBean.getPais());

            if (empresaJsonBean.getId() != null) {
                empresa.setId(empresaJsonBean.getId());
            } else {
                String dataCadastro = simpleDateFormatBanco.format(new Date());
                empresa.setDataCadastro(simpleDateFormatBanco.parse(dataCadastro));
            }

            empresa.setAtivo(empresaJsonBean.getAtivo());
        } catch (ParseException ex) {
            Logger.getLogger(EmpresaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.empresaRepository.save(empresa);
        List<String> mensagem = new ArrayList<>();
        mensagem.add("Empresa Salva com sucesso");
        this.responseJsonBean.setMensagens(mensagem);
        return this.responseJsonBean;
    }

}
