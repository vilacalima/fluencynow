package com.br.fluencynow.controller;

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

        return "administrador";
    }

    @RequestMapping("/deletarAluno")
    public String deletaAluno(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

        String cpf = req.getParameter("cpf");
        new com.br.fluencynow.service.AlunoService().DeletarAluno(cpf);

        return "redirect:administrador";
    }

    @RequestMapping("/deletarPlano")
    public String deletarPlano(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

        int id = Integer.parseInt(req.getParameter("id"));
        new com.br.fluencynow.dao.PlanoDAO().deletePlano(id);

        return "redirect:administrador";
    }
}
