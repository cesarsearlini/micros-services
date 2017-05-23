/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.tributos.service;

import br.com.revolucao.tributos.bean.CstIcms;
import br.com.revolucao.tributos.enums.CstIcmsNormalEnum;
import br.com.revolucao.tributos.enums.CstIcmsSimplesEmum;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar Searlini
*/
@Service
public class CstIcmsService {

    public List<CstIcms> getAllRegimeNormal(){
        List<CstIcms> listResult = new ArrayList<>();
        for (CstIcmsNormalEnum value : CstIcmsNormalEnum.values()) {
            CstIcms cstIcms = new CstIcms(value.toString(), value.getCodigo() ,value.getDescricao());
            listResult.add(cstIcms);
        }
        return listResult;
    }
    
    public List<CstIcms> getAllSimplesNacional(){
        List<CstIcms> listResult = new ArrayList<>();
        for (CstIcmsSimplesEmum value : CstIcmsSimplesEmum.values()) {
            CstIcms cstIcms = new CstIcms(value.toString(), value.getCodigo() ,value.getDescricao());
            listResult.add(cstIcms);
        }
        return listResult;
    }

}