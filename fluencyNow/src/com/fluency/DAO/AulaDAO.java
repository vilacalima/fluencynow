package com.fluency.DAO;

import com.fluency.model.Aula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AulaDAO {

    public static boolean salvar(Aula aula) throws SQLException {
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
