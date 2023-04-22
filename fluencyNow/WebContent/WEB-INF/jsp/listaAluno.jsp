<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC List of objects display</title>
</head>
<body>
<table>
<tr>
<th>nome</th>
<th>endereco</th>
<th>email</th>
</tr>
<c:forEach items="${Alunos.aluno}" var="aluno" varStatus="tagStatus">
  <tr>
    <td>${aluno.firstName}</td>
    <td>${aluno.lastName}</td>
    <td>${aluno.email}</td>
  </tr>
</c:forEach>
</table>
</body>
</html>