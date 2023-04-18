package com.br.fluencynow.controller;

import com.br.fluencynow.dao.AdministradorDAO;
import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Lista_container;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Aluno_controller {

    @RequestMapping(value = "/getAlunos", method = RequestMethod.GET)
    public String getUsers(Model model) throws Exception{

        List<Aluno> alunos = new AdministradorDAO().getAluno();
        Lista_container alunoList = new Lista_container();
        alunoList.setAlunos(alunos);
        model.addAttribute("Alunos", alunoList);
        return "showAlunos";
    }
}