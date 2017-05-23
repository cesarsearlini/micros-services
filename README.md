## Micro Services - "Projeto em Desenvolvimento".
  
  Micros Serviços - JSON. Cadastro de Empresas e Consulta Cidade, Estado e Tributos Plataforma Fiscal. 
  
  * Framework's utilizado. 
    > Spring Boot</br>
    > Spring RESTful</br>
    > Spring Data</br>
    > Spring Clound</br>
    > Flyway</br>
  * Banco de Dados 
    > Postgres</br> 
 
    
## Empresa - [ MicroService ]

  Web Service: http://localhost:8080/cadastro/{URL_METODO}
  Micro Service: http://localhost:8082/{URL_METODO}

  Listar todas | {url}/empresas/
  Get Empresa por ID | {url}/empresa/{id}
  Cadastrar Empresa | {url}/empresa/  

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

  Listar Cidades | {url}/cidades
  Get Cidade por ID | {url}/cidades/{id}
  Ger Cidade e Estado | {url}/cidadeEstado/{id}
