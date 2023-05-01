package com.br.fluencynow.controller;

import com.br.fluencynow.dao.AdministradorDAO;
import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.dao.PlanoDAO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Plano;
import com.br.fluencynow.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Controller
public class Cadastrar_controller {

    @RequestMapping("/cadastrar")
    public ModelAndView cadastrar(Model model) {

        List<Aluno> alunos = new AdministradorDAO().getAluno();
        Aluno.Lista_container alunoList = new Aluno.Lista_container();
        alunoList.setAlunos(alunos);
        model.addAttribute("Alunos", alunoList);

        return new ModelAndView("cadastrarAluno");
    }

    @RequestMapping("/cadastrarPlano")
    public ModelAndView cadastrarPlano(Model model) {

        List<Plano> planos = new PlanoDAO().getPlano();
        Plano.Lista_container planoList = new Plano.Lista_container();
        planoList.setPlanos(planos);
        model.addAttribute("Planos", planoList);

        return new ModelAndView("cadastrarPlano");
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

    @RequestMapping("/cadastrarPlanos")
    public String adicionaPlano(Plano plano, HttpSession session) throws SQLException {
        try{

            //continuar daqui esta retornando apenas a exception
            boolean salvarAluno = new com.br.fluencynow.service.PlanoService().SalvarPlano(plano);
            if(salvarAluno == true){
                session.setAttribute("planoCadastrado", plano);
                return "redirect:administrador";
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return "redirect:home";
    }
}


