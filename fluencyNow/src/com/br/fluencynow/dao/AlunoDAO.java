package com.br.fluencynow.dao;

import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Plano;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    public static boolean saveStudent(AlunoDTO aluno) throws SQLException {
        boolean retorno = false;

        String SQL = "INSERT INTO aluno (nome, cpf, datanasc, endereco, cep, numero, celular, email) VALUES(?,?,?,?,?,?,?,?)";
        try {

            Connection conexao =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = conexao.prepareStatement(SQL);
            comandoSQL.setString(1, aluno.getNome());
            comandoSQL.setString(2, aluno.getCpf());
            comandoSQL.setString(3, aluno.getDataNasc());
            comandoSQL.setString(4, aluno.getEndereco());
            comandoSQL.setString(5, aluno.getCep());
            comandoSQL.setString(6, aluno.getNumero());
            comandoSQL.setString(7, aluno.getCelular());
            comandoSQL.setString(8, aluno.getEmail());

            int linhasAfetadas = comandoSQL.executeUpdate();

            if(linhasAfetadas > 0){
                System.out.println("Success Connection");
                retorno = true;

                Aluno getAluno = searchIdStudentByName(aluno.getNome());
                Plano plano = PlanoDAO.getPlanoByDescription(aluno.getPlano());

                boolean linhasAfetadasAula = AulaDAO.saveClass(aluno.getDiaAula(), aluno.getHorarioAula(), getAluno.getId(), plano.getId());

                if(linhasAfetadasAula == true){
                    System.out.println("Success Connection");
                    retorno = true;
                }

            }

        } catch(ClassCastException ex){
            System.out.println(ex.getMessage());
        }
        return retorno;
    }

    public static boolean updateStudent(Aluno aluno) throws SQLException {
        boolean retorno = false;

        String SQL = "UPDATE aluno SET nome=?, cpf=?, datanasc=?, endereco=?, cep=?, numero=?, celular=?, email=? WHERE cpf=?";
        try{
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            comandoSQL.setString(1, aluno.getNome());
            comandoSQL.setString(2, aluno.getCpf());
            comandoSQL.setString(3, aluno.getDataNasc());
            comandoSQL.setString(4, aluno.getEndereco());
            comandoSQL.setString(5, aluno.getCep());
            comandoSQL.setString(6, aluno.getNumero());
            comandoSQL.setString(6, aluno.getCelular());
            comandoSQL.setString(7, aluno.getEmail());
            comandoSQL.setString(8, aluno.getCpf());

            int success = comandoSQL.executeUpdate();

            if(success > 0){
                System.out.println("Success Connection");
                retorno = true;
            }

        } catch(ClassCastException ex){
            System.out.println(ex.getMessage());
        }
        return retorno;
    }
    public static boolean deleteStudent(String cpf) throws SQLException {

        boolean retorno = false;

        String SQL = "DELETE FROM aluno WHERE cpf=?";

        try {
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            comandoSQL.setString(1, cpf);

            int success = comandoSQL.executeUpdate();

            if(success > 0){
                System.out.println("Success Connection");
                retorno = true;
            }

        } catch(ClassCastException ex){
            System.out.println(ex.getMessage());
        }
        return retorno;
    }

    public static Aluno searchStudentByCPF(String cpf) throws SQLException {
        Aluno aluno = null;
        String SQL = "SELECT nome, cpf, datanasc, endereco, cep, numero, celular, email FROM aluno WHERE cpf=?";

        try{
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            comandoSQL.setString(1, cpf);

            ResultSet rs = comandoSQL.executeQuery();

            if(rs!=null){
                while(rs.next()){
                    aluno = new Aluno();
                    aluno.setNome(rs.getString("nome"));
                    aluno.setCep("cpf");
                    aluno.setDataNasc(rs.getString("datanasc"));
                    aluno.setEndereco(rs.getString("endereco"));
                    aluno.setCep(rs.getString("cep"));
                    aluno.setCelular(rs.getString("celular"));
                    aluno.setEmail(rs.getString("email"));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return aluno;
    }

    public static Aluno searchStudentByName(String nome) throws SQLException {
        Aluno aluno = null;
        String SQL = "SELECT nome, cpf, datanasc, endereco, cep, numero, celular, email FROM aluno WHERE nome=?";

        try{
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            comandoSQL.setString(1, nome);

            ResultSet rs = comandoSQL.executeQuery();

            if(rs!=null){
                while(rs.next()){
                    aluno = new Aluno();
                    aluno.setNome(rs.getString("nome"));
                    aluno.setCep(rs.getString("cpf"));
                    aluno.setDataNasc(rs.getString("datanasc"));
                    aluno.setEndereco(rs.getString("endereco"));
                    aluno.setCep(rs.getString("cep"));
                    aluno.setCelular(rs.getString("celular"));
                    aluno.setEmail(rs.getString("email"));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return aluno;
    }

    public static Aluno searchIdStudentByName(String nome) throws SQLException {
        Aluno aluno = null;
        String SQL = "SELECT id FROM aluno WHERE nome=?";

        try{
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            comandoSQL.setString(1, nome);

            ResultSet rs = comandoSQL.executeQuery();

            if(rs!=null){
                while(rs.next()){
                    aluno = new Aluno();
                    aluno.setId(rs.getInt("id"));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return aluno;
    }

    public static List<Aluno> getAllStundent() throws SQLException {
        List<Aluno> listaAluno = new ArrayList<>();
        String SQL = "SELECT nome, cpf, datanasc, endereco, cep, numero, celular, email FROM aluno";

        try{
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            ResultSet rs = comandoSQL.executeQuery();

            if(rs!=null){
                while(rs.next()){
                    Aluno aluno = new Aluno();
                    aluno.setNome(rs.getString("nome"));
                    aluno.setCep(rs.getString("cpf"));
                    aluno.setDataNasc(rs.getString("datanasc"));
                    aluno.setEndereco(rs.getString("endereco"));
                    aluno.setCep(rs.getString("cep"));
                    aluno.setCelular(rs.getString("celular"));
                    aluno.setEmail(rs.getString("email"));

                    listaAluno.add(aluno);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listaAluno;
    }

    public static List<Aluno> getStundent() throws SQLException {
        List<Aluno> listaAluno = new ArrayList<>();
        String SQL = "SELECT nome, cpf, email FROM aluno";

        try{
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            ResultSet rs = comandoSQL.executeQuery();

            if(rs!=null){
                while(rs.next()){
                    Aluno aluno = new Aluno();
                    aluno.setNome(rs.getString("nome"));
                    aluno.setCep(rs.getString("cpf"));
                    aluno.setEmail(rs.getString("email"));

                    listaAluno.add(aluno);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listaAluno;
    }

    public static boolean deleteStudent(Aluno aluno) throws SQLException {
        boolean retorno = false;

        String SQL = "DELETE from aluno where cpf = ?";
        try {

            Connection conexao =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);



            PreparedStatement comandoSQL = conexao.prepareStatement(SQL);
            comandoSQL.setString(1, aluno.getCpf());
            comandoSQL.execute();



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
