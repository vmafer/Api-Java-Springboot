# Api-Java-Springboot


 
<div>
<h1> O Projeto </h1>
  
  <p> API criada utilizando o framework Spring Boot e a linguagem Java, que realiza os métodos CRUD (Create, Read, Update, e Delete), conectada com o Front-End através da biblioteca React js.</p>

  <h2>Entidades do Projeto</h2>
    <li> Cliente - id:{type: Integer} nome: {type: String}, cpf: {type: String}</li>
    <li> Produto - id:{type: Integer}, nome:{type: String}, preco:{type: Double}, desconto: {type: Double}</li>
   
    
</ul>
</div>
 
 <div> 
  <h3> Tecnologias utilizadas </h3>
   <ul>
     <li> Git</li>
     <li> Spring Boot</li>
     <li>MySQL</li>
     <li>Postman</li>
     <li>React js</li>
   </ul>
 </div>
 
 <div>
 <h3>Métodos e Rotas</h3>
  Por meio dos métodos HTTP, será manipulado os dados de acordo com a necessidade dos usuários.

<ul> 
 <li>Para a entidade <b>Clientes</b>, os métodos e rotas serão: </li>

| MÉTODO |     ROTA             |             AÇÃO              |
|------- | -------------------  | ------------------------------|
|GET     | /api/clientes        |   Exibir todos os Clientes    |
|GET     | /api/clientes/:id    |   Buscar Cliente por Id       |
|POST    | /api/clientes        |   Cadastrar Cliente           |
|PUT     | /api/clientes        | Alterar infos do cliente      |
|DELETE  | /api/clientes/:id    |   Excluir Cliente Selecionado |
  
 <li>Para a entidade <b>Produtos</b>, os métodos e rotas serão: </li>

| MÉTODO |     ROTA             |             AÇÃO              |
|------- | -------------------  | ------------------------------|
|GET     | /api/produtos        |   Exibir todos os Produtos    |
|GET     | /api/produtos/:id    |   Buscar Produto por Id       |
|POST    | /api/produtos        |   Cadastrar Produto           |
|PUT     | /api/produtos        | Alterar infos do Produto      |
|DELETE  | /api/produtos/:id    |   Excluir Produto Selecionado |


 </div>
 

 

 
