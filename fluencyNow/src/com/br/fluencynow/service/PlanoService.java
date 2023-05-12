package com.br.fluencynow.service;

import com.br.fluencynow.dao.PlanoDAO;
import com.br.fluencynow.model.Plano;
import org.springframework.ui.Model;

import java.sql.SQLException;
import java.util.List;

public class PlanoService {


    public boolean SalvarPlano(Plano plano) throws SQLException {
        boolean criarPlano = com.br.fluencynow.dao.PlanoDAO.salvar(plano);
        return criarPlano;
    }

    public String getPlano(Model model) throws SQLException {

        List<Plano> planos = new PlanoDAO().getPlano();
        Plano.Lista_container planoList = new Plano.Lista_container();
        planoList.setPlanos(planos);
        model.addAttribute("Planos", planoList);

        return "cadastrarAluno";
    }


}
