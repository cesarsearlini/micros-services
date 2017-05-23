/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.tributos.service;

import br.com.revolucao.tributos.bean.OrigemMercadoria;
import br.com.revolucao.tributos.enums.OrigemMercadoriaEnum;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar Searlini
 */
@Service
public class OrigemMercadoriaService {

    public List<OrigemMercadoria> getAllOrigenMercadoria() {
        List<OrigemMercadoria> listResult = new ArrayList<>();
        for (OrigemMercadoriaEnum value : OrigemMercadoriaEnum.values()) {
            OrigemMercadoria origemMercadoria = new OrigemMercadoria(value.toString(), value.getCodigo(), value.getDescricao());
            listResult.add(origemMercadoria);
        }
        return listResult;
    }

}
