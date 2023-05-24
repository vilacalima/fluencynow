package com.br.fluencynow.service;

import com.br.fluencynow.dao.LoginDAO;
import com.br.fluencynow.dto.AlterarLoginDTO;
import com.br.fluencynow.dto.MensagemDTO;
import com.br.fluencynow.model.Login;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.SQLException;

public class LoginService {

    /**
     * Faz a atualizaçao da senha no banco de dados
     * */
    public MensagemDTO updatePassword(AlterarLoginDTO alterarLoginDTO, RedirectAttributes redirectAttributes) throws SQLException {
        Login login = new Login();
        login.usuario = alterarLoginDTO.getUsername();
        login.senha = alterarLoginDTO.getOldPassworld();

        LoginDAO loginDAO = new com.br.fluencynow.dao.LoginDAO();
        MensagemDTO mensagem;

        if(!loginDAO.exists(login)){
            return mensagem = new MensagemDTO("Login ou senha invalido!",false);
        }

        if(alterarLoginDTO.getNewPassworld().equals(alterarLoginDTO.getNewPassworldValidate())){
            int id = loginDAO.getId(alterarLoginDTO.getUsername(), alterarLoginDTO.getOldPassworld());

            if(!loginDAO.updateLogin(id, alterarLoginDTO.getNewPassworld())){
                return mensagem = new MensagemDTO("Falha ao tentar trocar a senha",false);
            } else{
                return mensagem = new MensagemDTO("Senha alterada com Sucesso!",true);
            }
        } else{
            return mensagem = new MensagemDTO("A nova senha e sua repetição devem ser iguais",false);
        }
    }
}
