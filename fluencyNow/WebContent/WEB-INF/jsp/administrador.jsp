<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

<head>
  <spring:url value="resources/css/all.min.css" var="allminCSS" />
  <spring:url value="resources/index.css" var="indexCSS" />

  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Exemplo de cabcalho responsivo</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="${allminCSS}">


  <link rel="stylesheet" href="${indexCSS}" />
  <!-- <link rel="stylesheet" href="reset.css"> -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
  <!-- //FONTE NOVA -->
</head>

<header>
  <nav class="navbar navbar-expand-md navbar-light bg-light">
    <div class="container-fluid">
      <!-- Logotipo na parte esquerda -->
      <a class="navbar-brand" href="#">
        <img src="resources/images/Logo.png" alt="Logo" style="height: 150px;">
      </a>

      <!-- Bot�o de administrador no canto superior direito -->
      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <a class="admin-btn" href="login">Administrador</a>
        </li>
      </ul>
    </div>
  </nav>
</header>

<body>
  <div class="container">
    <h2>Procurar Alunos</h2>
    <form class="row row-cols-lg-auto g-3 align-items-center">
      <table class="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col"> Nome </th>
            <th scope="col"> CPF </th>
            <th scope="col"> E-mail </th>
            <th scope="col"> Horario </th>
            <th scope="col"> Semanal </th>
          </tr>
        </thead>
        <tbody>
          <c:forEach items="${Alunos.alunos}" var="aluno" varStatus="tagStatus">
            <tr>
              <th scope="row">1</th>
              <td>${aluno.nome}</td>
              <td>${aluno.cpf}</td>
              <td>${aluno.email}</td>
              <td>07h as 08h</td>
              <td> Quinta - feira </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </form>
  </div>

  <div class="container">
    <h1>Cadastro</h1>
    <div class="col-md-6">
      <form action="cadastrarAluno" method="post" class="formulario-contato">
          <div class="form-group">
            <label>Nome</label>
            <input name="nome" type="text" class="form-control" id="cadastronome" placeholder="Nome">
          </div>
          <div class="form-group">
            <label>CPF</label>
            <input name="cpf" type="text" class="form-control" id="cadastroCPF" placeholder="468-787-898-85">
          </div>
          <div class="form-group">
            <label>Data Nascimento</label>
            <input name="data" type="date" textarea class="form-control" id="cadastrodata-nascimento"
              placeholder="00/00/00"></textarea>
          </div>
          <div class="form-group">
            <label>Endereço</label>
            <input name="endereco" type="text" textarea class="form-control" id="cadastroendereco"
              placeholder="Rua FluencyNow"></textarea>
          </div>
          <div class="form-group">
            <label>Numero</label>
            <input name="numero" type="text" textarea class="form-control" id="cadastronumendereco"
              placeholder="01"></textarea>
          </div>
          <div class="form-group">
            <label>Email</label>
            <input name="email" type="text" textarea class="form-control" id="cadastroemail"
              placeholder="fluency@now.com.br"></textarea>
          </div>

          <div class="form-group">
            <label>Celular</label>
            <input name="celular" type="text" textarea class="form-control" id="cadastrotelefone"
              placeholder="(11) 12345-859"></textarea>

            <input type="submit" value="Cadastrar">

            <div>
              <a href="https://wa.me/5511945390855" class="btn btn-primary btn-cadastrar"> Cadastrar Aula <div
                  class="botaocadastrar">
                </div>
                <a>
            </div>
          </div>
      </form>
    </div> 
    
    <div>
      <table>
        <thead>
          <tr>
            <th scope="col">#Id</th>
            <th scope="col">Nome</th>
            <th scope="col">Valor</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <table class="table table-hover">
              <table class="table table-bordered">
                <th scope="row">1</th>
                <td>Canada 2 dias da semana</td>
                <td>teste@gmail.com</td>
          </tr>
          <tr>
            <th scope="row">2</th>
            <td>Mexico 2 dias da semana</td>
            <td>teste@gmail.com</td>
          </tr>
        </tbody>
      </table>
    </div>
    
    <div class="container">

      <h1>Procurar Plano de Aula</h1>
                
      <h1>Cadastro Plano</h1>

      <div class="row">
        <div class="col">
          <input type="text" class="form-control" placeholder="Eua - 1 dia da semana"
            aria-label="First name">
        </div>
        <div class="col">
          <input type="text" class="form-control" placeholder="R4160,00" aria-label="Last name">
          <div class="btn btn-primary btn-cadastraraula"> Cadastrar Plano <div
              class="botaocadastraraula">

          </div>
          </div>
          <a>
        </div>
      </div>
    </div>
  </div>
</body>

<footer class="footer" style="background-color: #8CB3FD;">
  <div class="container">
    <div class="row align-items-center">
      <div class="col-md-3">
        <img src="resources/images/Logo.png" alt="Logo" style="height: 150px;">
      </div>
      <div class="col-md-6 text-center">
        <p class="mb-0">Baixe nosso aplicativo</p>
        <a href="#"><i class="fab fa-android fa-2x"></i></a>
        <a href="#"><i class="fab fa-apple fa-2x"></i></a>

      </div>
      <div class="col-md-3 text-right">
        <a href="#"><i class="fab fa-facebook fa-2x"></i></a>
        <a href="#"><i class="fab fa-twitter fa-2x"></i></a>
        <a href="#"><i class="fab fa-whatsapp fa-2x"></i></a>
      </div>
    </div>
    <hr>
    <div class="row">
      <div class="col-md-12 text-center">
        <p>&copy; 2023 Todos os direitos reservados.</p>
      </div>
    </div>
  </div>
</footer>

<!-- Scripts do Bootstrap -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
  integrity="sha384-wiJyZO0jX6hh60ggnIh0YzZU6QIXx4jI0gblZWfD0yE6fr5XhLgB1CxojrbjzlzF"
  crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</html>


