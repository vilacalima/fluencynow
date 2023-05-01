package com.br.fluencynow.service;

import com.br.fluencynow.dao.PlanoDAO;
import com.br.fluencynow.model.Plano;
import org.springframework.ui.Model;

import java.sql.SQLException;
import java.util.List;

public class AulaService {


    public String getDia(Model model) {

        model.addAttribute("diasDaSemana", DiasdaSemana.values());
        return "cadastrarAluno";
    }

    public String getHora(Model model) {

        model.addAttribute("horaAula", HorarioAula.values());
        return "cadastrarAluno";
    }

}
