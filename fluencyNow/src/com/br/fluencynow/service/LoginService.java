package com.br.fluencynow.service;

import com.br.fluencynow.dao.LoginDAO;
import com.br.fluencynow.dto.AlterarLoginDTO;
import com.br.fluencynow.model.Login;

import java.sql.SQLException;

public class LoginService {

    public boolean updatePassword(AlterarLoginDTO alterarLoginDTO) throws SQLException {
        boolean retorno = false;
        Login login = new Login();
        login.usuario = alterarLoginDTO.getUsername();
        login.senha = alterarLoginDTO.getOldPassworld();

        LoginDAO loginDAO = new com.br.fluencynow.dao.LoginDAO();

        if(!loginDAO.exists(login))
            new IllegalArgumentException("Login ou senha invalido!");

        if(alterarLoginDTO.getNewPassworld().equals(alterarLoginDTO.getNewPassworldValidate())){
            int id = loginDAO.getId(alterarLoginDTO.getUsername(), alterarLoginDTO.getOldPassworld());

            if(!loginDAO.updateLogin(id, alterarLoginDTO.getNewPassworld()))
                new IllegalArgumentException("Falha ao trocar a senha tente novamente");

            retorno = true;
        }

        return retorno;
    }
}
