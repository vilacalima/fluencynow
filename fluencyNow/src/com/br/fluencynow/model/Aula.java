package com.br.fluencynow.model;

import java.util.Date;

public class Aula {
    public int id;
    public String dia;
    public String horario;
    public int idAluno;
    public int idPlano;


    /**
     * Construtor da classe Aula
     * */
    public Aula() {

    }

    /**
     * Construtor da classe Aula
     * @param dia String
     * @param horario String
     * @param idAluno int
     * @param idPlano int
     * */
    public Aula(String dia, String horario, int idAluno, int idPlano) {
        this.dia = dia;
        this.horario = horario;
        this.idAluno = idAluno;
        this.idPlano = idPlano;
    }

    /**
     * Região de get e set
     * */
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getDia() { return dia; }
    public void setDia(String dia) { this.dia = dia; }
    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }
    public int getIdAluno() { return idAluno; }
    public void setIdAluno(int idAluno) { this.idAluno = idAluno; }
    public int getIdPlano() { return idPlano; }
    public void setIdPlano(int idPlano) { this.idPlano = idPlano; }
}
