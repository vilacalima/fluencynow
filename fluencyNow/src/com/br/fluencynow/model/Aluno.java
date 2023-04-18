package com.br.fluencynow.model;

import java.util.Date;
import java.util.List;

public class Aluno {

    public int id;
    public String nome;
    public String cpf;
    public String dataNasc;
    public String endereco;
    public String cep;
    public String numero;
    public String celular;
    public String email;

    /**
     * Construtor da classe Aluno
     * */
    public Aluno() {

    }

    /**
     * Construtor da classe Aluno
     * @param id
     * @param nome
     * @param cpf
     * @param dataNasc
     * @param endereco
     * @param cep
     * @param numero
     * @param celular
     * @param email
     * */
    public Aluno(int id, String nome, String cpf, String dataNasc, String endereco, String cep, String numero, String celular, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.celular = celular;
        this.email = email;
    }

    /**
     * Construtor da classe Aluno
     * @param nome
     * @param cpf
     * @param dataNasc
     * @param endereco
     * @param cep
     * @param numero
     * @param celular
     * @param email
     * */
    public Aluno(String nome, String cpf, String dataNasc, String endereco, String cep, String numero, String celular, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.celular = celular;
        this.email = email;
    }

    /**
     * Região de get e set
     * */
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getDataNasc() { return dataNasc; }
    public void setDataNasc(String dataNasc) { this.dataNasc = dataNasc; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public static class Lista_container {

        private List<Aluno> alunos;
        public List<Aluno> getAlunos(){

            return alunos;
        }

        public void setAlunos(List<Aluno>alunos){
            this.alunos = alunos;
        }
    }

}
