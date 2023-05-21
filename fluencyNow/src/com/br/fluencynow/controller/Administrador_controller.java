package com.br.fluencynow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Administrador_controller {

    /**
     * View da página de Administrador
     * */
    @RequestMapping(value = "/administrador", method = RequestMethod.GET)
    public String getUsers(Model model) throws Exception{

        new com.br.fluencynow.service.AulaService().getAluno(model);
        new com.br.fluencynow.service.PlanoService().getPlano(model);
        new com.br.fluencynow.service.AulaService().getAulaEAluno(model);
        new com.br.fluencynow.service.AlunoService().quantidadeAluno(model);
        new com.br.fluencynow.service.AlunoService().aulasDisponiveis(model);
        new com.br.fluencynow.service.AlunoService().horasMinistradas(model);
        new com.br.fluencynow.service.AulaService().getRendimento(model);

        return "administrador";
    }
}
