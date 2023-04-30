package com.br.fluencynow.controller;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
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
        try{

            //continuar daqui esta retornando apenas a exception
            boolean salvarAluno = new com.br.fluencynow.service.AlunoService().SalvarAluno(aluno);
            if(salvarAluno == true){
                session.setAttribute("alunoCadastrado", aluno);
                return "redirect:administrador";
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return "redirect:home";
    }

    }


