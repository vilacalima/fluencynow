package com.br.fluencynow.dao;

import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Plano;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AulaDAO {

    public static boolean saveClass(String dia, String horario, int aluno, int plano) throws SQLException {
        boolean retorno = false;

        String SQLAula = "INSERT INTO aula (dia, horario, idAluno, idPlano) VALUES(?,?,?,?)";
        try {

            Connection conexao =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);
            PreparedStatement comandoSQLAula = conexao.prepareStatement(SQLAula);
            comandoSQLAula.setString(1, dia );
            comandoSQLAula.setString(2, horario );
            comandoSQLAula.setInt(3, aluno );
            comandoSQLAula.setInt(4, plano );

            int linhasAfetadasAula = comandoSQLAula.executeUpdate();

            if(linhasAfetadasAula > 0){
                System.out.println("Success Connection");
                retorno = true;
            }

        } catch(ClassCastException ex){
            System.out.println(ex.getMessage());
        }
        return retorno;
    }
}
