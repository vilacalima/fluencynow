package com.br.fluencynow.controller;

import com.br.fluencynow.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@Controller
public class TestDB_controller {

    @RequestMapping("/testDB")
    public ModelAndView testDB() {

        return new ModelAndView("testDB");
    }

    @RequestMapping("/adicionaLogin")
    public String adicionaLogin(Login login, HttpSession session) throws SQLException {
        if(new com.br.fluencynow.dao.LoginDAO().salvar(login)) {
            session.setAttribute("usuarioAdicionado", login);
            return "welcome";
        }
        return "redirect:login";
    }

}
