package br.com.revolucao.cadastros.bean;

import br.com.revolucao.cadastros.model.Estado;
import java.util.List;


/**
 *
 * @author Cesar Searlini <cesar.searlini@gmail.com>
 * @param <E>
 */
public class ResponseJsonBean<E> {

    private List<E> list;

    public List<E> getList() {
        return list;
    }

    public void setEstados(List<? extends Estado> element) {
        this.list = (List<E>) element;
    }
    
    public void setMensagens(List<? extends String> element){
        this.list = (List<E>) element;
    }
    
}