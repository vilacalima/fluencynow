<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<spring:url value="/resources/fluency.css" var="fluencyCSS" />


    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
  <link href="${fluencyCSS}" rel="stylesheet" />
</head>
<body>
<h2>PLANO Aluno</h2>

<form action="saveUpdatePlano" method="post">
    <label>Plano Nome</label>
    <input type="hidden" name="id" id="plano-cpf" value="${param.id}">
    <input type="text" name="nome" id="plano-nome" value="${param.nome}">
    <input type="text" name="valor" id="plano-valor" value="${param.valor}">

    <button type="submit">Save</button>
</form>


</body>
</html>
