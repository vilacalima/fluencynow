package com.br.fluencynow.controller;

import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.dto.MensagemDTO;
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
    private String sucesso = "mensagem";
    private String erro = "mensagemErro";
    private final String pageAdm = "redirect:administrador";
    private final String pageCadastro = "redirect:cadastrar";

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
    public String adicionaAluno(HttpServletRequest req, HttpServletResponse resp, RedirectAttributes redirectAttributes) throws SQLException, IOException {
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
                MensagemDTO updateClass = new com.br.fluencynow.service.AlunoService().UpdateAluno(aluno, redirectAttributes);
                return retornoMensage(updateClass, redirectAttributes);
            } else{
                MensagemDTO saveClass = new com.br.fluencynow.service.AlunoService().SalvarAluno(aluno, redirectAttributes);
                return retornoMensage(saveClass, redirectAttributes);
            }
        } catch (Exception ex){
            redirectAttributes.addFlashAttribute(erro, ex.getMessage());
            System.out.println(ex.getMessage());
            return pageCadastro;
        }
    }

    /**
     * Controller de Cadastrar e Atualizar Plano de aula no banco de dados
     * @param req
     * @param resp
     * @param redirectAttributes
     * */
    @RequestMapping("/cadastrarPlanos")
    public String adicionaPlano(HttpServletRequest req, HttpServletResponse resp, RedirectAttributes redirectAttributes) throws SQLException, IOException {
        try{

            Plano plano = new Plano();
            if(req.getParameter("idPlano") != ""){
                plano.id = Integer.parseInt(req.getParameter("idPlano"));
            }
            plano.nome = req.getParameter("nome");
            plano.valor = Double.parseDouble(req.getParameter("valor"));

            if(plano.id > 0){
                MensagemDTO atualizarPlano = new com.br.fluencynow.service.PlanoService().atualizarPlano(plano, redirectAttributes);
                return retornoMensage(atualizarPlano, redirectAttributes);
            } else{
                MensagemDTO salvarPlano = new com.br.fluencynow.service.PlanoService().salvarPlano(plano, redirectAttributes);
                return retornoMensage(salvarPlano, redirectAttributes);
            }
        } catch (Exception ex){
            redirectAttributes.addFlashAttribute(erro, ex.getMessage());
            System.out.println(ex.getMessage());
            return pageCadastro;
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
        try{
            String cpf = req.getParameter("cpf");
            MensagemDTO deletar = new com.br.fluencynow.service.AlunoService().DeletarAluno(cpf, redirectAttributes);

            return retornoMensage(deletar, redirectAttributes);
        } catch (Exception ex){
            redirectAttributes.addFlashAttribute(erro, ex.getMessage());
            System.out.println(ex.getMessage());
            return pageCadastro;
        }
    }

    /**
     * Controller para Deletar um Plano
     * @param req
     * @param resp
     * @param redirectAttributes
     * */
    @RequestMapping("/deletarPlano")
    public String deletarPlano(HttpServletRequest req, HttpServletResponse resp, RedirectAttributes redirectAttributes) throws SQLException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            MensagemDTO deletar = new com.br.fluencynow.service.PlanoService().DeletarPlano(id, redirectAttributes);

            return retornoMensage(deletar, redirectAttributes);
        } catch (Exception ex){
            redirectAttributes.addFlashAttribute(erro, ex.getMessage());
            System.out.println(ex.getMessage());
            return pageCadastro;
        }
    }

    public String retornoMensage(MensagemDTO mensagem, RedirectAttributes redirectAttributes){
        if(mensagem.isSuccess == true){
            redirectAttributes.addFlashAttribute(sucesso, mensagem.message);
            return pageAdm;
        } else{
            redirectAttributes.addFlashAttribute(erro, mensagem.message);
            return pageAdm;
        }
    }
}


