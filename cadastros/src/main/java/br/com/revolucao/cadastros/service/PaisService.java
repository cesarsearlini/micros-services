/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.service;

import br.com.revolucao.cadastros.enums.PaisEnum;
import br.com.revolucao.cadastros.bean.Pais;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar Searlini
 */
@Service
public class PaisService {

    public List<Pais> getPaises() {
        List<Pais> listResult = new ArrayList<>();
        for (PaisEnum value : PaisEnum.values()) {
            Pais pais = new Pais();
            pais.setId(value.getCodigo());
            pais.setNome(value.getPais());
            listResult.add(pais);
        }
        return listResult;
    }

    public Pais getPaisCodigo(String codigo) {
        Pais pais = new Pais();
        pais.setId(PaisEnum.fromCode(codigo).getCodigo());
        pais.setNome(PaisEnum.fromCode(codigo).getPais());
        return pais;
    }
   

}
