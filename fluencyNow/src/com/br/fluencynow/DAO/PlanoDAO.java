package com.br.fluencynow.dao;

import com.br.fluencynow.model.Plano;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PlanoDAO {

    public static boolean salvar(Plano plano) throws SQLException{
        Connection conexao = null;
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

        } catch(ClassCastException ex){
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return retorno;
    }
}
