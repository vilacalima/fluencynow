package com.br.fluencynow.model;

public class Login {

    public int id;
    public String email;
    public String senha;
    public String usuario;

    /**
     * Construtor da classe Login
     * */
    public Login(){

    }

    /**
    * Construtor da classe Login
    * @param id
    * @param email
    * @param senha
    * @param usuario
    * */
    public Login(int id, String email, String senha, String usuario){
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.usuario = usuario;
    }

    /**
     * Construtor da classe Login
     * @param email
     * @param senha
     * @param usuario
     * */
    public Login(String email, String senha, String usuario){
        this.email = email;
        this.senha = senha;
        this.usuario = usuario;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
}
