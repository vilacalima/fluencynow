package com.br.fluencynow.service;

import com.br.fluencynow.dao.PlanoDAO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Plano;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.SQLException;
import java.util.List;

public class PlanoService {

    /**
     * Salva um plano no banco de dados
     * @param plano
     * @param redirectAttributes
     * */
    public boolean salvarPlano(Plano plano, RedirectAttributes redirectAttributes) throws SQLException {
        boolean criarPlano = com.br.fluencynow.dao.PlanoDAO.salvar(plano);
        return criarPlano;
    }

    /**
     * Atualiza um plano no banco de dados
     * @param plano
     * @param redirectAttributes
     * */
    public boolean atualizarPlano(Plano plano, RedirectAttributes redirectAttributes) throws SQLException {
        boolean atualizaPlano = com.br.fluencynow.dao.PlanoDAO.updatePlano(plano);
        return atualizaPlano;
    }

    /**
     * Pega uma lista de planos no banco de dados
     * */
    public String getPlano(Model model) throws SQLException {

        List<Plano> planos = new PlanoDAO().getPlano();
        Plano.Lista_container planoList = new Plano.Lista_container();
        planoList.setPlanos(planos);
        model.addAttribute("Planos", planoList);

        return "cadastrarAluno";
    }

    /**
     * Deleta um plano do banco de dados
     * @param id
     * @param redirectAttributes
     * */
    public void DeletarPlano(int id, RedirectAttributes redirectAttributes) throws SQLException {

        if(new com.br.fluencynow.dao.PlanoDAO().deletePlano(id)){
            redirectAttributes.addFlashAttribute("mensagem", "Plano Deletado com Sucesso");
        } else{
            redirectAttributes.addFlashAttribute("mensagemErro", "Houve um erro ao deletar o Plano");
        }
    }
}
