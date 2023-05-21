<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>

<spring:url value="/resources/Login.css" var="LoginCSS" />
<spring:url value="resources/css/all.min.css" var="allminCSS" />

 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<title>Login</title>
	  <link href="${LoginCSS}" rel="stylesheet" />
	  <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
          <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
    <c:if test="${not empty mensagem}">
            <div class="alert alert-success">${mensagem}</div>
        </c:if>
        <c:if test="${not empty mensagemErro}">
            <div class="alert alert-danger">${mensagemErro}</div>
        </c:if>
<body>
	<div class ="container">
		<div class='card'>
		<form action="efetuaLogin" method="post" class="formLogin">
		  <h1> Professora, Seja Bem-Vinda ! </h2>
        <p>Digite os seus dados de acesso no campo abaixo.</p>
        Usuario: <input type="text" name="usuario" placeholder="Digite seu usuario" autofocus="true" /> <br />
        Senha: <input type="password" name="senha" placeholder="Digite sua senha" /> <br />
        <input type="submit" value="Entrar" />

        <a href='redefinirSenha'>Troque Sua Senha</a>
        </form>
</body>
</html>