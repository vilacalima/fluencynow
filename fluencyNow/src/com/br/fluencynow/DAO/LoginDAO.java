package com.br.fluencynow.DAO;

import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Login;

import java.sql.*;

public class LoginDAO {

    public static boolean salvar(Login login) throws SQLException {
        boolean retorno = false;

        String SQL = "INSERT INTO login (email, senha, usuario) VALUES(?,?,?)";
        try {
            Connection conexao = DriverManager.getConnection(com.br.fluencynow.dao.ConexaoDAO.url, com.br.fluencynow.dao.ConexaoDAO.login, com.br.fluencynow.dao.ConexaoDAO.senha);

            PreparedStatement comandoSQL = conexao.prepareStatement(SQL);
            comandoSQL.setString(1, login.getEmail());
            comandoSQL.setString(2, login.getSenha());
            comandoSQL.setString(3, login.getUsuario());

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Success Connection");
                retorno = true;
            }

        } catch (ClassCastException ex) {
            System.out.println(ex.getMessage());
        }
        return retorno;
    }

    public boolean exists(Login login) throws SQLException {

        boolean retorno = false;

        String SQL = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        try {
            Connection conexao = DriverManager.getConnection(com.br.fluencynow.dao.ConexaoDAO.url, com.br.fluencynow.dao.ConexaoDAO.login, com.br.fluencynow.dao.ConexaoDAO.senha);

            PreparedStatement comandoSQL = conexao.prepareStatement(SQL);

            comandoSQL.setString(1, login.getUsuario());
            comandoSQL.setString(2, login.getSenha());


            ResultSet linhasAfetadas = comandoSQL.executeQuery();

            if (linhasAfetadas.next()) {
                System.out.println("Success Connection");
                retorno = true;
            }

        } catch (ClassCastException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}