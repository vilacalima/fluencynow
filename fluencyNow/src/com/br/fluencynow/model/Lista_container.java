package com.br.fluencynow.model;

import java.util.List;

public class Lista_container extends Aluno{

    private List<Aluno> alunos;
    public List<Aluno> getAlunos(){

    return alunos;
    }

    public void setAlunos(List<Aluno>alunos){
        this.alunos = alunos;
    }
}
