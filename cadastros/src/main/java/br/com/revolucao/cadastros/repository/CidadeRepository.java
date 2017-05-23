/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.repository;

import br.com.revolucao.cadastros.model.Cidade;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Cesar Searlini
 */
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    Cidade findById(@Param("id") Long id);

}
