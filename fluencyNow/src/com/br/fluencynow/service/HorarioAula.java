package com.br.fluencynow.service;

/**
 * Enum para cadastro de hora da aula
 * */
public enum HorarioAula {
    Aula_08h00("08h00"),
    Aula_09h00("09h00"),
    Aula_10h00("10h00"),
    Aula_11h00("11h00"),
    Aula_12h00("12h00"),
    Aula_13h00("13h00"),
    Aula_15h00("15h00"),
    Aula_16h00("16h00"),
    Aula_17h00("17h00");

    private final String hora;

    HorarioAula(String hora) {
        this.hora = hora;
    }

    public String getHora(){
        return hora;
    }
}
