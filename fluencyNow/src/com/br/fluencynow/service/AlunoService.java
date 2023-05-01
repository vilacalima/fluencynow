package com.br.fluencynow.service;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Aluno;

import java.sql.SQLException;

public class AlunoService {

    public boolean SalvarAluno(AlunoDTO aluno) throws SQLException {

//        if(new com.br.fluencynow.validadores.ValidaCPF().validarCPF(aluno.getCpf()) == false){
//            throw new IllegalArgumentException("CPF Invalido!");
//        }
        boolean criarAluno = new com.br.fluencynow.dao.AlunoDAO().saveStudent(aluno);

        return criarAluno;
    }
}
