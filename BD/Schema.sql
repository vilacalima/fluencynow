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

INSERT INTO Login (email, senha, usuario) VALUES('teste@fluencynow', 'sa', 'sa')