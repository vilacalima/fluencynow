package com.br.fluencynow.dao;

import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDAO {

    public static boolean salvar(Login login) throws SQLException {
        boolean retorno = false;

        String SQL = "INSERT INTO login (email, senha, usuario) VALUES(?,?,?)";
        try {
            Connection conexao =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = conexao.prepareStatement(SQL);
            comandoSQL.setString(1, login.getEmail());
            comandoSQL.setString(2, login.getSenha());
            comandoSQL.setString(3, login.getUsuario());

            int linhasAfetadas = comandoSQL.executeUpdate();

            if(linhasAfetadas > 0){
                System.out.println("Success Connection");
                retorno = true;
            }

        } catch(ClassCastException ex){
            System.out.println(ex.getMessage());
        }
        return retorno;
    }
}
