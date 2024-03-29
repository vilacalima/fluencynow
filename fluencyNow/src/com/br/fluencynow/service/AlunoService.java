package com.br.fluencynow.service;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.dto.MensagemDTO;
import com.br.fluencynow.model.Aluno;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.SQLException;
import java.util.List;

public class AlunoService {

    /**
     * Salva aluno no banco de dados
     * @param aluno AlunoDTO
     * @param redirectAttributes
     * */
    public MensagemDTO SalvarAluno(AlunoDTO aluno, RedirectAttributes redirectAttributes) throws SQLException {

        MensagemDTO mensagem;
        if(new com.br.fluencynow.validator.ValidaCPF().validarCPF(aluno.cpf) == false) {
            mensagem = new MensagemDTO("O CPF é invalido.",false);
            return mensagem;
        }

        if(new com.br.fluencynow.validator.ValidaEmail().emailValidator(aluno.email) == false){
            mensagem = new MensagemDTO("O email é invalido.",false);
            return mensagem;
        }

        if(new com.br.fluencynow.dao.AlunoDAO().saveStudent(aluno)){
            mensagem = new MensagemDTO("Aluno inserido com Sucesso",true);
            return mensagem;
        } else{
            mensagem = new MensagemDTO("Houve algum erro desconhecido ao salvar aluno.",false);
            return mensagem;
        }
    }

    /**
     * Atualiza aluno no banco de dados
     * @param aluno AlunoDTO
     * @param redirectAttributes
     * */
    public MensagemDTO UpdateAluno(AlunoDTO aluno, RedirectAttributes redirectAttributes) throws SQLException {

        MensagemDTO mensagem;
        if(new com.br.fluencynow.validator.ValidaCPF().validarCPF(aluno.cpf) == false) {
            mensagem = new MensagemDTO("O CPF é invalido.",false);
            return mensagem;
        }

        if(new com.br.fluencynow.validator.ValidaEmail().emailValidator(aluno.email) == false){
            mensagem = new MensagemDTO("O email é invalido.",false);
            return mensagem;
        }

        if(new com.br.fluencynow.dao.AlunoDAO().updateStudent(aluno)){
            mensagem = new MensagemDTO("Cadastro do Aluno atualizado com Sucesso",true);
            return mensagem;
        } else{
            mensagem = new MensagemDTO("Houve algum erro desconhecido ao salvar aluno.",false);
            return mensagem;
        }
    }

    /**
     * Pega Lista de Alunos no banco de dados
     * */
    public String getAluno(Model model) throws SQLException{
        List<AlunoDTO> alunos = new AlunoDAO().getStudent();
        AlunoDTO.Lista_container alunoList = new AlunoDTO.Lista_container();
        alunoList.setAlunos(alunos);
        model.addAttribute("Alunos", alunoList);

        return "cadastrarAluno";
    }

    /**
     * Deleta um aluno do banco de dados
     * @param cpf String
     * */
    public MensagemDTO DeletarAluno(String cpf, RedirectAttributes redirectAttributes) throws SQLException {

        Aluno aluno = new com.br.fluencynow.dao.AlunoDAO().searchIdStudentByCpf(cpf);

        MensagemDTO mensagem;
        if(aluno.id != 0){
            new com.br.fluencynow.dao.AulaDAO().deleteClass(aluno.id);
            new com.br.fluencynow.dao.AlunoDAO().deleteStudent(cpf);

            return mensagem = new MensagemDTO("Aluno Deletado com Sucesso",true);
        } else{
            return mensagem = new MensagemDTO("Houve um erro ao deletar o aluno",false);
        }
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
