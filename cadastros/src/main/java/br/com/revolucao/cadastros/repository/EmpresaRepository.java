/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.repository;

import br.com.revolucao.cadastros.model.Empresa;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Cesar Searlini
 */
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    Empresa findById(@Param("id") Long id);

}
