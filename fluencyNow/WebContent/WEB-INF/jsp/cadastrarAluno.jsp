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
                        <a class="admin-btn" href="administrador">Administrador</a>
                    </li>
                </ul>
            </div>
        </nav>
    </header>

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