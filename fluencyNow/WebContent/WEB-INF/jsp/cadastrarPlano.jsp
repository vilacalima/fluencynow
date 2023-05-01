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

    <div class="conteiner">
      <table class="table table-striped">
          <tr>
              <th>ID</th>
              <th>Descricao</th>
              <th>Valor</th>
              <th></th>
              <th></th>
          </tr>
          <c:forEach items="${Planos.planos}" var="plano" varStatus="tagStatus">
              <tr>
                  <td>${plano.id}</td>
                  <td>${plano.nome}</td>
                  <td>${plano.valor}</td>

                 <td>
                    <form action="deletarPlano" method="post">
                      <input type="hidden" id="id" name="id" value="${plano.id}">
                      <button type="submit" class="btn btn1">Delete</button>
                      <span> | </span>
                    </form>
                      <a class="btn btn2" href="index.jsp?id=${aluno.nome}&name=${aluno.cpf}">Update</a>
                 </td>

              </tr>
          </c:forEach>
      </table>
    </div>

    <h1>Cadastrar Plano</h1>
    <div class="container2">
        <form action="cadastrarPlanos" method="post" class="formCadastrar">

            <div class="col-md-4">

                <div class="form-group">
                    <label for="nome"></label>
                    <input type="text" name="nome" placeholder="Nome" autofocus="true" />
                </div>
                <div class="form-group">
                <label for="cpf"></label>
                    <input type="decimal" name="valor" placeholder="valor" />
                </div>

                <input type="submit" value="Cadastrar" class="btn btn7" />
            </div>
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