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
<<<<<<< HEAD:fluencyNow/src/com/br/fluencynow/controller/Fluency_now_controller.java
		@RequestMapping("/teste")
		public ModelAndView teste() {

			return new ModelAndView("teste");
	}

	@RequestMapping("/testeBancodeDados")
	public ModelAndView testeDB(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nomeAluno = req.getParameter("nome");
		String cpfAluno = req.getParameter("cpf");
//        Date dataNascimentoAluno = req.getParameter("dataNascimento").;
		String emailAluno = req.getParameter("email");
		String celularAluno = req.getParameter("celular");
		String cepAluno = req.getParameter("cep");
		String enderecoAluno = req.getParameter("aluno");
		String numeroAluno = req.getParameter("numero");


		try {
			boolean salvar = AlunoDAO.salvar(new Aluno(nomeAluno, cpfAluno, new Date("2009-06-31"), enderecoAluno, cepAluno, numeroAluno, celularAluno, emailAluno));
			if(salvar){
				System.out.println("Salvo com sucesso");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return new ModelAndView("testDB");
	}
=======
>>>>>>> 04a5adf02395e56b62e6f1c58b5b22981d629692:fluencyNow/src/com/br/fluencynow/controller/Welcome_controller.java
}