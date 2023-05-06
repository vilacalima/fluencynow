package com.br.fluencynow.dto;

import java.util.List;

public class DiaAula {

    public DiaAula() {
    }

    public DiaAula(String horario, String segunda, String terca, String quarta, String quinta, String sexta) {
        this.horario = horario;
        this.segunda = segunda;
        this.terca = terca;
        this.quarta = quarta;
        this.quinta = quinta;
        this.sexta = sexta;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSegunda() {
        return segunda;
    }

    public void setSegunda(String segunda) {
        this.segunda = segunda;
    }

    public String getTerca() {
        return terca;
    }

    public void setTerca(String terca) {
        this.terca = terca;
    }

    public String getQuarta() {
        return quarta;
    }

    public void setQuarta(String quarta) {
        this.quarta = quarta;
    }

    public String getQuinta() {
        return quinta;
    }

    public void setQuinta(String quinta) {
        this.quinta = quinta;
    }

    public String getSexta() {
        return sexta;
    }

    public void setSexta(String sexta) {
        this.sexta = sexta;
    }

    public String horario;
    public String segunda;
    public String terca;
    public String quarta;
    public String quinta;
    public String sexta;


    public static class Lista_container {

        private List<DiaAula> diaAula;
        public List<DiaAula> getDiaAula(){

            return diaAula;
        }

        public void setDiaAula(List<DiaAula>diaAula){
            this.diaAula = diaAula;
        }
    }
}
