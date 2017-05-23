/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.tributos.service;

import br.com.revolucao.tributos.bean.CstPisCofins;
import br.com.revolucao.tributos.enums.CstPisCofinsNormalEnum;
import br.com.revolucao.tributos.enums.CstPisCofinsSimplesEnum;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cesar Searlini
 */
@Service
public class CstPisCofinsService {

    public List<CstPisCofins> getCstPisConfinsNormal() {
        List<CstPisCofins> listResult = new ArrayList<>();
        for (CstPisCofinsNormalEnum value : CstPisCofinsNormalEnum.values()) {
            CstPisCofins cstPisCofins = new CstPisCofins(value.toString(), value.getCodigo(), value.getDescricao());
            listResult.add(cstPisCofins);
        }
        return listResult;
    }
    
    public List<CstPisCofins> getCstPisConfinsSimples() {
        List<CstPisCofins> listResult = new ArrayList<>();
        for (CstPisCofinsSimplesEnum value : CstPisCofinsSimplesEnum.values()) {
            CstPisCofins cstPisCofins = new CstPisCofins(value.toString(), value.getCodigo(), value.getDescricao());
            listResult.add(cstPisCofins);
        }
        return listResult;
    }

}
