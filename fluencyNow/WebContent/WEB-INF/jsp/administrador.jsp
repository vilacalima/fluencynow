<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <!DOCTYPE html>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
      <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

        <html>

        <head>
          <spring:url value="resources/css/all.min.css" var="allminCSS" />
          <spring:url value="resources/index.css" var="indexCSS" />

          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta charset="UTF-8">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Exemplo de cabe�alho responsivo</title>
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
          <link rel="stylesheet" href="${allminCSS}">


          <link rel="stylesheet" href="${indexCSS}" />
          <!-- <link rel="stylesheet" href="reset.css"> -->
          <link rel="preconnect" href="https://fonts.googleapis.com">
          <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
          <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
          <!-- //FONTE NOVA -->
        </head>

        <header>
          <nav class="navbar navbar-expand-md navbar-light bg-light">
            <div class="container-fluid">
              <!-- Logotipo na parte esquerda -->
              <a class="navbar-brand" href="#">
                <img src="resources/images/Logo.png" alt="Logo" style="height: 150px;">
              </a>

              <!-- Bot�o de administrador no canto superior direito -->
              <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                  <a class="admin-btn" href="login">Administrador</a>
                </li>
              </ul>
            </div>
          </nav>
        </header>

        <body>
          <div class="container">
            <h2>Procurar Alunos</h2>
            <form class="row row-cols-lg-auto g-3 align-items-center">
              <table class="table">
                <thead>
                  <tr>
                    <th scope="col">#</th>
                    <th scope="col"> Nome </th>
                    <th scope="col"> CPF </th>
                    <th scope="col"> E-mail </th>
                    <th scope="col"> Horario </th>
                    <th scope="col"> Semanal </th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach items="${Alunos.alunos}" var="aluno" varStatus="tagStatus">
                    <tr>
                      <th scope="row">1</th>
                      <td>${aluno.nome}</td>
                      <td>${aluno.cpf}</td>
                      <td>${aluno.email}</td>
                      <td>07h as 08h</td>
                      <td> Quinta - feira </td>
                    </tr>
                  </c:forEach>
                </tbody>
              </table>
            </form>
          </div>

          <div class="container">
            <h1>Cadastro</h1>
            <div class="col-md-6">
              <form class="formulario-contato">
                <div class="form-group">
                  <label for="nome"></label>
                  <input type="text" class="form-control" id="cadastronome" placeholder="Nome">
                </div>
                <div class="form-group">
                  <label for="CPF"></label>
                  <input type="cpf" class="form-control" id="cadastroCPF" placeholder="468-787-898-85">
                </div>
                <div class="form-group">
                  <label for="data-nascimento"></label>
                  <input type="date" textarea class="form-control" id="cadastrodata-nascimento"
                    placeholder="00/00/00"></textarea>
                </div>
                <div class="form-group">
                  <label for="endereco"></label>
                  <input type="address" textarea class="form-control" id="cadastroendereco"
                    placeholder="Rua FluencyNow"></textarea>
                </div>
                <div class="form-group">
                  <label for="numero"></label>
                  <input type="addressnumber" textarea class="form-control" id="cadastronumendereco"
                    placeholder="01"></textarea>
                </div>
                <div class="form-group">
                  <label for="email"></label>
                  <input type="emailcadastro" textarea class="form-control" id="cadastroemail"
                    placeholder="fluency@now.com.br" </textarea>
                </div>

                <div class="form-group">
                  <label for="telefone"></label>
                  <input type="number" textarea class="form-control" id="cadastrotelefone"
                    placeholder="(11) 12345-859"></textarea>
                  <div>
                    <a href="https://wa.me/5511945390855" class="btn btn-primary btn-cadastrar"> Cadastrar Aula <div
                        class="botaocadastrar">
                      </div>
                      <a>
                  </div>
                </div>

                <div class="container">

                  <h1>Procurar Plano de Aula</h1>
                  <div class="row">

                    <table class="table">

                      <thead>
                        <tr>
                          <th scope="col">#Id</th>
                          <th scope="col">Nome</th>
                          <th scope="col">Valor</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <table class="table table-hover">
                            <table class="table table-bordered">
                              <th scope="row">1</th>
                              <td>Canada 2 dias da semana</td>
                              <td>teste@gmail.com</td>
                        </tr>
                        <tr>
                          <th scope="row">2</th>
                          <td>Meexico 2 dias da semana</td>
                          <td>teste@gmail.com</td>
                        </tr>
                        <tr>
                          <th scope="row">3</th>
                          <td>Mexico 2 dias da semana</td>
                          <td>teste@gmail.com</td>
                        </tr>
                        <th scope="row">3</th>
                        <td>EUA 1 dia da semana - Grupo</td>
                        <td>teste@gmail.com</td>
                        </tr>
                        <th scope="row">3</th>
                        <td>Espanha 1 dia da semana - Grupo</td>
                        <td>teste@gmail.com</td>
                        </tr>
                        <th scope="row">3</th>
                        <td>Inglaterra 1 dia da semana - Grupo</td>
                        <td>teste@gmail.com</td>
                        </tr>
                      </tbody>
                    </table>


                    <div class="container-2">
                      <h1>Cadastro Plano</h1>

                      <div class="row">
                        <div class="col">
                          <input type="text" class="form-control" placeholder="Eua - 1 dia da semana"
                            aria-label="First name">
                        </div>
                        <div class="col">
                          <input type="text" class="form-control" placeholder="R4160,00" aria-label="Last name">
                          <div class="btn btn-primary btn-cadastraraula"> Cadastrar Plano <div
                              class="botaocadastraraula">

                            </div>
                          </div>
                          <a>
                        </div>

                      </div>
                    </div>
                  </div>
                </div>
            </div>
          </div>
          </div>
          </div>

          

          <!-- Scripts do Bootstrap -->
          <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
          <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
            integrity="sha384-wiJyZO0jX6hh60ggnIh0YzZU6QIXx4jI0gblZWfD0yE6fr5XhLgB1CxojrbjzlzF"
            crossorigin="anonymous"></script>
          <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        </body>
        <footer class="footer" style="background-color: #8CB3FD;">
          <div class="container">
            <div class="row align-items-center">
              <div class="col-md-3">
                <img src="resources/images/Logo.png" alt="Logo" style="height: 150px;">
              </div>
              <div class="col-md-6 text-center">
                <p class="mb-0">Baixe nosso aplicativo</p>
                <a href="#"><i class="fab fa-android fa-2x"></i></a>
                <a href="#"><i class="fab fa-apple fa-2x"></i></a>

              </div>
              <div class="col-md-3 text-right">
                <a href="#"><i class="fab fa-facebook fa-2x"></i></a>
                <a href="#"><i class="fab fa-twitter fa-2x"></i></a>
                <a href="#"><i class="fab fa-whatsapp fa-2x"></i></a>
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
        </html>

        <!-- body {
        position: relative;

        }

        body::before {
        content: "";
        background-image: url('\images\img-background.jpg');
        background-repeat: no-repeat;
        background-size: cover;
        opacity: 0.4;
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        z-index: -1;
        text-rendering: auto;
        }

        .container-fluid {
        background-color: #8CB3FD;
        height: 200px;
        /* margin: 0px; */


        }
        .navbar-text {
        font-family: 'Montserrat', sans-serif;
        font-style: normal;
        text-align: center;
        font-weight: 800;
        font-size: 60px;
        color: #FFFFFF;
        text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
        padding-top: 30px;
        padding-left: 10%;

        }


        .admin-btn {
        color: #fff; /* Define a cor do texto como branco */
        background-color: #3C22DC;
        font-size: 15px ;
        padding: 5px 10px;



        }
        .nav-item{
        margin-top: -90px;
        }

        .texto-principal{
        width: 500px;
        }

        .container{
        padding-top: 50px;
        }
        .container h2{
        text-align: center;

        }

        .container p{
        text-align: justify;


        }


        .btn-primary{
        color: black;
        background-color: #81D589;
        margin: 50px 100px;
        padding: 20px;
        text-aling: center;
        width: 200px;


        }
        .form-control {
        display: flex;
        item-aling: center;
        flex-direction: column;
        background-color: #fff;
        border-radius: 7px;
        padding: 100px;
        box-shadow: 10px 10px 40px rgba(0, 0, 0, 0.4);
        gap: 5px;
        margin: 5px 500px 20px;
        }

        .table-border{
        margin: 50px 100px 0px;
        font-family: 'Montserrat', sans-serif;
        font-style: normal;
        font-weight: 400;
        font-size: 20px;
        line-height: 47px;

        }


        .card{
        margin-top: 90px;
        border: 0px;
        }


        .col-md-4{
        display: inline-block;
        margin-left:-10px;
        }


        .container-2 h1{
        text-align: center;
        }

        .card-box{
        background-color: #003BAE;
        height: 440px;
        /* width: 291px; */
        /* left: 49px; */
        top: 1561px;
        border-radius: 37px;
        opacity: 80%;
        margin-bottom: 20px;
        color:#fff ;


        }
        .col{
        margin-left: 500px 50px 50px;

        }
        .container h1{
        text-align: center;
        margin-bottom: 46px;
        }

        .card-title h2 {
        font-size: 25px;
        }

        .card-title p{
        font-size: 18px;
        text-align: center;
        margin-top: 25px;
        opacity: 99%;
        }


        .footer {
        color: #fff;
        padding: 40px 0;
        }

        .footer img {
        max-width: 100%;
        }



        .footer a:hover i {
        color: #2413be;
        }

        .footer hr {
        border-top: 1px solid #fff;
        margin-top: 20px;
        margin-bottom: 20px;
        }

        .footer p {
        font-size: 20px;
        margin-bottom: 0;
        text-align: center;
        }


        @media (max-width: 991px) {
        .card-box {
        margin-bottom: 30px;
        }
        } -->