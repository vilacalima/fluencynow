package com.br.fluencynow.controller;

import com.br.fluencynow.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

@Controller
public class Administrador_controller {


    @RequestMapping(value = "/administrador", method = RequestMethod.GET)
    public String getUsers(Model model) throws Exception{

        new com.br.fluencynow.service.AulaService().getAluno(model);
        new com.br.fluencynow.service.PlanoService().getPlano(model);
        new com.br.fluencynow.service.AulaService().getAulaEAluno(model);
        new com.br.fluencynow.service.AlunoService().quantidadeAluno(model);
        new com.br.fluencynow.service.AlunoService().aulasDisponiveis(model);
        new com.br.fluencynow.service.AlunoService().horasMinistradas(model);
        new com.br.fluencynow.service.AulaService().getRendimento(model);

        return "administrador";
    }

    @RequestMapping("/deletarAluno")
    public String deletaAluno(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

        String cpf = req.getParameter("cpf");
        new com.br.fluencynow.service.AlunoService().DeletarAluno(cpf);

        return "redirect:administrador";
    }

    @RequestMapping("/updateAluno")
    public String updateAluno(HttpServletRequest req, HttpServletResponse resp) throws SQLException {


        String cpf = req.getParameter("cpf");
        Aluno aluno = new Aluno();
        aluno.setCpf(cpf);
        new com.br.fluencynow.service.AlunoService().updateStudent(aluno);

        return "updateAluno";
    }

    @RequestMapping("/SaveUpdateAluno")
    public String saveUpdate(HttpServletRequest req, HttpServletResponse resp) throws SQLException {



        String nome = req.getParameter("nome");
        String cpf = req.getParameter("cpf");
        String datanasc = req.getParameter("datanasc");
        String endereco = req.getParameter("endereco");
        String cep = req.getParameter("cep");
        String numero = req.getParameter("numero");
        String celular = req.getParameter("celular");
        String email = req.getParameter("email");

        Aluno aluno = new Aluno(nome,cpf,datanasc,endereco,cep,numero,celular,email);

        new com.br.fluencynow.service.AlunoService().updateStudent(aluno);

        return "redirect:cadastrar";
    }




    @RequestMapping("/deletarPlano")
    public String deletarPlano(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

        int id = Integer.parseInt(req.getParameter("id"));
        new com.br.fluencynow.dao.PlanoDAO().deletePlano(id);

        return "redirect:administrador";
    }
}
