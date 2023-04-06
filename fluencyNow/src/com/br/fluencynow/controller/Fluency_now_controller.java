package com.br.fluencynow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Fluency.com
 * 
 */
@Controller
public class Fluency_now_controller {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "<br>"
				+ "<div style='text-align:center;'>"
				+ "<h3>Welcome to  Fluency now"
				+ "</h3>This message is coming from Fluency_now_controller.java"
				+ "</div>"
				+ "<br>"
				+ "<br>";
		return new ModelAndView("welcome", "message", message);
	}
		@RequestMapping("/teste")
		public ModelAndView teste() {

			return new ModelAndView("teste");
	}
	@RequestMapping("/adicionar")
	public ModelAndView adicionar() {

		return new ModelAndView("adicionar");
	}
	@RequestMapping("/administrador")
	public ModelAndView administrador() {

		return new ModelAndView("administrador");
	}
	@RequestMapping("/login")
	public ModelAndView login() {

		return new ModelAndView("login");
	}

}