/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.tributos.service;

import br.com.revolucao.tributos.bean.RegimeTributario;
import br.com.revolucao.tributos.enums.RegimeTributarioEnum;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar Searlini
 */
@Service
public class RegimeTributarioService {

    public List<RegimeTributario> getAllRegimeTributario() {
        List<RegimeTributario> listResult = new ArrayList<>();
        for (RegimeTributarioEnum value : RegimeTributarioEnum.values()) {
            RegimeTributario regimeTributario = new RegimeTributario(value.toString(), value.getDescricao());
            listResult.add(regimeTributario);
        }
        return listResult;
    }

}
