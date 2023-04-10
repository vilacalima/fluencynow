package com.br.fluencynow.DAO;

import com.br.fluencynow.DAO.ConexaoDAO;
import com.br.fluencynow.model.Aluno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class AlunoDAO {

    public static boolean salvar(Aluno aluno) throws SQLException {
        boolean retorno = false;

        String SQL = "INSERT INTO aluno (nome, cpf, dataNascimento, endereco, cep, numero, celular, email) VALUES(?,?,?,?,?,?,?,?)";
        try {

            Connection conexao =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = conexao.prepareStatement(SQL);
            comandoSQL.setString(1, aluno.getNome());
            comandoSQL.setString(2, aluno.getCpf());
            comandoSQL.setDate(3, new java.sql.Date(aluno.getDataNascimento().getTime()));
            comandoSQL.setString(4, aluno.getEndereco());
            comandoSQL.setString(5, aluno.getCep());
            comandoSQL.setString(6, aluno.getNumero());
            comandoSQL.setString(6, aluno.getCelular());
            comandoSQL.setString(7, aluno.getEmail());

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
