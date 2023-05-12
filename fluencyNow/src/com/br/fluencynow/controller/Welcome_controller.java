package com.br.fluencynow.controller;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

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
		@RequestMapping("/teste")
		public ModelAndView teste() {

			return new ModelAndView("teste");
	}
}