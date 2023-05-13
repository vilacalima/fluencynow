package com.br.fluencynow.dao;

import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Plano;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AulaDAO {

    /**
     * Salva uma aula no banco de dados
     * @param dia String
     * @param horario String
     * @param aluno int
     * @param plano int*/
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

    public static boolean updateClass(String dia, String horario, int aluno, int plano) throws SQLException {
        boolean retorno = false;

        String SQLAula = "UPDATE aula SET dia=?, horario=?, idPlano=? WHERE idAluno=?";

        try {

            Connection conexao =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);
            PreparedStatement comandoSQLAula = conexao.prepareStatement(SQLAula);
            comandoSQLAula.setString(1, dia );
            comandoSQLAula.setString(2, horario );
            comandoSQLAula.setInt(3, plano );
            comandoSQLAula.setInt(4, aluno );

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

    /**
     * Inner Join para pegar informações do aluno e Aula
     * */
    public List<AlunoDTO> getStudentAndClass()  {

        String SQL = "SELECT nome, cpf, email, au.dia, au.horario FROM ALUNO a INNER JOIN aula au WHERE a.id = au.idAluno ORDER BY nome asc";

        List<AlunoDTO> listaAlunos = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rset = null;

        try {

            conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);
            comandoSQL = conexao.prepareStatement(SQL);
            rset = comandoSQL.executeQuery();

            while (rset.next()) {

                AlunoDTO aluno = new AlunoDTO();

                aluno.setNome(rset.getString("nome"));
                aluno.setCpf(rset.getString("cpf"));
                aluno.setEmail(rset.getString("email"));
                aluno.setDiaAula(rset.getString("dia"));
                aluno.setHorarioAula(rset.getString("horario"));

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

    /**
     * Retorna Alunos o primeiro nome do aluno pelo dia e horario
     * @param dia String
     * @param horario String
     * */
    public String getClassAndStudent(String dia, String horario)  {

        String SQL = "SELECT a.nome FROM aluno a inner join aula au on au.idAluno = a.id where au.dia = ? and au.horario = ?";
        String studentName = null;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rset = null;

        try {

            conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);
            comandoSQL = conexao.prepareStatement(SQL);
            comandoSQL.setString(1, dia );
            comandoSQL.setString(2, horario );

            rset = comandoSQL.executeQuery();

            while (rset.next()) {

                AlunoDTO aluno = new AlunoDTO();

                aluno.setNome(rset.getString("nome"));

                String retorno = aluno.nome;
                if(retorno != null){
                    int posicaoEspaco = retorno.indexOf(' ');
                    studentName = retorno.substring(0, posicaoEspaco);
                } else {
                    studentName = "-";
                }
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
        return studentName;
    }

    /**
     * Retorna os valores pagos dos alunos
     * */
    public List<Double> getPrice()  {

        String SQL = "SELECT p.valor FROM PLANO p inner join aula a where p.id = a.idplano";
        String studentName = null;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rset = null;

        List<Double> priceList = new ArrayList<>();

        try {

            conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);
            comandoSQL = conexao.prepareStatement(SQL);

            rset = comandoSQL.executeQuery();

            while (rset.next()) {

                Double price = rset.getDouble("valor");
                priceList.add(price);
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
        return priceList;
    }

    /**
     * Deleta uma aula pelo id do aluno
     * @param id int
     * */
    public static boolean deleteClass(int id) throws SQLException {

        boolean retorno = false;

        String SQL = "DELETE FROM aula WHERE idaluno=?";

        try {
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            comandoSQL.setInt(1, id);

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
}
