package com.br.fluencynow.DAO;

public class ConexaoDAO {

    /**
     * Url para consulta no banco de dados
     */
    public static String url = "jdbc:mysql://localhost:3306/fluencyNow";

    /**
     * Login para acesso ao banco de dados
     */
    public static String login = "root";

    /**
     * Senha para acesso ao banco de dados Senha usada nos computadores do senac - > P@$$w0rd
     */
    public static String senha = "";

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
