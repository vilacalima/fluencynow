package com.br.fluencynow.controller;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
public class Administrador_controller {

    @RequestMapping("/administrador")
    public ModelAndView administrador() {

        return new ModelAndView("administrador");
    }



    /*@RequestMapping("/cadastrarAluno")
    public String adicionaLogin(Aluno aluno, HttpSession session) throws SQLException {
        if(new com.br.fluencynow.dao.AlunoDAO().saveStudent(aluno)) {
            session.setAttribute("alunoCadastrado", aluno);
            return "welcome";
        }
        return "redirect:cadastrar";
    }
*/
}
