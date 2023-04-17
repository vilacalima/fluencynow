package com.br.fluencynow.controller;

import com.br.fluencynow.DAO.AdministradorDAO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Lista_Conteiner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Administrador_controller {

    @RequestMapping("/administrador")
    public ModelAndView administrador() {

        return new ModelAndView("administrador");
    }

    @RequestMapping(value = "/getAluno", method = RequestMethod.GET)
    public String getAlunos(Model model) throws Exception{
        List<Aluno> alunos = getList();
        Lista_Conteiner lista = new Lista_Conteiner();
        lista.setAlunos(alunos);
        model.addAttribute("Alunos", lista);
        return "listaAluno";
    }

    private List<Aluno> getList() {

        List<Aluno> list = new ArrayList<>();

        Aluno aluno = new Aluno("afonso","111","222","rua afonso","55","55","55","aaa@aaa");

        list.add(aluno);

        return list;

    }



}
