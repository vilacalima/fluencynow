package com.br.fluencynow.controller;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.dao.PlanoDAO;
import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Plano;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Controller
public class Cadastrar_controller {

    @RequestMapping("/cadastrar")
    public ModelAndView cadastrar(Model model) {

        try {
            new com.br.fluencynow.service.AlunoService().getAluno(model);
            new com.br.fluencynow.service.PlanoService().getPlano(model);
            new com.br.fluencynow.service.AulaService().getDia(model);
            new com.br.fluencynow.service.AulaService().getHora(model);

            new com.br.fluencynow.service.PlanoService().getPlano(model);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

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
    public void adicionaAluno(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
        try{
            AlunoDTO aluno = new AlunoDTO();
            //aluno.id = Integer.parseInt(req.getParameter("id"));
            aluno.nome = req.getParameter("nome");
            aluno.cpf = req.getParameter("cpf");
            aluno.dataNasc = req.getParameter("dataNasc");
            aluno.endereco = req.getParameter("endereco");
            aluno.cep = req.getParameter("cep");
            aluno.numero = req.getParameter("numero");
            aluno.celular = req.getParameter("celular");
            aluno.email = req.getParameter("email");
            aluno.plano = req.getParameter("plano");
            aluno.diaAula = req.getParameter("diaAula");
            aluno.horarioAula = req.getParameter("horarioAula");

            if(new com.br.fluencynow.dao.AlunoDAO().existsStudent(aluno.cpf)){
                boolean updateAluno = new com.br.fluencynow.service.AlunoService().UpdateAluno(aluno);
                if(updateAluno == true){
                    resp.sendRedirect("cadastrar");
                }
            } else{
                boolean salvarAluno = new com.br.fluencynow.service.AlunoService().SalvarAluno(aluno);
                if(salvarAluno == true){
                    resp.sendRedirect("cadastrar");
                }
            }
        } catch (Exception ex){
            resp.sendRedirect("administrador");
            System.out.println(ex.getMessage());
        }
    }

    @RequestMapping("/cadastrarPlanos")
    public String adicionaPlano(Plano plano, HttpSession session) throws SQLException {
        try{

            //continuar daqui adicionar o id para atualizar plano
            boolean salvarPlano = new com.br.fluencynow.service.PlanoService().SalvarPlano(plano);
            if(salvarPlano == true){
                session.setAttribute("planoCadastrado", plano);
                return "redirect:administrador";
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return "redirect:home";
    }
}


