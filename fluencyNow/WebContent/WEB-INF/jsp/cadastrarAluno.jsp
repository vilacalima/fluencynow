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
       <form action="cadastrarAluno" method="post" class="formCadastrar">
        <h1>Cadastrar Aluno</h1>
        <p>Digite os seus dados de acesso no campo abaixo.</p>
        Nome: <input type="text" name="nome" placeholder="Digite seu nome" autofocus="true" /> <br />
        CPF: <input type="text" name="cpf" placeholder="Digite seu CPF" /> <br />
        DataNasc: <input type="text" name="dataNasc" placeholder="Digite sua data de nascimento" /> <br />
        Endereco: <input type="text" name="endereco" placeholder="Digite seu endereço" /> <br />
        CEP: <input type="text" name="cep" placeholder="Digite seu CEP" /> <br />
        Numero: <input type="text" name="numero" placeholder="Digite seu numero" /> <br />
        Celular: <input type="text" name="celular" placeholder="Digite seu celular" /> <br />
        Email: <input type="text" name="email" placeholder="Digite seu email" /> <br />


        <input type="submit" value="Cadastrar" />
        </form>
    </div>

</body>
</html>