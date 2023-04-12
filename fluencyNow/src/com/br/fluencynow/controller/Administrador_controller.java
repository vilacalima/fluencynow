package com.br.fluencynow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Administrador_controller {

    @RequestMapping("/administrador")
    public ModelAndView administrador() {

        return new ModelAndView("administrador");
    }

}
