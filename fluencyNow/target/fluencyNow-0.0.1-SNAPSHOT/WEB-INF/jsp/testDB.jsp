<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Teste Banco de Dados</title>
    </head>
    <body>
    <br>
    <div>
        <br>
        <h1>Teste Salvar</h1>
        <form method="Post" action="fluencyNow/testeBancodeDadosDB">

            <label for="nome">Nome</label><input type="text" name="nome" id="nome">

            <label for="cpf">CPF</label><input type="text" name="cpf" id="cpf">

            <label for="dataNascimento">Data de Nascimento</label><input type="text" name="dataNascimento" id="dataNascimento">

            <label for="email">Email</label><input type="text" name="email" id="email">

            <label for="celular">Celular</label><input type="text" name="celular" id="celular">

            <label for="cep">CEP</label><input type="text" name="cep" id="cep">

            <label for="endereco">Endereço</label><input type="text" name="endereco" id="endereco">

            <label for="numero">Número</label><input type="text" name="numero" id="numero">

            <button type="submit">Salvar</button>
        </form>
    </div>

    </body>
</html>
