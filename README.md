## Micro Services - "Projeto em Desenvolvimento".
  
  Micros Serviços - JSON. Cadastro de Empresas e Consulta Cidade, Estado e Tributos Plataforma Fiscal. 
  
  Rest http://localhost:8082/ - Cadastro </br>
  Rest http://localhost:8083/ - Tributos 
  
  * Framework's utilizado. 
    > Spring Boot</br>
    > Spring RESTful</br>
    > Spring Data</br>
    > Spring Cloud</br>
    > Flyway</br>
  * Banco de Dados 
    > Postgres</br> 
 
    
## Empresa - [ MicroService - Cadastro]

  Web Service: http://localhost:8080/cadastro/{URL_METODO}</br>
  Micro Service: http://localhost:8082/{URL_METODO}

  Listar todas | http://localhost:8080/cadastro/empresas/</br>
  Get Empresa por ID | http://localhost:8080/cadastro/empresa/{id}</br>
  Cadastrar Empresa | http://localhost:8080/cadastro/empresa/</br>

  ```Modelo de Json
    {
        "razaoSocial": "Cesar Alexandre Searlini Junior",
        "cnpj": "111.111.111-11",
        "inscricaoEstadual": "11.111.111",
        "tipoInscricaoEstadual": "",
        "inscricaoMunicipal": "",
        "email": "teste.teste@teste.com",
        "telefone": "",
        "celular": "11-1111-1111",
        "optanteSimplesNacional": "false",
        "cnaePrincipal": "",
        "nire": "",
        "dataNire": "",
        "cep": "13310-610",
        "endereco": "Francisco Rodrigues da Costa 222",
        "bairro": "Parque das Rosas",
        "numero": "222",
        "complemento": "BL 14 AP 203",
        "cidade": 3523909,
        "estado": 35,
        "pais": 29,
        "ativo": true
    }
  
    JSON - Campos Obrigatórios para Cadastro { 
      razaoSocial, cnpj, email, cep,  endereco, numero, complemento, cidade, estado, pais
    }
  ```
  
## Pais - [ MicroService ]  

  Listar Pais | http://localhost:8080/cadastro/paises/</br>
  Get Pais por Codigo | http://localhost:8080/cadastro/pais/{codigoPais}</br>
   
## Estado - [ MicroService ]  
  
  Listar estados | http://localhost:8080/cadastro/estados/</br>
  Listar estados e cidades | http://localhost:8080/cadastro/estadosCidades/</br>
  Get estado por ID | http://localhost:8080/cadastro/estado/codigo/{id}</br>
  Get Estado por Sigla | http://localhost:8080/cadastro/estado/sigla/{sigla}</br>
  Estado Cidades p/ Sigla | http://localhost:8080/cadastro/estadoCidades/sigla/{sigla}</br>
  Estado Cidades p/ Id | http://localhost:8080/cadastro/estadoCidades/codigo/{id}</br>
  
## Cidade - [ MicroService ]   

  Listar Cidades | http://localhost:8080/cadastro/cidades</br>
  Get Cidade por ID | http://localhost:8080/cadastro/cidades/{id}</br>
  Ger Cidade e Estado | http://localhost:8080/cadastro/cidadeEstado/{id}</br>

## Tributos Empresa e Produtos - [ MicroService - Tributos]

  Web Service: http://localhost:8080/tributos/{URL_METODO}</br>
  Micro Service: http://localhost:8083/{URL_METODO}</br>

  ## Consultas
  * Regimes tributario da empresa. 
  Regime | http://localhost:8080/tributos/regimesTributarios</br></br>
  * CST ICMS </br>
  CST ICMS Empresas Lucro Real e Presumido | http://localhost:8080/tributos/cstICMS/lucrosNormais</br>
  CST ICMS Empresas Cadastrada no Simples Nacional | http://localhost:8080/tributos/cstICMS/simplesNacional</br>
  CST IPI Entrada | {url}/cstIPI/entrada</br></br>
  * CST IPI </br>
  CST IPI Saida Empresas Lucro Real e Presumido | http://localhost:8080/tributos//cstIPI/saida/lucrosNormais</br>
  CST IPI Saida Empresas Cadastrada no Simples Nacional | http://localhost:8080/tributos/cstIPI/saida/simplesNacional</br></br>
  * CST PIS COFINS</br>
  CST PIS COFINS Empresas Lucro Real e Presumido | http://localhost:8080/tributos/cstPisCofins/lucrosNormais</br>
  CST PIS COFINS Empresas Cadastrada no Simples Nacional | http://localhost:8080/tributos/cstPisCofins/simplesNacional</br></br>
  * MERCADORIA</br>
  Origem | http://localhost:8080/tributos/origemMercadoria</br>
  Tipo | http://localhost:8080/tributos/tipoMercadoria</br>  
  
