package br.com.revolucao.cadastros.bean;

import java.util.List;


/**
 *
 * @author Cesar Searlini <cesar.searlini@gmail.com>
 * @param <E>
 */
public class RequestJsonBean<E> {

    private List<E> list;

    public List<E> getList() {
        return list;
    }
    
}