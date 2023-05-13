<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>

<spring:url value="/resources/redefinir.css" var="redefinirCSS" />

 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<title>Login</title>
	  <link href="${redefinirCSS}" rel="stylesheet" />
</head>
<body>
	<div class ="container">
		<div class='card'>
		<form action="alterarSenha" method="post" class="formLogin">
		  <h1> Redefinir Senha ! </h1>
		 Usuario: <input type="text" name="username" placeholder="Digite seu usuario" autofocus="true" /> <br />
		Senha atual : <input type="password" name="oldPassworld" placeholder="Digite a senha"<br />
        Nova senha : <input type="password" name="newPassworld" placeholder="Digite a nova senha"<br />
        Confirmar senha: <input type="password" name="newPassworldValidate" placeholder="Confirmar senha" /> <br />
        <input type="submit" value="Alterar"/>

        </form>
<       a href='login'>Voltar</a>
		  </div>
		 </div>
</body>
</html>