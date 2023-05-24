package com.br.fluencynow.controller;

import com.br.fluencynow.dto.AlterarLoginDTO;
import com.br.fluencynow.dto.MensagemDTO;
import com.br.fluencynow.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@Controller
public class Login_controller {

    private String sucesso = "mensagem";
    private String erro = "mensagemErro";
    private String pageAdm = "redirect:administrador";
    private String pageLogin = "redirect:login";

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
            return pageAdm;
        }
        redirectAttributes.addFlashAttribute(erro, "Usuário ou senha errado!");
        return pageLogin;
    }

    /**
     * Controller de alterar a senha do usuário
     * @param alterarLoginDTO
     * @param session
     * */
    @RequestMapping("/alterarSenha")
    public String alterarLogin(AlterarLoginDTO alterarLoginDTO, HttpSession session, RedirectAttributes redirectAttributes) throws SQLException {
        try{
            MensagemDTO login = new com.br.fluencynow.service.LoginService().updatePassword(alterarLoginDTO, redirectAttributes);
            return retornoMensage(login, redirectAttributes);
        } catch (Exception ex){
            redirectAttributes.addFlashAttribute(erro, ex.getMessage());
            System.out.println(ex.getMessage());
            return pageLogin;
        }
    }

    public String retornoMensage(MensagemDTO mensagem, RedirectAttributes redirectAttributes){
        if(mensagem.isSuccess == true){
            redirectAttributes.addFlashAttribute(sucesso, mensagem.message);
        } else{
            redirectAttributes.addFlashAttribute(erro, mensagem.message);
        }
        return pageLogin;
    }
}
