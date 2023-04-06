package com.br.fluencynow.dao;

public class ConexaoDAO {

    /**
     * Url para consulta no banco de dados
     */
    public static String url = "jdbc:h2:~/test";

    /**
     * Login para acesso ao banco de dados
     */
    public static String login = "sa";

    /**
     * Senha para acesso ao banco de dados Senha usada nos computadores do senac - > P@$$w0rd
     */
    public static String senha = "sa";

    /**
     * Obter url de conexão
     * @return url
     */
    public String getUrl() { return url; }

    /**
     * Obter login de conexão
     * @return url
     */
    public String getLogin() { return login; }

    /**
     * Obter senha de conexão
     * @return url
     */
    public String getSenha() { return senha; }
}
