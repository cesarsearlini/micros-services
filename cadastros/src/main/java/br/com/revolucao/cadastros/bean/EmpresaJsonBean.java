/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.bean;

import br.com.revolucao.cadastros.enums.PaisEnum;
import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Cesar Searlini
 */
public class EmpresaJsonBean {

    private Long id;
    @NotEmpty(message = "Razao Social é obrigatório.")
    private String razaoSocial;
    @NotEmpty(message = "CNPJ é obrigatório.")
    private String cnpj;
    private String inscricaoEstadual;
    private String tipoInscricaoEstadual;
    private String inscricaoMunicipal;
    @NotEmpty(message = "E-mail é obrigatório.")
    private String email;
    private String telefone;
    private String celular;
    private Boolean optanteSimplesNacional;
    private String cnaePrincipal;
    private String nire;
    private Date dataNire;
    @NotEmpty(message = "CEP é obrigatório.")
    private String cep;
    @NotEmpty(message = "Endereço é obrigatório.")
    private String endereco;
    private String bairro;
    @NotEmpty(message = "Numero endereço é obrigatório.")
    private String numero;
    private String complemento;
    @NotNull(message = "Cidade é obrigatório.")
    private Long cidade;
    @NotNull(message = "Estado é obrigatório.")
    private Long estado;
    @NotNull(message = "Pais é obrigatório.")
    private PaisEnum pais;
    private Date dataCadastro;
    private Boolean ativo;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getTipoInscricaoEstadual() {
        return tipoInscricaoEstadual;
    }

    public void setTipoInscricaoEstadual(String tipoInscricaoEstadual) {
        this.tipoInscricaoEstadual = tipoInscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Boolean getOptanteSimplesNacional() {
        return optanteSimplesNacional;
    }

    public void setOptanteSimplesNacional(Boolean optanteSimplesNacional) {
        this.optanteSimplesNacional = optanteSimplesNacional;
    }

    public String getCnaePrincipal() {
        return cnaePrincipal;
    }

    public void setCnaePrincipal(String cnaePrincipal) {
        this.cnaePrincipal = cnaePrincipal;
    }

    public String getNire() {
        return nire;
    }

    public void setNire(String nire) {
        this.nire = nire;
    }

    public Date getDataNire() {
        return dataNire;
    }

    public void setDataNire(Date dataNire) {
        this.dataNire = dataNire;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Long getCidade() {
        return cidade;
    }

    public void setCidade(Long cidade) {
        this.cidade = cidade;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public PaisEnum getPais() {
        return pais;
    }

    public void setPais(PaisEnum pais) {
        this.pais = pais;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
