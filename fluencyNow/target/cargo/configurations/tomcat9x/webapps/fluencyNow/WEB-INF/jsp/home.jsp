<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="pt-BR">

<spring:url value="resources/css/all.min.css" var="allminCSS" />
<spring:url value="resources/index.css" var="indexCSS" />


    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

<head>

<meta charset="utf-8"/>


  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Fluency Now</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="${allminCSS}">


  <link rel="stylesheet" href="${indexCSS}" />
  <!-- <link rel="stylesheet" href="reset.css"> -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">
 </head>

<body>

  <header>
    <nav class="navbar navbar-expand-md navbar-light bg-light">
      <div class="container-fluid">

        <a class="navbar-brand" href="#">
          <img src="resources/images/Logo.png" alt="Logo" style="height: 150px;">
        </a>

        <div class="navbar-text mx-auto">
          Fluency Now
        </div>

        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="admin-btn" href="login">Administrador</a>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <div class="container">
    <div class="row">
      <div class="col-md-6">
        <h2>Porque escolher a Fluency Now?</h2>
        <p>
            <br>A Fluency Now nasceu do amor pela lingua inglesa e pela paixao em ensinar da Helena Carvalho.
                          Após lecionar em escolas particulares por mais de 10 anos, em 2005 Helena decidiu criar seu proprio método de
                          ensino, afinal, cada aluno tem um ritmo de aprendizado diferente, então não é eficaz utilizar o mesmo método
                          para todos. Assim, ela segue
                          ensinando a língua inglesa até hoje, adaptando o ensino aos alunos.
                          A Fluency Now acredita que para o aprendizado não tem limites, então não existe idade certa para iniciar seus
                          estudos, atendemos alunos de todas as idades e todos os niveis, do básico ao avançado.
                          Quer conhecer melhor a Flueny Now? Nos envie uma mensagem que iremos atender e respeitar o seu processo de
                          aprendizado com paciencia e paixão pela língua inglesa.</p>
      </div>
      <div class="col-md-6">
        <form class="formulario-contato">
          <div class="form-group">
            <label for="nome"></label>
            <input type="text" class="form-control" id="nome" placeholder="Digite seu nome">
          </div>
          <div class="form-group">
            <label for="email"></label>
            <input type="email" class="form-control" id="email" placeholder="Digite seu e-mail">
          </div>
          <div class="form-group">
            <label for="data-nascimento"></label>
            <input type="date" textarea class="form-control" id="data-nascimento"
              placeholder="Digite sua data data de nascimento"></textarea>
          </div>
          <div class="form-group">
            <label for="endereco"></label>
            <input type="address" textarea class="form-control" id="endereco"
              placeholder="Digite seu endereco"></textarea>
          </div>
          <div class="form-group">
            <label for="telefone"></label>
            <input type="number" textarea class="form-control" id="telefone"
              placeholder="Digite seu telefone"></textarea>
            <a href="https://wa.me/5511945390855" class="btn btn-primary btn-enviar">Enviar WhatsApp <img class="whats"
                src="resources/images/whatsapp1.png" /></a>
          </div>
          <!-- <a href="https://wa.me/5511945390855" class="btn btn-primary btn-enviar" >Enviar WhatsApp <img class="whats" src="resources/images/whatsapp1.png" > -->
        </form>

      </div>

    </div>

  </div>


  <div class="container-2">
    <h1>Pacotes</h1>

    <div id="demo" class="carousel slide" data-ride="carousel">

      <!-- Indicators -->
      <ul class="carousel-indicators mb-0 pb-0">
        <li data-target="#demo" data-slide-to="0" class="active"></li>
        <li data-target="#demo" data-slide-to="1"></li>

      </ul>

      <!-- The slideshow -->
      <div class="carousel-inner no-padding my-5">
        <div class="carousel-item active">
          <div class="col-xs-4 col-sm-4 col-md-4">
            <img src="resources/images/Ingles.png" class="card-img-top" alt="Imagem do Card 1">
            <h5 class="card-title">Ingles | Individual</h5>
            <p class="card-text">5x de R$50,00</p>
            </a>
            <p>Uma aula de 60 minutos por semana</p>

          </div>

          <div class="col-xs-4 col-sm-4 col-md-4">
            <img src="resources/images/Ingles.png" class="card-img-top" alt="Imagem do Card 1">
            <h5 class="card-title">Ingles | Grupo</h5>
            <p class="card-text">5x de R$50,00</p>
            </a>
            <p>Uma aula de 60 minutos por semana</p>

          </div>
          <div class="col-xs-4 col-sm-4 col-md-4">
            <img src="resources/images/Ingles.png" class="card-img-top" alt="Imagem do Card 1">
            <h5 class="card-title">Ingles | Intensivo</h5>
            <p class="card-text">5x de R$70,00</p>
            </a>
            <p>Uma aula de 60 minutos por semana</p>

          </div>
        </div>


        <div class="carousel-item">
          <div class="col-xs-4 col-sm-4 col-md-4">
            <img src="resources/images/Espanhol.png" class="card-img-top" alt="Imagem do Card 1">
            <h5 class="card-title">Espanhol | Individual </h5>
            <p class="card-text">5x de R$50,00</p>
            </a>
            <p>Uma aula de 60 minutos por semana</p>


          </div>
          <div class="col-xs-4 col-sm-4 col-md-4">
            <img src="resources/images/Espanhol.png" class="card-img-top" alt="Imagem do Card 1">
            <h5 class="card-title">Espanhol | Grupo</h5>
            <p class="card-text">5x de R$50,00</p>
            </a>
            <p>Uma aula de 60 minutos por semana</p>

          </div>
          <div class="col-xs-4 col-sm-4 col-md-4">

            <img src="resources/images/Espanhol.png" class="card-img-top" alt="Imagem do Card 1">
            <h5 class="card-title">Espanhol | Intensivo</h5>
            <p class="card-text">5x de R$70,00</p>
            </a>
            <p>Uma aula de 60 minutos por semana</p>

          </div>
        </div>

      </div>

      <!-- Left and right controls -->
      <a class="carousel-control-prev" href="#demo" data-slide="prev">
        <span class="carousel-control-prev-icon sp"></span>
      </a>
      <a class="carousel-control-next" href="#demo" data-slide="next">
        <span class="carousel-control-next-icon sp"></span>
      </a>
    </div>
  </div>

  <div class="container">

    <h1>Depoimentos</h1>
    <div class="row">

      <div class="col-md-4 col-sm-6 col-xs-12">
        <div class="card-box">
          <div class="card-title">
            <h2>Julia Andrade, 12 anos:
            </h2>
            <p>A professora Helena e incrivel! <br>
              Com as aulas online dela consegui melhorar minhas notas na escola, ela tem muita paciencia! </p>
          </div>

        </div>
      </div>
      <div class="col-md-4 col-sm-6 col-xs-12">
        <div class="card-box">
          <div class="card-title">
            <h2>Junior Ferreira, 45 anos:</h2>
            <p>
              Tive um grande avanco em meu ingles! <br> A Helena seguiu um plano de aulas personalizado focando
              em gramatica. Dentro de 5 meses consegui uma oportunidade de emprego que pedia ingles.
              A Helena e uma grande profissional que tem muito conhecimento e experiencia. </p>
          </div>

        </div>
      </div>
      <div class="col-md-4 col-sm-6 col-xs-12">
        <div class="card-box">
          <div class="card-title">
            <h2>Maria Souza, 33 anos:</h2>
            <p>
              Meu sonho sempre foi ir para Disney! <br>Mas eu nao sabia nada de ingles, entao, comecei as aulas com a
              Helena, que criou um plano personalizado focando no ingles para o dia a dia.
              Depois de alguns meses de aula realizei o meu sonho de viajar para a Disney e consegui me comunicar com
              todos!</p>
          </div>

        </div>
      </div>

    </div>
  </div>

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




  <!-- Scripts do Bootstrap -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
    integrity="sha384-wiJyZO0jX6hh60ggnIh0YzZU6QIXx4jI0gblZWfD0yE6fr5XhLgB1CxojrbjzlzF"
    crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>