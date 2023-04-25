<!DOCTYPE html>
<html lang="pt-BR">

<spring:url value="resources/css/all.min.css" var="allminCSS" />
<spring:url value="resources/css/administrador.css" var="administradorCSS" />


<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<head>


    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="${allminCSS}">


    <link rel="stylesheet" href="${administradorCSS}" />
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

                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="admin-btn">Pagina Inicial</a>
                    </li>
                </ul>
            </div>
        </nav>
    </header>

    <body>
        <h1>Procurar Alunos</h1>
        <div class="container1">
            
            <div class="bnt-group" aria-label="arial">
                <input class="pesquisa" type="search" placeholder="Pesquisar" aria-label="Search"
                    style="border-right: none;">
                <button type="button" class="btn btn1">Excluir aluno</button>
                <button type="button" class="btn btn2">Editar Aluno</button>
                <button type="button" class="btn btn3">Novo aluno +</button>
            </div>


        </div>
        </div>
        </div>


        <form class="row row-cols-lg-auto g-3 align-items-center">
            <table class="table">
                <tbody>
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

        <h1>Cadastro</h1>
        <div class="container2">
            
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
                            placeholder="fluency@now.com.br"> </textarea>
                    </div>

                    <div class="form-group">
                        <label for="celular"></label>
                        <input type="celular" textarea class="form-control" id="cadastrocelular"
                            placeholder="(11)1234-4567"> </textarea>
                    </div>
                    <button type="button" class="btn btn4">Cadastrar Aula +

                    </button>

                    <h6>Plano</h6>

                    <select class="form-select" aria-label="Default select example">

                        <option selected>Canadá 2 dias da sermana</option>
                        <option value="1">Mexico 2 dias da semana</option>
                        <option value="2">EUA 1 dia da semana - Grupo</option>
                        <option value="3">Espanha 1 dia da semana - Grupo</option>
                    </select>

                    <h6>Dia</h6>

                    <select class="form-select" aria-label="Default select example">
                        <option selected> Segunda-Feira</option>
                        <option value="1">Terça-Feira</option>
                        <option value="2">Quarta-feira</option>
                        <option value="3">Quinta-Feira</option>
                        <option value="3">Sexta-Feira</option>

                    </select>

                    <h6>Horário</h6>
                    <select class="form-select" aria-label="Default select example">
                        <option selected> 08:00 </option>
                        <option value="1">10:00</option>
                        <option value="2">12:00</option>
                        <option value="3">14:00</option>
                        <option value="3">16:00</option>
                        <option value="3">18:00</option>
                    </select>

                    <button type="button" class="btn btn5">Salvar

                    </button>

                </form>
                </div>
                <h1>Cadastro Plano</h1>
                <div class="container1">
                    <div class="bnt-group" aria-label="arial">
                        <input class="pesquisa" type="search" placeholder="Pesquisar" aria-label="Search"
                            style="border-right: none;">
                        <button type="button" class="btn btn1">Excluir aluno</button>
                        <button type="button" class="btn btn2">Editar Aluno</button>
                        <button type="button" class="btn btn3">Novo aluno +</button>
                    </div>
        
                </div>
                
                </div>
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
                                
                                    <table class="table table-bordered">
                                        <th scope="row">1</th>
                                        <td>Canada 2 dias da semana</td>
                                        <td>teste@gmail.com</td>
                            </tr>
                            <tr>
                                <th scope="row">2</th>
                                <td>Mexico 2 dias da semana</td>
                                <td>teste@gmail.com</td>
                            </tr>
                            <tr>
                                <th scope="row">3</th>
                                <td>Mexico 2 dias da semana</td>
                                <td>teste@gmail.com</td>
                            </tr>
                            <th scope="row">4</th>
                            <td>EUA 1 dia da semana - Grupo</td>
                            <td>teste@gmail.com</td>
                            </tr>
                            <th scope="row">5</th>
                            <td>Espanha 1 dia da semana - Grupo</td>
                            <td>teste@gmail.com</td>
                            </tr>
                            <th scope="row">6</th>
                            <td>Inglaterra 1 dia da semana - Grupo</td>
                            <td>teste@gmail.com</td>
                            </tr>
                        </tbody>
                    </table>

                </div>

                    <h1>Procurar Plano</h1>
                    <div class="container1">
                        

                        <div class="row">
                            <div class="campoNome">
                                Nome <input type="text" class="form-control" placeholder="Eua - 1 dia da semana"
                                    aria-label="First name">
                            </div>
                            <div class="campoValor">
                                Valor<input type="text" class="form-control" placeholder="R$160,00" aria-label="Last name">

                                </div>
                                <button type="button" class="btn btn5">Salvar

                                </button>
                                
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