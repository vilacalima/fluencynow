<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="pt-BR">



<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<head>


    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="${allminCSS}">



    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
</head>
<body>
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
                                        <form action="/deletarAluno" method="post">
                                            <input type="hidden" id="cpf" name="cpf" value="${aluno.cpf}">
                                            <button type="submit">Delete</button>
                                            <span> | </span>
                                            <a href="index.jsp?id=${aluno.nome}&name=${aluno.cpf}">Update</a>
                    </tr>
                    </td>
                </c:forEach>
            </table>
    </div>
</body>

</html>