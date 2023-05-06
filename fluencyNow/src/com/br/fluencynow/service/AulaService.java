package com.br.fluencynow.service;

import com.br.fluencynow.dao.AulaDAO;
import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.dto.DiaAula;
import org.springframework.ui.Model;

import java.util.ArrayList;
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

    public String getAulaEAluno(Model model){

        List<DiaAula> listDiaAula = new ArrayList<>();

        /*Lista das 08H*/
        listDiaAula.add(new DiaAula("08:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_08h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_08h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_08h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_08h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_08h00.toString())));

        /*Lista das 09H*/
        listDiaAula.add(new DiaAula("09:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_09h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_09h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_09h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_09h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_09h00.toString())));

        /*Lista das 10H*/
        listDiaAula.add(new DiaAula("10:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_10h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_10h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_10h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_10h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_10h00.toString())));

        /*Lista das 11H*/
        listDiaAula.add(new DiaAula("11:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_11h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_11h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_11h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_11h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_11h00.toString())));

        /*Lista das 12H*/
        listDiaAula.add(new DiaAula("12:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_12h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_12h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_12h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_12h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_12h00.toString())));

        /*Lista das 13H*/
        listDiaAula.add(new DiaAula("13:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_13h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_13h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_13h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_13h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_13h00.toString())));

        /*Lista das 15H*/
        listDiaAula.add(new DiaAula("15:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_15h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_15h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_15h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_15h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_15h00.toString())));

        /*Lista das 16H*/
        listDiaAula.add(new DiaAula("16:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_16h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_16h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_16h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_16h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_16h00.toString())));

        /*Lista das 17H*/
        listDiaAula.add(new DiaAula("17:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_17h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_17h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_17h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_17h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_17h00.toString())));

        DiaAula.Lista_container diaAula = new DiaAula.Lista_container();
        diaAula.setDiaAula(listDiaAula);
        model.addAttribute("DiaAula", diaAula);

        return "administrador";
    }

}
