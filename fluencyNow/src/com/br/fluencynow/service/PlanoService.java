package com.br.fluencynow.service;

import com.br.fluencynow.dao.PlanoDAO;
import com.br.fluencynow.dto.MensagemDTO;
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
    public MensagemDTO salvarPlano(Plano plano, RedirectAttributes redirectAttributes) throws SQLException {
        MensagemDTO mensagem;

        if(com.br.fluencynow.dao.PlanoDAO.salvar(plano)){
            return mensagem = new MensagemDTO("Plano salvo com sucesso.",true);
        } else{
            return mensagem = new MensagemDTO("Houve um erro desconhecido ao tentar salvar um plano.",false);
        }
    }

    /**
     * Atualiza um plano no banco de dados
     * @param plano
     * @param redirectAttributes
     * */
    public MensagemDTO atualizarPlano(Plano plano, RedirectAttributes redirectAttributes) throws SQLException {
        MensagemDTO mensagem;

        if(com.br.fluencynow.dao.PlanoDAO.updatePlano(plano)){
            return mensagem = new MensagemDTO("Plano atualizado com sucesso.",true);
        } else{
            return mensagem = new MensagemDTO("Houve um erro desconhecido ao tentar atualizar um plano.",false);
        }
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
    public MensagemDTO DeletarPlano(int id, RedirectAttributes redirectAttributes) throws SQLException {
        MensagemDTO mensagem;
        if(new com.br.fluencynow.dao.PlanoDAO().deletePlano(id)){
            return mensagem = new MensagemDTO("Plano Deletado com Sucesso.",true);
        } else{
            return mensagem = new MensagemDTO("Houve um erro ao deletar o Plano",false);
        }
    }
}
