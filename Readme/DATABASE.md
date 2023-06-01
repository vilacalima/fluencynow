<h1 align="center"> Fluency Now </h1>

<h2 align="center">
<br> Acessando o console do SQL<br>
</h2>

## <a id="anchortext" />http://localhost:8080/fluencyNow/console/login.jsp?jsessionid=ae055d5ff17febba165570d4588c3179

<p> 
    <br> Acesso ao console do banco de dados pelo link<br>
    <br> Driver Class:	org.h2.Driver<br>
    JDBC URL: jdbc:h2:~/test<br>
    User Name: sa<br>
    Passworld: sa<br>
</p>

<h2 align="center">
<br> Modelagem de banco de dados<br>
</h2>

![Modelagem de banco de dados](images/BancoDeDados.png)

create database fluencyNow;

Use fluencyNow;
desc aluno;
create table aluno(
	id int primary key auto_increment,
    nome varchar(50),
    cpf varchar(11) not null unique,
    dataNasc varchar(10) not null,
    endereco varchar(50),
    cep varchar(8),
    numero varchar(10),
    celular varchar(11) unique,
    email varchar(50) unique
);

create table aula(
	id int primary key auto_increment,
    dia varchar(15),
    horario varchar(15),
    idAluno int,
    idPlano int,
    foreign key(idAluno) references aluno(id),
    foreign key(idPlano) references plano(id)
);

create table plano(
	id int primary key auto_increment,
    nome varchar(30) not null unique,
    valor decimal not null
);

create table login(
	id int primary key auto_increment,
    email varchar(50) unique,
    senha varchar(12),
    usuario varchar(30) unique
);

INSERT INTO Login (email, usuario, senha) VALUES('helena@fluencynow.com', 'profhelena', '12345');
