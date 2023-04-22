<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<spring:url value="/resources/fluency.css" var="fluencyCSS" />

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Spring MVC List of objects display</title>

  <link href="${fluencyCSS}" rel="stylesheet" />
</head>
<body>
<div class="page">
  <form class="formCadastrar">

<table>
<tr>
<th>nome</th>
<th>cpf</th>
<th>datanasc</th>
<th>endereco</th>
<th>cep</th>
<th>numero</th>
<th>celular</th>
<th>email</th>
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
  </tr>
</c:forEach>
</table>
</form>
</div>
</body>
</html>