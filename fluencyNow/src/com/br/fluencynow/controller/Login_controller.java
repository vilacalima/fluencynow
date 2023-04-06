package com.br.fluencynow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login_controller {

    @RequestMapping("/login")
    public ModelAndView login() {

        return new ModelAndView("login");
    }

}
