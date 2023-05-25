package com.br.fluencynow.service;

import com.br.fluencynow.dao.AulaDAO;
import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.dto.DiaAulaDTO;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

public class AulaService {

    /**
     * Serviço que recebe os dias da semana e envia para a view da controller
     * @param model
     * */
    public String getDia(Model model) {

        model.addAttribute("diasDaSemana", DiasdaSemana.values());
        return "cadastrarAluno";
    }

    /**
     * Serviço que recebe as horas de aula para a view da controller
     * @param model
     * */
    public String getHora(Model model) {

        model.addAttribute("horaAula", HorarioAula.values());
        return "cadastrarAluno";
    }

    /**
     * Serviço que recebe alunos do banco de dados paara a view da controller
     * @param model
     * */
    public String getAluno(Model model){

        List<AlunoDTO> alunos = new AulaDAO().getStudentAndClass();
        AlunoDTO.Lista_container alunoList = new AlunoDTO.Lista_container();
        alunoList.setAlunos(alunos);
        model.addAttribute("Alunos", alunoList);

        return "administrador";
    }

    /**
     * Serviço que recebe aula e aluno do banco de dados e envia para para a view do calendario
     * @param model
     * */
    public String getAulaEAluno(Model model){

        List<DiaAulaDTO> listDiaAulaDTO = new ArrayList<>();

        /*Lista das 08H*/
        listDiaAulaDTO.add(new DiaAulaDTO("08:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_08h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_08h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_08h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_08h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_08h00.toString())));

        /*Lista das 09H*/
        listDiaAulaDTO.add(new DiaAulaDTO("09:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_09h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_09h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_09h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_09h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_09h00.toString())));

        /*Lista das 10H*/
        listDiaAulaDTO.add(new DiaAulaDTO("10:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_10h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_10h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_10h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_10h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_10h00.toString())));

        /*Lista das 11H*/
        listDiaAulaDTO.add(new DiaAulaDTO("11:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_11h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_11h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_11h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_11h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_11h00.toString())));

        /*Lista das 12H*/
        listDiaAulaDTO.add(new DiaAulaDTO("12:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_12h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_12h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_12h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_12h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_12h00.toString())));

        /*Lista das 13H*/
        listDiaAulaDTO.add(new DiaAulaDTO("13:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_13h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_13h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_13h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_13h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_13h00.toString())));

        /*Lista das 15H*/
        listDiaAulaDTO.add(new DiaAulaDTO("15:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_15h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_15h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_15h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_15h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_15h00.toString())));

        /*Lista das 16H*/
        listDiaAulaDTO.add(new DiaAulaDTO("16:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_16h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_16h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_16h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_16h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_16h00.toString())));

        /*Lista das 17H*/
        listDiaAulaDTO.add(new DiaAulaDTO("17:00",
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEGUNDA_FEIRA.toString(), HorarioAula.Aula_17h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.TERCA_FEIRA.toString(), HorarioAula.Aula_17h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUARTA_FEIRA.toString(), HorarioAula.Aula_17h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.QUINTA_FEIRA.toString(), HorarioAula.Aula_17h00.toString()),
                new AulaDAO().getClassAndStudent(DiasdaSemana.SEXTA_FEIRA.toString(), HorarioAula.Aula_17h00.toString())));

        DiaAulaDTO.Lista_container diaAula = new DiaAulaDTO.Lista_container();
        diaAula.setDiaAula(listDiaAulaDTO);
        model.addAttribute("DiaAula", diaAula);

        return "administrador";
    }

    /**
     * Serviço que recebe o rendimento no banco de dados e envia para o view para a controller
     * */
    public String getRendimento(Model model){
        double valorRendimento = 0;
        List<Double> listaRendimento = new AulaDAO().getPrice();
        for(int i = 0; i <= listaRendimento.size() - 1; i++ ){
            valorRendimento += listaRendimento.get(i);
        }
        
        model.addAttribute("rendimentoSemanal", valorRendimento);
        return "administrador";
    }
}
