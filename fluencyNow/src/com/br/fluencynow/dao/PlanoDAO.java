package com.br.fluencynow.dao;

import com.br.fluencynow.model.Plano;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlanoDAO {

    public static boolean salvar(Plano plano) throws SQLException{
        boolean retorno = false;

        String SQL = "INSERT INTO plano (nome, valor) VALUES(?,?)";
        try {

            Connection conexao =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = conexao.prepareStatement(SQL);
            comandoSQL.setString(1, plano.getNome());
            comandoSQL.setDouble(2, plano.getValor());

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

    public List<Plano> getPlano()  {

        String SQL = "SELECT * FROM plano";

        List<Plano> listaPlano = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rset = null;


        try {

            conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            comandoSQL = conexao.prepareStatement(SQL);

            rset = comandoSQL.executeQuery();

            while (rset.next()) {

                Plano plano = new Plano();

                plano.setId(rset.getInt("id"));
                plano.setNome(rset.getString("nome"));
                plano.setValor(rset.getDouble("valor"));
                listaPlano.add(plano);
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
        return listaPlano;
    }

    public static Plano getPlanoByDescription(String description)  {

        String SQL = "SELECT id FROM plano WHERE nome = ?";

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rset = null;

        Plano plano = null;

        try {

            conexao = DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            comandoSQL = conexao.prepareStatement(SQL);
            comandoSQL.setString(1, description);


            rset = comandoSQL.executeQuery();

            while (rset.next()) {
                plano = new Plano();

                plano.setId(rset.getInt("id"));

                return plano;
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
        return plano;
    }

    public static boolean deletePlano(int id) throws SQLException {

        boolean retorno = false;

        String SQL = "DELETE FROM plano WHERE id=?";

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

    public void updatePlano(Plano plano) {

        String SQL = "UPDATE plano SET id=?, nome=?, valor=? WHERE id=?";
        try{
            Connection connection =  DriverManager.getConnection(ConexaoDAO.url, ConexaoDAO.login, ConexaoDAO.senha);

            PreparedStatement comandoSQL = connection.prepareStatement(SQL);
            comandoSQL.setInt(1, plano.getId());
            comandoSQL.setString(2, plano.getNome());
            comandoSQL.setDouble(3, plano.getValor());
            comandoSQL.setInt(4,plano.getId());

            comandoSQL.execute();

        } catch(ClassCastException | SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    }

