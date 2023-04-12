package com.br.fluencynow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Fluency.com
 * 
 */
@Controller
public class Welcome_controller {
	@RequestMapping("/home")
	public ModelAndView home() {

		return new ModelAndView("home");
	}
}