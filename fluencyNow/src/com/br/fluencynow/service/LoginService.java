package com.br.fluencynow.service;

import com.br.fluencynow.dao.LoginDAO;
import com.br.fluencynow.model.Login;

import java.sql.SQLException;

public class LoginService {

    public String updatePassword(String user, String oldPassword, String newPassword, String repeatPassworld) throws SQLException {
        Login login = new Login();
        login.usuario = user;
        login.senha = oldPassword;

        LoginDAO loginDAO = new com.br.fluencynow.dao.LoginDAO();

        if(!loginDAO.exists(login))
            new IllegalArgumentException("Login ou senha invalido!");

        if(newPassword.equals(repeatPassworld)){
            int id = loginDAO.getId(user, oldPassword);

            if(!loginDAO.updateLogin(id, newPassword))
                new IllegalArgumentException("Falha ao trocar a senha tente novamente");
        }

        return "login";
    }
}
