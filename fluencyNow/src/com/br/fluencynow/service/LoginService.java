package com.br.fluencynow.service;

import com.br.fluencynow.dao.LoginDAO;
import com.br.fluencynow.dto.AlterarLoginDTO;
import com.br.fluencynow.model.Login;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.SQLException;

public class LoginService {

    /**
     * Faz a atualizaçao da senha no banco de dados
     * */
    public String updatePassword(AlterarLoginDTO alterarLoginDTO, RedirectAttributes redirectAttributes) throws SQLException {
        Login login = new Login();
        login.usuario = alterarLoginDTO.getUsername();
        login.senha = alterarLoginDTO.getOldPassworld();

        LoginDAO loginDAO = new com.br.fluencynow.dao.LoginDAO();

        if(!loginDAO.exists(login)){
            redirectAttributes.addFlashAttribute("mensagemErro", "Login ou senha invalido!");
            new IllegalArgumentException("Login ou senha invalido!");
            return "redirect:redefinir";
        }

        if(alterarLoginDTO.getNewPassworld().equals(alterarLoginDTO.getNewPassworldValidate())){
            int id = loginDAO.getId(alterarLoginDTO.getUsername(), alterarLoginDTO.getOldPassworld());

            if(!loginDAO.updateLogin(id, alterarLoginDTO.getNewPassworld())){
                new IllegalArgumentException("Falha ao trocar a senha tente novamente");
                redirectAttributes.addFlashAttribute("mensagemErro", "A nova senha e sua repetição devem ser iguais");
                return "redirect:redefinir";
            }

            redirectAttributes.addFlashAttribute("mensagem", "Senha alterada com Sucesso !");
            return "redirect:login";
        } else{
            redirectAttributes.addFlashAttribute("mensagemErro", "A nova senha e sua repetição devem ser iguais");
            return "redirect:redefinir";
        }
    }
}
