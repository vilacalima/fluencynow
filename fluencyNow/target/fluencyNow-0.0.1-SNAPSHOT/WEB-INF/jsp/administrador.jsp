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

    <link rel="stylesheet" href="../../resources/css/administrador.css">

    <link rel="stylesheet" href="${administradorCSS}" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>

    <header>
        <nav class="navbar navbar-expand-md navbar-light bg-light">
            <div class="container-fluid">

                <a class="navbar-brand1" href="home">
                    <img src="resources/images/Logo.png" alt="Logo" style="height: 150px;">
                </a>

                <!-- <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="admin-btn" href="home">Pagina Inicial</a>
                    </li>
                </ul> -->
<div class="text-boasvindas ml-auto text-right">
    <p class="bem-vindo">Cadastro Aluno</p>
    <p>Olá, Helena!</p>
</div>
            
        </nav>
    </header>

    <c:if test="${not empty mensagem}">
        <div class="alert alert-success">${mensagem}</div>
    </c:if>
    <c:if test="${not empty mensagemErro}">
        <div class="alert alert-danger">${mensagemErro}</div>
    </c:if>
    <body>
        <h3>Calendário de Aulas</h3>
        <div class="calendario">

            <table class="table calendario">
                <tr>
                    <th>Horários</th>
                    <th>Segunda</th>
                    <th>Terça</th>
                    <th>Quarta</th>
                    <th>Quinta</th>
                    <th>Sexta</th>
                </tr>
                <tr>
                    <c:forEach items="${DiaAula.diaAula}" var="diaAula" varStatus="tagStatus">
                        <tr>
                            <td>${diaAula.horario}</td>
                            <td>${diaAula.segunda}</td>
                            <td>${diaAula.terca}</td>
                            <td>${diaAula.quarta}</td>
                            <td>${diaAula.quinta}</td>
                            <td>${diaAula.sexta}</td>
                        </tr>
                    </c:forEach>   
                </tr>
            </table>

        </div>

        <div class="container-cards">
            <div class="row justify-content-center">
              <div class="col-md-3 mb-3">
                <div class="card bg-white">
                  <div class="card-body">
                    <h4 class="card-title"><b>Total de alunos</b></h4>
                    <p class="card-text">${quantidadeAluno}</p>
                  </div>
                </div>
              </div>
              <div class="col-md-3 mb-3">
                <div class="card bg-white">
                  <div class="card-body">
                    <h4 class="card-title"><b>Horas ministradas</b></h4>
                    <p class="card-text">${horasMinistradas}.</p>
                  </div>
                </div>
              </div>
              <div class="col-md-3 mb-3">
                <div class="card bg-white">
                  <div class="card-body">
                    <h4 class="card-title"><b>Aulas disponiveis</b></h4>
                    <p class="card-text">${aulasDisponiveis}.</p>
                  </div>
                </div>
              </div>
            </div>
            <div class="row justify-content-center">
              <div class="col-md-3 mb-3">
                <div class="card bg-white">
                  <div class="card-body">
                    <h4 class="card-title"><b>Rendimento semanal</b></h4>
                    <p class="card-text">${rendimentoSemanal}</p>
                  </div>
                </div>
              </div>
            </div>
          </div>

        <h3>Controle de Alunos</h3>
        <div class="container1">

            <div class="bnt-group" aria-label="arial">

                <a class="btn btn8" href="cadastrar">Editar aluno +</a>
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

        <h3>Controle de Planos</h3>
        <div class="container1">

            <div class="bnt-group" aria-label="arial">


                <input class="pesquisa" type="search" placeholder="Pesquisar" aria-label="Search"
                    style="border-right: none;">
                <a class="btn btn3" href="cadastrar">Editar Plano +</a>

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