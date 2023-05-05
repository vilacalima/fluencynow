<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="pt-BR">

<spring:url value="resources/css/all.min.css" var="allminCSS" />
<spring:url value="resources/css/administrador.css" var="administradorCSS" />


<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<head>


    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="${allminCSS}">


    <link rel="stylesheet" href="${administradorCSS}" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
</head>

<body>

    <header>
        <nav class="navbar navbar-expand-md navbar-light bg-light">
            <div class="container-fluid">

                <a class="navbar-brand" href="#">
                    <img src="resources/images/Logo.png" alt="Logo" style="height: 150px;">
                </a>

                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="admin-btn">Pagina Inicial</a>
                    </li>
                </ul>
            </div>
        </nav>
    </header>

    <body>
        <h3>Contorle de Alunos</h3>
        <div class="container1">

            <div class="bnt-group" aria-label="arial">

                <input class="pesquisa" type="search" placeholder="Pesquisar" aria-label="Search"
                    style="border-right: none;">
                <a class="btn btn3" href="cadastrar">Editar aluno +</a>
            </div>
        </div>

        <div class="conteiner">
              <table class="table table-striped">
                  <tr>
                      <th>Nome</th>
                      <th>CPF</th>
                      <th>Email</th>
                      <th>Dia da semana</th>
                      <th>Horario</th>
                  </tr>
                  <c:forEach items="${Alunos.alunos}" var="aluno" varStatus="tagStatus">
                      <tr>
                          <td>${aluno.nome}</td>
                          <td>${aluno.cpf}</td>
                          <td>${aluno.email}</td>
                          <td>${aluno.diaAula}</td>
                          <td>${aluno.horarioAula}</td>
                      </tr>
                  </c:forEach>
              </table>
        </div>

        <h1>Controle de Planos</h1>
        <div class="container1">

            <div class="bnt-group" aria-label="arial">

                <input class="pesquisa" type="search" placeholder="Pesquisar" aria-label="Search"
                    style="border-right: none;">
                <a class="btn btn3" href="cadastrarAluno">Editar Plano +</a>
            </div>
        </div>

        <div class="conteiner">
          <table class="table table-striped">
              <tr>
                  <th>ID</th>
                  <th>Descricao</th>
                  <th>Valor</th>
              </tr>
              <c:forEach items="${Planos.planos}" var="plano" varStatus="tagStatus">
                  <tr>
                      <td>${plano.id}</td>
                      <td>${plano.nome}</td>
                      <td>${plano.valor}</td>
                  </tr>
              </c:forEach>
          </table>
        </div>

        <!-- Scripts do Bootstrap -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
            integrity="sha384-wiJyZO0jX6hh60ggnIh0YzZU6QIXx4jI0gblZWfD0yE6fr5XhLgB1CxojrbjzlzF"
            crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>

    <footer class="footer_principal" style="background-color: #8CB3FD;">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-md-3">
                    <img src="resources/images/Logo.png" alt="Logo" style="height: 150px;">
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

</html>