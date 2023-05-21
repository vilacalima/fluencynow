package com.br.fluencynow.controller;

import com.br.fluencynow.dto.AlterarLoginDTO;
import com.br.fluencynow.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@Controller
public class Login_controller {

    /**
     * View da página de login
     * */
    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    /**
     * View da página de Redefinir Senha
     * */
    @RequestMapping("/redefinirSenha")
    public ModelAndView redefinir() {
        return new ModelAndView("redefinir");
    }

    /**
     * Controller da action Efetuar Login
     * @param login
     * @param session
     * @param redirectAttributes
     * */
    @RequestMapping("/efetuaLogin")
    public String efetuaLogin(Login login, HttpSession session, RedirectAttributes redirectAttributes) throws SQLException {
        if(new com.br.fluencynow.dao.LoginDAO().exists(login)) {
            session.setAttribute("usuarioLogado", login);
            return "redirect:administrador";
        }
        redirectAttributes.addFlashAttribute("mensagemErro", "Usuário ou senha errado!");
        return "redirect:login";
    }

    /**
     * Controller de alterar a senha do usuário
     * @param alterarLoginDTO
     * @param session
     * */
    @RequestMapping("/alterarSenha")
    public String alterarLogin(AlterarLoginDTO alterarLoginDTO, HttpSession session, RedirectAttributes redirectAttributes) throws SQLException {
        try{
            new com.br.fluencynow.service.LoginService().updatePassword(alterarLoginDTO, redirectAttributes);
        } catch (Exception ex){
            redirectAttributes.addFlashAttribute("mensagemErro", ex.getMessage());
            System.out.println(ex.getMessage());
            return "redirect:redefinir";
        }
        return "redirect:login";
    }
}
