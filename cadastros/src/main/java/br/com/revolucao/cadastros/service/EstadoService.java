/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.service;

import br.com.revolucao.cadastros.bean.EstadoCidadeResponseBean;
import br.com.revolucao.cadastros.model.Estado;
import br.com.revolucao.cadastros.repository.EstadoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar Searlini
 */
@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;
        
    public List<EstadoCidadeResponseBean> getEstadosCidades(){
        List<Estado> estadosList = this.estadoRepository.findAll();
        List<EstadoCidadeResponseBean> resultEstados = new ArrayList<>();
        estadosList.stream().map((estado) -> new EstadoCidadeResponseBean(estado)).forEachOrdered((e) -> {
            resultEstados.add(e);
        });
        return resultEstados;
    }
    
    public EstadoCidadeResponseBean getEstadoCidades(Long id){
        Estado estado = this.estadoRepository.findById(id);
        EstadoCidadeResponseBean estadoCidadeResponseBean = new EstadoCidadeResponseBean(estado);
        return estadoCidadeResponseBean;
    }
    
    public EstadoCidadeResponseBean getEstadoCidades(String sigla){
        Estado estado = this.estadoRepository.findBySigla(sigla);
        EstadoCidadeResponseBean estadoCidadeResponseBean = new EstadoCidadeResponseBean(estado);
        return estadoCidadeResponseBean;
    }

}
