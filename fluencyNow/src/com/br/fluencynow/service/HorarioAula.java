package com.br.fluencynow.service;

public enum HorarioAula {
    Aula_08h00("08h00"),
    Aula_09h15("09h15"),
    Aula_10h30("10h30"),
    Aula_11h45("11h45"),
    Aula_14h00("14h00"),
    Aula_15h15("15h15"),
    Aula_16h30("16h30"),
    Aula_17h45("17h45"),
    Aula_18h00("18h00");

    private final String hora;

    HorarioAula(String hora) {
        this.hora = hora;
    }

    public String getHora(){
        return hora;
    }
}
