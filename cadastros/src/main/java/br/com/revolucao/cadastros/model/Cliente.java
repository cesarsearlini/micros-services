package br.com.revolucao.cadastros.model;

/**
 * Created by Cesar Searlini
 */

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Cesar Searlini
 */
public class Cliente implements Serializable {

    private String tipo;
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;
//    Classificação de Pessoa{
//        Consumidor Final
//        Produtos Rural
//        Revendedor
//                Solidário
//        Exportador
//        Não se aplica
//    }
    private String classificacaoConsumidor;
    private String inscricaoSuframa;
    private String inscricaoMunicipal;
    private Boolean optanteSimplesNacional;
    private String telefone;
    private String celular;
    private String email;
    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    //cidade
    //estado
    private String Observacao;
    private Boolean status;
    private Date dataCadastro;


}

