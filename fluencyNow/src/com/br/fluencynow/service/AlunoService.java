package com.br.fluencynow.service;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Aluno;

import java.sql.SQLException;

public class AlunoService {

    public boolean SalvarAluno(AlunoDTO aluno) throws SQLException {

        if(new com.br.fluencynow.validadores.ValidaCPF().validarCPF(aluno.cpf) == false){
            throw new IllegalArgumentException("CPF Invalido!");
        }
        if(new com.br.fluencynow.validadores.ValidaEmail().emailValidator(aluno.email) == false){
            throw new IllegalArgumentException("Email Invalido!");
        }
        boolean criarAluno = new com.br.fluencynow.dao.AlunoDAO().saveStudent(aluno);

        return criarAluno;
    }

    public boolean DeletarAluno(String cpf) throws SQLException {

        Aluno aluno = new com.br.fluencynow.dao.AlunoDAO().searchIdStudentByCpf(cpf);

        if(aluno.id != 0){
            new com.br.fluencynow.dao.AulaDAO().deleteClass(aluno.id);
            new com.br.fluencynow.dao.AlunoDAO().deleteStudent(cpf);
            return true;
        }

        return false;
    }
}
