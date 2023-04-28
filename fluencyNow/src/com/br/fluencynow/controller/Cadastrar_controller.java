package com.br.fluencynow.controller;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.Date;

@Controller
public class Cadastrar_controller {

        @RequestMapping("/cadastrar")
        public ModelAndView cadastrar() {

            return new ModelAndView("cadastrarAluno");
        }

        @RequestMapping("/cadastrarAluno")
        public String adicionaAluno(Aluno aluno, HttpSession session) throws SQLException {
            if(new com.br.fluencynow.dao.AlunoDAO().saveStudent(aluno)) {
                session.setAttribute("alunoCadastrado", aluno);
                return "administrador";
            }
            return "redirect:home";
        }

    }


