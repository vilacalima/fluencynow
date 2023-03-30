package com.br.fluencynow.model;

import java.util.Date;

public class Aula {
    public int id;
    public Date data;
    public String horario;

    /**
     * Construtor da classe Aula
     * */
    public Aula() {

    }

    /**
     * Construtor da classe Aula
     * @param id
     * @param data
     * @param horario
     * */
    public Aula(int id, Date data, String horario) {
        this.id = id;
        this.data = data;
        this.horario = horario;
    }

    /**
     * Construtor da classe Aula
     * @param data
     * @param horario
     * */
    public Aula(Date data, String horario) {
        this.data = data;
        this.horario = horario;
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
}
