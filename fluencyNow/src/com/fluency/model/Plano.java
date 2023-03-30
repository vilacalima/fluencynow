package com.fluency.model;

public class Plano {
    public int id;
    public String nome;
    public double valor;

    /**
     * Construtor da classe Plano
     * */
    public Plano() {

    }

    /**
     * Construtor da classe Plano
     * @param id
     * @param nome
     * @param valor
     * */
    public Plano(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    /**
     * Construtor da classe Plano
     * @param nome
     * @param valor
     * */
    public Plano(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
}
