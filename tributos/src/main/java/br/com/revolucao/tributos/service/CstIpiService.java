/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.tributos.service;

import br.com.revolucao.tributos.bean.CstIpi;
import br.com.revolucao.tributos.enums.CstIpiEntradaEnum;
import br.com.revolucao.tributos.enums.CstIpiSaidaNormalEnum;
import br.com.revolucao.tributos.enums.CstIpiSaidaSimplesEnum;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar Searlini
 */
@Service
public class CstIpiService {

    public List<CstIpi> getAllEntrada() {
        List<CstIpi> listResult = new ArrayList<>();
        for (CstIpiEntradaEnum value : CstIpiEntradaEnum.values()) {
            CstIpi cstIpi = new CstIpi(value.toString(), value.getCodigo(), value.getDescricao());
            listResult.add(cstIpi);
        }
        return listResult;
    }

    public List<CstIpi> getAllSaidaRegimeNormal() {
        List<CstIpi> listResult = new ArrayList<>();
        for (CstIpiSaidaNormalEnum value : CstIpiSaidaNormalEnum.values()) {
            CstIpi cstIpi = new CstIpi(value.toString(), value.getCodigo(), value.getDescricao());
            listResult.add(cstIpi);
        }
        return listResult;
    }

    public List<CstIpi> getAllSaidaSimplesNacional() {
        List<CstIpi> listResult = new ArrayList<>();
        for (CstIpiSaidaSimplesEnum value : CstIpiSaidaSimplesEnum.values()) {
            CstIpi cstIpi = new CstIpi(value.toString(), value.getCodigo(), value.getDescricao());
            listResult.add(cstIpi);
        }
        return listResult;
    }

}
