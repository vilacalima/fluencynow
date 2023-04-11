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
    <div class="page">
       <form action="efetuaLogin" method="post" class="formLogin">
        <h1>Login</h1>
        <p>Digite os seus dados de acesso no campo abaixo.</p>
        Usuario: <input type="text" name="usuario" placeholder="Digite seu usuario" autofocus="true" /> <br />
        Senha: <input type="password" name="senha" placeholder="Digite sua senha" /> <br />
        <input type="submit" value="Entrar" />
        </form>
    </div>

</body>
</html>