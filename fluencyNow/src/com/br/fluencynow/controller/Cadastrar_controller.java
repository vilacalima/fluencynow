package com.br.fluencynow.controller;

import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Plano;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@Controller
public class Cadastrar_controller {

    /**
     * View da tela de cadastro
     * @param model
     * */
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

    /**
     * Controller de Cadastrar e Atualizar Alunos no banco de dados
     * @param req
     * @param resp
     * @param redirectAttributes
     * */
    @RequestMapping("/cadastrarAluno")
    public void adicionaAluno(HttpServletRequest req, HttpServletResponse resp, RedirectAttributes redirectAttributes) throws SQLException, IOException {
        try{
            AlunoDTO aluno = new AlunoDTO();
            if(req.getParameter("id") != ""){
                aluno.id = Integer.parseInt(req.getParameter("id"));
            }
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

            if(aluno.id > 0){
                boolean updateAluno = new com.br.fluencynow.service.AlunoService().UpdateAluno(aluno, redirectAttributes);
                if(updateAluno == true){
                    resp.sendRedirect("cadastrar");
                }
            } else{
                boolean salvarAluno = new com.br.fluencynow.service.AlunoService().SalvarAluno(aluno, redirectAttributes);
                if(salvarAluno == true){
                    resp.sendRedirect("cadastrar");
                }
            }
        } catch (Exception ex){
            resp.sendRedirect("administrador");
            redirectAttributes.addFlashAttribute("mensagemErro", ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Controller de Cadastrar e Atualizar Plano de aula no banco de dados
     * @param req
     * @param resp
     * @param redirectAttributes
     * */
    @RequestMapping("/cadastrarPlanos")
    public void adicionaPlano(HttpServletRequest req, HttpServletResponse resp, RedirectAttributes redirectAttributes) throws SQLException, IOException {
        try{

            Plano plano = new Plano();
            if(req.getParameter("idPlano") != ""){
                plano.id = Integer.parseInt(req.getParameter("idPlano"));
            }
            plano.nome = req.getParameter("nome");
            plano.valor = Double.parseDouble(req.getParameter("valor"));

            if(plano.id > 0){
                boolean atualizarPlano = new com.br.fluencynow.service.PlanoService().atualizarPlano(plano, redirectAttributes);
                if(atualizarPlano == true){
                    redirectAttributes.addFlashAttribute("mensagem", "Plano atualizado com Sucesso");
                    resp.sendRedirect("cadastrar");
                }
            } else{
                boolean salvarPlano = new com.br.fluencynow.service.PlanoService().salvarPlano(plano, redirectAttributes);
                if(salvarPlano == true){
                    redirectAttributes.addFlashAttribute("mensagem", "Plano criado com Sucesso");
                    resp.sendRedirect("cadastrar");
                }
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            redirectAttributes.addFlashAttribute("mensagemErro", ex.getMessage());
            resp.sendRedirect("administrador");
        }
    }

    /**
     * Controller para deletar um Aluno
     * @param req
     * @param resp
     * @param redirectAttributes
     * */
    @RequestMapping("/deletarAluno")
    public String deletaAluno(HttpServletRequest req, HttpServletResponse resp, RedirectAttributes redirectAttributes) throws SQLException {

        String cpf = req.getParameter("cpf");

        new com.br.fluencynow.service.AlunoService().DeletarAluno(cpf, redirectAttributes);

        return "redirect:administrador";
    }

    /**
     * Controller para Deletar um Plano
     * @param req
     * @param resp
     * @param redirectAttributes
     * */
    @RequestMapping("/deletarPlano")
    public String deletarPlano(HttpServletRequest req, HttpServletResponse resp, RedirectAttributes redirectAttributes) throws SQLException {

        int id = Integer.parseInt(req.getParameter("id"));
        new com.br.fluencynow.service.PlanoService().DeletarPlano(id, redirectAttributes);

        return "redirect:administrador";
    }
}


