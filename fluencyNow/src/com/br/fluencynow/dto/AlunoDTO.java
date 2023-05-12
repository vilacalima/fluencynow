package com.br.fluencynow.dto;

import com.br.fluencynow.model.Aluno;

import java.util.Date;
import java.util.List;

public class AlunoDTO {
    public int id;
    public String nome;
    public String cpf;
    public String dataNasc;
    public String endereco;
    public String cep;
    public String numero;
    public String celular;
    public String email;
    public int idAula;
    public String diaAula;
    public String horarioAula;
    public int idAluno;
    public int idPlano;
    public String descricaoAula;
    public String plano;

    /**
     * Construtor da classe Aluno
     * */
    public AlunoDTO() {

    }

    public AlunoDTO(String nome, String cpf, String dataNasc, String endereco, String cep, String numero, String celular, String email) {
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
    public int getIdAula() { return idAula; }
    public void setIdAula(int idAula) { this.idAula = idAula; }
    public String getPlano() { return plano; }
    public void setPlano(String plano) { this.plano = plano; }
    public String getDiaAula() { return diaAula; }
    public void setDiaAula(String diaAula) { this.diaAula = diaAula; }
    public String getHorarioAula() { return horarioAula; }
    public void setHorarioAula(String horarioAula) { this.horarioAula = horarioAula; }
    public int getIdAluno() { return idAluno; }
    public void setIdAluno(int idAluno) { this.idAluno = idAluno; }
    public int getIdPlano() { return idPlano; }
    public void setIdPlano(int idPlano) { this.idPlano = idPlano; }

    public static class Lista_container {

        private List<AlunoDTO> alunos;
        public List<AlunoDTO> getAlunos(){

            return alunos;
        }

        public void setAlunos(List<AlunoDTO>alunos){
            this.alunos = alunos;
        }
    }
}
