package com.br.fluencynow.dao;

import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Login;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {

    public static boolean salvar(Login login) throws SQLException {
        boolean retorno = false;

        String SQL = "INSERT INTO login (email, senha, usuario) VALUES(?,?,?)";
        try {
            Connection conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

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

    public static boolean updateLogin(int id, String senha) throws SQLException {
        boolean retorno = false;

        String SQL = "UPDATE login SET senha=? WHERE id=?";
        try {
            Connection conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = conexao.prepareStatement(SQL);
            comandoSQL.setString(1, senha);
            comandoSQL.setInt(2, id);

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

        String SQL = "SELECT * FROM login WHERE usuario = ? AND senha = ?";
        try {
            Connection conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = conexao.prepareStatement(SQL);


            comandoSQL.setString(1, login.getUsuario());
            comandoSQL.setString(2, login.getSenha());


            ResultSet linhasAfetadas = comandoSQL.executeQuery();

            if (linhasAfetadas.next()) {
                System.out.println("Success Connection");
                retorno = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return retorno;
    }

    public int getId(String usuario, String senha)  {
        int id = 0;
        String SQL = "SELECT id FROM login where usuario = ? and senha = ?";

        List<Aluno> listaAlunos = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet  rset = null;


        try {

            conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            comandoSQL = conexao.prepareStatement(SQL);
            comandoSQL.setString(1, usuario);
            comandoSQL.setString(2, senha);

            rset = comandoSQL.executeQuery();

            while (rset.next()) {
                id = rset.getInt("id");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (comandoSQL != null) {
                    comandoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return id;
    }
}