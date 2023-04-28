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
        <h1>Alunos</h1>
        <div class="container1">

            <div class="bnt-group" aria-label="arial">

                <input class="pesquisa" type="search" placeholder="Pesquisar por CPF" aria-label="Search"
                    style="border-right: none;">

                <a class="btn btn3" href="cadastrar">Novo aluno +</a>
            </div>
        </div>

                        <div class="conteiner">
                                          <table class="table table-striped">
                                              <tr>
                                                  <th>Nome</th>
                                                  <th>CPF</th>
                                                  <th>Data Nascimento</th>
                                                  <th>Endereço</th>
                                                  <th>CEP</th>
                                                  <th>Numero</th>
                                                  <th>Celular</th>
                                                  <th>Email</th>
                                              </tr>
                                              <c:forEach items="${Alunos.alunos}" var="aluno" varStatus="tagStatus">
                                                  <tr>
                                                      <td>${aluno.nome}</td>
                                                      <td>${aluno.cpf}</td>
                                                      <td>${aluno.dataNasc}</td>
                                                      <td>${aluno.endereco}</td>
                                                      <td>${aluno.cep}</td>
                                                      <td>${aluno.numero}</td>
                                                      <td>${aluno.celular}</td>
                                                      <td>${aluno.email}</td>
                                                             <td>
                                                                                              <form action="deletarAluno" method="post">
                                                                                                  <input type="hidden" id="cpf" name="cpf" value="${aluno.cpf}">
                                                                                                  <button type="submit">Delete</button>
                                                                                                  <span> | </span>
                                                                                                  <a href="index.jsp?id=${aluno.nome}&name=${aluno.cpf}">Update</a>
                                                                          </tr>
                                                                          </td>

                                                  </tr>
                                              </c:forEach>
                                          </table>
                                  </div>




                    <h6>Plano</h6>

                    <select class="form-select" aria-label="Default select example">

                        <option selected>Canadá 2 dias da sermana</option>
                        <option value="1">Mexico 2 dias da semana</option>
                        <option value="2">EUA 1 dia da semana - Grupo</option>
                        <option value="3">Espanha 1 dia da semana - Grupo</option>
                    </select>

                    <h6>Dia</h6>

                    <select class="form-select" aria-label="Default select example">
                        <option selected> Segunda-Feira</option>
                        <option value="1">Terça-Feira</option>
                        <option value="2">Quarta-feira</option>
                        <option value="3">Quinta-Feira</option>
                        <option value="3">Sexta-Feira</option>

                    </select>

                    <h6>Horário</h6>
                    <select class="form-select" aria-label="Default select example">
                        <option selected> 08:00 </option>
                        <option value="1">10:00</option>
                        <option value="2">12:00</option>
                        <option value="3">14:00</option>
                        <option value="3">16:00</option>
                        <option value="3">18:00</option>
                    </select>

                    <button type="button" class="btn btn5">Salvar

                    </button>

                </form>
                </div>
                <h1>Cadastro Plano</h1>
                <div class="container1">
                    <div class="bnt-group" aria-label="arial">
                        <input class="pesquisa" type="search" placeholder="Pesquisar" aria-label="Search"
                            style="border-right: none;">


                    </div>

                </div>

                </div>


                    <h1>Procurar Plano</h1>
                    <div class="container1">


                        <div class="row">
                            <div class="campoNome">
                                Nome <input type="text" class="form-control" placeholder="Eua - 1 dia da semana"
                                    aria-label="First name">
                            </div>
                            <div class="campoValor">
                                Valor<input type="text" class="form-control" placeholder="R$160,00" aria-label="Last name">

                                </div>
                                <button type="button" class="btn btn5">Salvar

                                </button>

                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        </div>

        <!-- Scripts do Bootstrap -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
            integrity="sha384-wiJyZO0jX6hh60ggnIh0YzZU6QIXx4jI0gblZWfD0yE6fr5XhLgB1CxojrbjzlzF"
            crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
    <footer class="footer" style="background-color: #8CB3FD;">
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