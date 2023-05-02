package com.br.fluencynow.service;

import com.br.fluencynow.dao.AdministradorDAO;
import com.br.fluencynow.dao.AulaDAO;
import com.br.fluencynow.dao.PlanoDAO;
import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Aluno;
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

    public String getAluno(Model model){

        List<AlunoDTO> alunos = new AulaDAO().getStudentAndClass();
        AlunoDTO.Lista_container alunoList = new AlunoDTO.Lista_container();
        alunoList.setAlunos(alunos);
        model.addAttribute("Alunos", alunoList);

        return "administrador";
    }

}
