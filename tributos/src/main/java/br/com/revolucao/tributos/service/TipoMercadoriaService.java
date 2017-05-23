/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.tributos.service;

import br.com.revolucao.tributos.bean.TipoMercadoria;
import br.com.revolucao.tributos.enums.TipoMercadoriaEnum;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar Searlini
 */
@Service
public class TipoMercadoriaService {

    public List<TipoMercadoria> getAllTipoMercadoria() {
        List<TipoMercadoria> listResult = new ArrayList<>();
        for (TipoMercadoriaEnum value : TipoMercadoriaEnum.values()) {
            TipoMercadoria tipoMercadoria = new TipoMercadoria(value.toString(), value.getCodigo(), value.getDescricao());
            listResult.add(tipoMercadoria);
        }
        return listResult;
    }

}
