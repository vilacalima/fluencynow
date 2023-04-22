package com.br.fluencynow.model;

import java.util.Date;

public class Aula {
    public int id;
    public Date data;
    public String horario;
    public int idAluno;
    public int idAula;


    /**
     * Construtor da classe Aula
     * */
    public Aula() {

    }

    /**
     * Construtor da classe Aula
     * @param data
     * @param horario
     * */
    public Aula(Date data, String horario, int idAluno, int idAula) {
        this.data = data;
        this.horario = horario;
        this.idAluno = idAluno;
        this.idAula = idAula;
    }

    /**
     * Região de get e set
     * */
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }
    public int getIdAluno() { return idAluno; }
    public void setIdAluno(int idAluno) { this.idAluno = idAluno; }
    public int getIdAula() { return idAula; }
    public void setIdAula(int idAula) { this.idAula = idAula; }
}
