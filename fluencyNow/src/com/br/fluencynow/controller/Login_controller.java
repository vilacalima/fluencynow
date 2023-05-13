package com.br.fluencynow.controller;

import com.br.fluencynow.dto.AlterarLoginDTO;
import com.br.fluencynow.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@Controller
public class Login_controller {

    @RequestMapping("/login")
    public ModelAndView login() {

        return new ModelAndView("login");
    }

    @RequestMapping("/redefinirSenha")
    public ModelAndView redefinir() {

        return new ModelAndView("redefinir");
    }

    @RequestMapping("/efetuaLogin")
    public String efetuaLogin(Login login, HttpSession session) throws SQLException {
        if(new com.br.fluencynow.dao.LoginDAO().exists(login)) {
            session.setAttribute("usuarioLogado", login);
            return "redirect:administrador";
        }
        return "redirect:login";
    }

    @RequestMapping("/alterarSenha")
    public String alterarLogin(AlterarLoginDTO alterarLoginDTO, HttpSession session) throws SQLException {
        try{

            boolean alterarSenha = new com.br.fluencynow.service.LoginService().updatePassword(alterarLoginDTO);
            if(alterarSenha == true){
                session.setAttribute("SenhaAlterada", alterarLoginDTO);
                return "redirect:home";
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return "redirect:redefinir";
    }
}
