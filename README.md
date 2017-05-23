## Micro Services - "Projeto em Desenvolvimento".
  
  Micros Serviços - JSON. Cadastro de Empresas e Consulta Cidade, Estado e Tributos Plataforma Fiscal. 
  
  Rest http://localhost:8082/ - Cadastro 
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

  Listar todas | {url}/empresas/</br>
  Get Empresa por ID | {url}/empresa/{id}</br>
  Cadastrar Empresa | {url}/empresa/</br>

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

  Listar Pais | {url}/paises/</br>
  Get Pais por Codigo | {url}/pais/{codigoPais}</br>
   
## Estado - [ MicroService ]  
  
  Listar estados | {url}/estados/</br>
  Listar estados e cidades | {url}/estadosCidades/</br>
  Get estado por ID | {url}/estado/codigo/{id}</br>
  Get Estado por Sigla | {url}/estado/sigla/{sigla}</br>
  Estado Cidades p/ Sigla | {url}/estadoCidades/sigla/{sigla}</br>
  Estado Cidades p/ Id | {url}/estadoCidades/codigo/{id}</br>
  
## Cidade - [ MicroService ]   

  Listar Cidades | {url}/cidades</br>
  Get Cidade por ID | {url}/cidades/{id}</br>
  Ger Cidade e Estado | {url}/cidadeEstado/{id}</br>

## Tributos Empresa e Produtos - [ MicroService - Tributos]

  Web Service: http://localhost:8080/tributos/{URL_METODO}</br>
  Micro Service: http://localhost:8083/{URL_METODO}</br>

  ## Consultas
  * Regimes tributario da empresa. 
  Regime | {url}regimesTributarios</br></br>
  * CST ICMS </br>
  CST ICMS Empresas Lucro Real e Presumido | {url}/cstICMS/lucrosNormais</br>
  CST ICMS Empresas Cadastrada no Simples Nacional | {url}/cstICMS/simplesNacional</br>
  CST IPI Entrada | {url}/cstIPI/entrada</br></br>
  * CST IPI </br>
  CST IPI Saida Empresas Lucro Real e Presumido | {url}/cstIPI/saida/lucrosNormais</br>
  CST IPI Saida Empresas Cadastrada no Simples Nacional | {url}/cstIPI/saida/simplesNacional</br></br>
  * CST PIS COFINS</br>
  CST PIS COFINS Empresas Lucro Real e Presumido | {url}/cstPisCofins/lucrosNormais</br>
  CST PIS COFINS Empresas Cadastrada no Simples Nacional | {url}/cstPisCofins/simplesNacional</br></br>
  * MERCADORIA</br>
  Origem | {url}/origemMercadoria</br>
  Tipo | {url}/tipoMercadoria</br>  
  
