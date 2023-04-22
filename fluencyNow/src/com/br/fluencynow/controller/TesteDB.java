//package com.br.fluencynow.controller;
//
//import com.br.fluencynow.dao.AlunoDAO;
//import com.br.fluencynow.model.Aluno;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.Date;
//
//@Controller
//public class TesteDB {
////    @RequestMapping("/testDB")
////    public ModelAndView teste() {
////        /*Aluno aluno = new Aluno();
////
////        aluno.setNome("Teste Nome Aluno");
////        aluno.setCpf("21343212323");
////        aluno.setDataNascimento(new Date());
////        aluno.setEmail("teste@teste.com");
////        aluno.setCelular("11940028922");
////        aluno.setCep("05423432");
////        aluno.setEndereco("Rua teste");
////        aluno.setNumero("65");
////
////        try {
////            AlunoDAO.salvar(aluno);
////        } catch (SQLException e) {
////            throw new RuntimeException(e);
////        }*/
////
////        return new ModelAndView("testDB");
////    }
//
//    @RequestMapping("/testeBancodeDados")
//    public ModelAndView testeDB(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String nomeAluno = req.getParameter("nome");
//        String cpfAluno = req.getParameter("cpf");
//        String dataNascimentoAluno = req.getParameter("dataNascimento");
//        String emailAluno = req.getParameter("email");
//        String celularAluno = req.getParameter("celular");
//        String cepAluno = req.getParameter("cep");
//        String enderecoAluno = req.getParameter("aluno");
//        String numeroAluno = req.getParameter("numero");
//
//
//        try {
//            boolean salvar = AlunoDAO.saveStudent(new Aluno(nomeAluno, cpfAluno, dataNascimentoAluno, enderecoAluno, cepAluno, numeroAluno, celularAluno, emailAluno));
//            if(salvar){
//                System.out.println("Salvo com sucesso");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return new ModelAndView("testDB");
//    }
//}
