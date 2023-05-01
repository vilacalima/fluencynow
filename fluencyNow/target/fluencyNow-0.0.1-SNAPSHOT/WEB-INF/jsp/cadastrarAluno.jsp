<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
                                    <a class="admin-btn" href="administrador">Administrador</a>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </header>

                <body>
                    <h1>Procurar Alunos</h1>
                    <div class="container1">

                        <div class="bnt-group" aria-label="arial">

                            <input class="pesquisa" type="search" placeholder="Pesquisar" aria-label="Search"
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
                                            <button type="submit" class="btn btn1">Delete</button>
                                            <span> | </span>
                                        </form>
                                        <a class="btn btn2"
                                            href="index.jsp?id=${aluno.nome}&name=${aluno.cpf}">Update</a>
                                </tr>
                                </td>

                                </tr>
                            </c:forEach>
                        </table>
                    </div>

                    <h1>Cadastro</h1>
                    <div class="container2">
                        <form action="cadastrarAluno" method="post" class="formCadastrar">

                            <div class="col-md-8">
                                <p>Digite os seus dados de acesso no campo abaixo.</p>

                                <form class="formulario-contato2">
                                    <div class="form-group">
                                        <label for="nome"></label>
                                        <input type="text" name="nome" placeholder="Nome" autofocus="true" />
                                    </div>
                                    <div class="form-group">
                                        <label for="cpf"></label>
                                        <input type="text" name="cpf" placeholder="CPF" />
                                    </div>
                                    <div class="form-group">
                                        <label for="data-nascimento"></label>
                                        <input type="text" name="dataNasc" placeholder="Data de nascimento" />
                                    </div>
                                    <div class="form-group">
                                        <label for="endereco"></label>
                                        <input type="text" name="endereco" placeholder="Endereço" />
                                    </div>

                                    <div class="form-group">
                                        <label for="cep"></label>
                                        <input type="text" name="cep" placeholder="CEP" /> <br />
                                    </div>

                                    <div class="form-group">
                                        <label for="numero"></label>
                                        <input type="text" name="numero" placeholder="Numero da casa" />
                                    </div>
                                    <div class="form-group">
                                        <label for="email"></label>
                                        <input type="text" name="email" placeholder="E-mail" />
                                    </div>

                                    <div class="form-group">
                                        <label for="celular"></label>
                                        <input type="text" name="celular" placeholder="Celular" />
                                    </div>
                                    
                                    <h6>Cadastrar Aula</h6>

                                    <h6>Plano</h6>

                                    <div class="form-group">
                                        <select class="form-select" aria-label="Default select example" type="text" name="planoNome">
                                            <c:forEach items="${Planos.planos}" var="plano" varStatus="tagStatus">
                                                <option>${plano.nome}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    
                                    <h6>Dia</h6>

                                    <div class="form-group">
                                        <select class="form-select" aria-label="Default select example" type="text" name="planoDia">
                                            <c:forEach items="${diasDaSemana}" var="diasDaSemana" varStatus="tagStatus">
                                                <option>${diasDaSemana}</option>
                                            </c:forEach>
                                        </select>
                                    </div>

                                    <h6>Horário</h6>

                                    <div class="form-group">
                                        <select class="form-select" aria-label="Default select example" type="text" name="planoHora">
                                            <c:forEach items="${horaAula}" var="horaAula" varStatus="tagStatus">
                                                <option>${horaAula}</option>
                                            </c:forEach>
                                        </select>
                                    </div>

                                    <input type="submit" value="Cadastrar" class="btn btn7" />
                                </form>
                            </div>
                    </div>

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

                </body>

            </html>