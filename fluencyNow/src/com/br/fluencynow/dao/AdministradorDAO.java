package com.br.fluencynow.dao;

import com.br.fluencynow.model.Aluno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdministradorDAO {

    public List<Aluno> getAluno()  {

        String SQL = "SELECT * FROM aluno";

        List<Aluno> listaAlunos = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet  rset = null;


        try {

            conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            comandoSQL = conexao.prepareStatement(SQL);

            rset = comandoSQL.executeQuery();

            while (rset.next()) {

                Aluno aluno = new Aluno();

                aluno.setNome(rset.getString("nome"));
                aluno.setCpf(rset.getString("cpf"));
                aluno.setDataNasc(rset.getString("DataNasc"));
                aluno.setEndereco(rset.getString("endereco"));
                aluno.setCep(rset.getString("cep"));
                aluno.setNumero(rset.getString("numero"));
                aluno.setCelular(rset.getString("celular"));
                aluno.setEmail(rset.getString("email"));

                listaAlunos.add(aluno);

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
        return listaAlunos;
    }


    public void filter(String filter) {

        String SQL = "SELECT processador from computador where processador like ?";

        String fil = "'%"+filter+"%'";

        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            comandoSQL = conexao.prepareStatement(SQL);

            comandoSQL.setString(1, fil);
            comandoSQL.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
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

    }

    public List<Aluno> getFill(String f) {
        String fil = "'%"+f+"%'";

        String SQL = "SELECT cpf from aluno where processador like "+fil;

        List<Aluno> alunos = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rset = null;


        try {
            conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            comandoSQL = conexao.prepareStatement(SQL);

            rset = comandoSQL.executeQuery();

            while (rset.next()) {
                Aluno aluno = new Aluno();



                aluno.setCpf(rset.getString("Cpf"));

                alunos.add(aluno);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (comandoSQL != null) {
                    comandoSQL .close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return alunos;
    }
}