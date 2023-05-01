package com.br.fluencynow.service;

import com.br.fluencynow.model.Plano;
import java.sql.SQLException;

public class PlanoService {


    public boolean SalvarPlano(Plano plano) throws SQLException {
        boolean criarPlano = com.br.fluencynow.dao.PlanoDAO.salvar(plano);
        return criarPlano;
    }
}
