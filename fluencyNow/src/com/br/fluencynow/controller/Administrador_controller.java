package com.br.fluencynow.controller;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.dao.PlanoDAO;
import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Plano;
import com.br.fluencynow.service.AlunoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
    public String updateAluno() throws SQLException {
        return "redirect:cadastrarAluno";
    }

    @RequestMapping("/updatePlano")
    public String updatePlano() throws SQLException {
        return "updatePlano";
    }

//    @RequestMapping("/saveUpdateAluno")
//    public void saveUpdate(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
//        String nome = req.getParameter("nome");
//        String cpf = req.getParameter("cpf");
//        String datanasc = req.getParameter("datanasc");
//        String endereco = req.getParameter("endereco");
//        String cep = req.getParameter("cep");
//        String numero = req.getParameter("numero");
//        String celular = req.getParameter("celular");
//        String email = req.getParameter("email");
//
//        Aluno alunoAtualizado = new Aluno(nome, cpf, datanasc, endereco, cep, numero, celular, email);
//
//        AlunoDAO alunoService = new AlunoDAO();
//        alunoService.updateStudent(alunoAtualizado);
//
//        resp.sendRedirect("cadastrar");
//    }

    @RequestMapping("/saveUpdatePlano")
    public void saveUpdatePlano(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
        String id = req.getParameter("id");
        String nome = req.getParameter("nome");
        String valor = req.getParameter("valor");


        Plano planoAtualizado = new Plano(Integer.parseInt(id), nome, Double.parseDouble(valor));

        PlanoDAO planoService = new PlanoDAO();
        planoService.updatePlano(planoAtualizado);

        resp.sendRedirect("cadastrar");
    }



    @RequestMapping("/deletarPlano")
    public String deletarPlano(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

        int id = Integer.parseInt(req.getParameter("id"));
        new com.br.fluencynow.dao.PlanoDAO().deletePlano(id);

        return "redirect:administrador";
    }
}
