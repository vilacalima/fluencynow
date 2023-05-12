package com.br.fluencynow.service;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Aluno;
import org.springframework.ui.Model;

import java.sql.SQLException;
import java.util.List;

public class AlunoService {

    /**
     * Salva aluno no banco de dados
     * @param aluno AlunoDTO
     * */
    public boolean SalvarAluno(AlunoDTO aluno) throws SQLException {

        /*if(new com.br.fluencynow.validadores.ValidaCPF().validarCPF(aluno.cpf) == false){
            throw new IllegalArgumentException("CPF Invalido!");

        if(new com.br.fluencynow.validadores.ValidaEmail().emailValidator(aluno.email) == false){
            throw new IllegalArgumentException("Email Invalido!");
        }
        */

        boolean criarAluno = new com.br.fluencynow.dao.AlunoDAO().saveStudent(aluno);

        return criarAluno;
    }

    public String getAluno(Model model) throws SQLException{
        List<Aluno> alunos = new AlunoDAO().getStudent();
        Aluno.Lista_container alunoList = new Aluno.Lista_container();
        alunoList.setAlunos(alunos);
        model.addAttribute("Alunos", alunoList);

        return "cadastrarAluno";
    }
    /**
     * Deleta um aluno do banco de dados
     * Deleta uma aula do banco de dados
     * @param cpf String
     * */
    public boolean DeletarAluno(String cpf) throws SQLException {

        Aluno aluno = new com.br.fluencynow.dao.AlunoDAO().searchIdStudentByCpf(cpf);

        if(aluno.id != 0){
            new com.br.fluencynow.dao.AulaDAO().deleteClass(aluno.id);
            new com.br.fluencynow.dao.AlunoDAO().deleteStudent(cpf);
            return true;
        }

        return false;
    }


    /**
     * Pega a quantidade de alunos no banco de dados e mostra na view
     * @param model Model
     * */
    public String quantidadeAluno(Model model) throws SQLException {

        int quantidade = AlunoDAO.getStudentCount();
        model.addAttribute("quantidadeAluno", quantidade);
        return "administrador";
    }

    /**
     * Retorna a quantidade de aulas na view
     * @param model Model
     * */
    public String aulasDisponiveis(Model model) throws SQLException {
        int totalAulas = 45; //Multiplicação das horas disponiveis pelos dias de aula
        int quantidade = AlunoDAO.getStudentCount();
        int disponiveis = totalAulas - quantidade;

        model.addAttribute("aulasDisponiveis", disponiveis);
        return "administrador";
    }

    /**
     * Retorna a quantidade de horasMinistradas na view
     * @param model Model
     * */
    public String horasMinistradas(Model model) throws SQLException {
        int horaAula = 0; //Hora Aula
        int quantidade = AlunoDAO.getStudentCount();

        for(int i = 1; i <= quantidade; i++){
            horaAula += 45;
        }

        model.addAttribute("horasMinistradas", horaAula);
        return "administrador";
    }
}
