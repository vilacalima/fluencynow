package com.br.fluencynow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Adicionar_controller {

    @RequestMapping("/adicionar")
    public ModelAndView adicionar() {

        return new ModelAndView("adicionar");
    }

}
