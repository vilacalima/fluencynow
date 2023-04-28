package com.br.fluencynow.controller;

import com.br.fluencynow.dao.AdministradorDAO;
import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
public class Administrador_controller {


    @RequestMapping(value = "/administrador", method = RequestMethod.GET)
    public String getUsers(Model model) throws Exception{

        List<Aluno> alunos = new AdministradorDAO().getAluno();
        Aluno.Lista_container alunoList = new Aluno.Lista_container();
        alunoList.setAlunos(alunos);
        model.addAttribute("Alunos", alunoList);
        return "administrador";
    }

    @RequestMapping("/deletarAluno")
    public String deletaAluno(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

        String cpf = req.getParameter("cpf");

        new com.br.fluencynow.dao.AlunoDAO().deleteStudent(cpf);

            return "redirect:administrador";
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
