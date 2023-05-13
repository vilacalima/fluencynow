package com.br.fluencynow.dao;

import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Plano;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    /**
     * Salva um objeto aluno no banco de dados
     * @param aluno Aluno
     * */
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

    /**
     * Pega um objeto aluno do banco de dados
     * */
    public List<AlunoDTO> getStudent()  {

        String SQL = "SELECT a.id, a.nome, a.cpf, a.datanasc, a.endereco, a.cep, a.numero, a.celular, a.email, au.dia, au.horario, p.nome as nomePlano\n" +
                "FROM plano p\n" +
                "INNER JOIN plano ap ON ap.id = p.id\n" +
                "INNER JOIN aluno a ON a.id = au.idAluno\n" +
                "INNER JOIN aula au ON au.idPlano = p.id\n" +
                "ORDER BY a.nome asc";

        List<AlunoDTO> listaAlunos = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet  rset = null;


        try {

            conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            comandoSQL = conexao.prepareStatement(SQL);

            rset = comandoSQL.executeQuery();

            while (rset.next()) {

                AlunoDTO aluno = new AlunoDTO();

                aluno.setNome(rset.getString("nome"));
                aluno.setCpf(rset.getString("cpf"));
                aluno.setDataNasc(rset.getString("DataNasc"));
                aluno.setEndereco(rset.getString("endereco"));
                aluno.setCep(rset.getString("cep"));
                aluno.setNumero(rset.getString("numero"));
                aluno.setCelular(rset.getString("celular"));
                aluno.setEmail(rset.getString("email"));
                aluno.setId(rset.getInt("id"));
                aluno.setDiaAula(rset.getString("dia"));
                aluno.setHorarioAula(rset.getString("horario"));
                aluno.setPlano(rset.getString("nomePlano"));
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
     * Realiza o update de um objeto aluno no banco de dados
     * @param aluno Aluno
     * */
    public boolean updateStudent(AlunoDTO aluno) throws SQLException {
        boolean retorno = false;

        String SQL = "UPDATE aluno SET nome=?, cpf=?, datanasc=?, endereco=?, cep=?, numero=?, celular=?, email=? WHERE id=?";
        try{
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            comandoSQL.setString(1, aluno.getNome());
            comandoSQL.setString(2, aluno.getCpf());
            comandoSQL.setString(3, aluno.getDataNasc());
            comandoSQL.setString(4, aluno.getEndereco());
            comandoSQL.setString(5, aluno.getCep());
            comandoSQL.setString(6, aluno.getNumero());
            comandoSQL.setString(7, aluno.getCelular());
            comandoSQL.setString(8, aluno.getEmail());
            comandoSQL.setInt(9, aluno.getId());

            int linhasAfetadas = comandoSQL.executeUpdate();

            if(linhasAfetadas > 0){
                System.out.println("Success Connection");
                retorno = true;

                Aluno getAluno = searchIdStudentByName(aluno.getNome());
                Plano plano = PlanoDAO.getPlanoByDescription(aluno.getPlano());

                boolean linhasAfetadasAula = AulaDAO.updateClass(aluno.getDiaAula(), aluno.getHorarioAula(), getAluno.getId(), plano.getId());

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

    /**
     * Deleta um objeto aluno no banco de dados pelo cpf
     * @param cpf String
     * */
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

    /**
     * Procura um aluno no banco de dados pelo nome
     * @param nome String
     * */
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

    /**
     * Procura um aluno no banco de dados pelo cpf
     * @param cpf String
     * */
    public static Aluno searchIdStudentByCpf(String cpf) throws SQLException {
        Aluno aluno = null;
        String SQL = "SELECT id FROM aluno WHERE cpf=?";

        try{
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            comandoSQL.setString(1, cpf);

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

    public static boolean existsStudent(String cpf) throws SQLException {
        boolean retorno = false;
        String SQL = "SELECT id FROM aluno WHERE cpf=?";

        try{
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            comandoSQL.setString(1, cpf);

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

    /**
     * Retorna a quantidade de alunos cadastrados no banco de dados
     * */
    public static int getStudentCount() throws SQLException {
        int count = 0;
        String SQL = "SELECT COUNT(*) FROM aluno";

        try{
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);
            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            ResultSet rs = comandoSQL.executeQuery();

            if(rs!=null){
                while(rs.next()){
                    count = rs.getInt(1);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }
}
