//package com.br.fluencynow.dao;
//
//
//import com.br.fluencynow.model.Aula;
//
//import java.sql.*;
//
//public class AulaDAO {
//
//    public static boolean saveClass(Aula aula) throws SQLException {
//        boolean retorno = false;
//
//        String SQL = "INSERT INTO aluno (dia, horario, idaluno, idplano) VALUES(?,?,?,?)";
//        try {
//
//            Connection conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);
//
//            PreparedStatement comandoSQL = conexao.prepareStatement(SQL);
//            comandoSQL.setDate(1, new java.sql.Date(aula.getData().getTime()));
//            comandoSQL.setString(2, aula.getHorario());
//            comandoSQL.setInt(3, aula.getIdAluno());
//            comandoSQL.setInt(4, aula.getIdAula());
//
//            int linhasAfetadas = comandoSQL.executeUpdate();
//
//            if (linhasAfetadas > 0) {
//                System.out.println("Success Connection");
//                retorno = true;
//            }
//
//        } catch (ClassCastException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return retorno;
//    }
//
//    public static boolean updateClass(Aula aula) throws SQLException {
//        boolean retorno = false;
//
//        String SQL = "UPDATE aluno SET dia=?, horario=?, idaluno=?, idplano=? WHERE id=?";
//        try{
//            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);
//
//            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
//            comandoSQL.setDate(1, new java.sql.Date(aula.getData().getTime()));
//            comandoSQL.setString(2, aula.getHorario());
//            comandoSQL.setInt(3, aula.getIdAluno());
//            comandoSQL.setInt(4, aula.getIdAula());
//            comandoSQL.setInt(5, aula.getId());
//
//            int success = comandoSQL.executeUpdate();
//
//            if(success > 0){
//                System.out.println("Success Connection");
//                retorno = true;
//            }
//
//        } catch(ClassCastException ex){
//            System.out.println(ex.getMessage());
//        }
//        return retorno;
//    }
//
//    public static boolean deleteClass(int id) throws SQLException {
//
//        boolean retorno = false;
//
//        String SQL = "DELETE FROM aula WHERE id=?";
//
//        try {
//            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);
//
//            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
//            comandoSQL.setInt(1, id);
//
//            int success = comandoSQL.executeUpdate();
//
//            if(success > 0){
//                System.out.println("Success Connection");
//                retorno = true;
//            }
//
//        } catch(ClassCastException ex){
//            System.out.println(ex.getMessage());
//        }
//        return retorno;
//    }
//
//    public static Aula getClassByAlunoId(int id) throws SQLException {
//        Aula aula = null;
//        String SQL = "SELECT dia, horario, idaluno, idplano FROM aluno WHERE cpf=?";
//
//        try{
//            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);
//
//            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
//            comandoSQL.setInt(1, aula.getId());
//
//            ResultSet rs = comandoSQL.executeQuery();
//
//            if(rs!=null){
//                while(rs.next()){
//                    aula = new Aula();
//                    aula.setData(rs.getDate("dia"));
//                    aula.setHorario(rs.getString("horario"));
//                    aula.setIdAluno(rs.getInt("idaluno"));
//                    aula.setIdAula(rs.getInt("idplano"));
//            }
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        return aula;
//    }
//}
