create database fluencyNow;

Use fluencyNow;
desc aluno;
create table aluno(
	id int primary key auto_increment,
    nome varchar(50) not null,
    cpf varchar(11) not null unique,
    dataNasc date not null,
    endereco varchar(50) not null,
    cep varchar(8) not null,
    numero varchar(10) not null,
    celular varchar(11) not null unique,
    email varchar(50) not null unique
);

create table aula(
	id int primary key auto_increment,
    dia date,
    horario time,
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