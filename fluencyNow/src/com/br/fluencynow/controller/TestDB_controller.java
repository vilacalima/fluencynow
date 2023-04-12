package com.br.fluencynow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestDB_controller {

    @RequestMapping("/testDB")
    public ModelAndView testDB() {

        return new ModelAndView("testDB");
    }

}
