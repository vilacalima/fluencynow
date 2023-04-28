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

    <div class="page">
       <form action="cadastrarAluno" method="post" class="formCadastrar">
        <h1>Cadastrar Aluno</h1>
        <p>Digite os seus dados de acesso no campo abaixo.</p>
        Nome: <input type="text" name="nome" placeholder="Digite seu nome" autofocus="true" /> <br />
        CPF: <input type="text" name="cpf" placeholder="Digite seu CPF" /> <br />
        DataNascimento: <input type="text" name="dataNasc" placeholder="Digite sua data de nascimento" /> <br />
        Endereço: <input type="text" name="endereco" placeholder="Digite seu endereço" /> <br />
        CEP: <input type="text" name="cep" placeholder="Digite seu CEP" /> <br />
        Número: <input type="text" name="numero" placeholder="Digite seu numero" /> <br />
        Celular: <input type="text" name="celular" placeholder="Digite seu celular" /> <br />
        Email: <input type="text" name="email" placeholder="Digite seu email" /> <br />


        <input type="submit" value="Cadastrar" />
        </form>
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