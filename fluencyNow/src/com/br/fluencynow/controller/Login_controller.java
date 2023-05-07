package com.br.fluencynow.controller;

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

    @RequestMapping("/efetuaLogin")
    public String efetuaLogin(Login login, HttpSession session) throws SQLException {
        if(new com.br.fluencynow.dao.LoginDAO().exists(login)) {
            session.setAttribute("usuarioLogado", login);
            return "redirect:administrador";
        }
        return "redirect:login";
    }
}
