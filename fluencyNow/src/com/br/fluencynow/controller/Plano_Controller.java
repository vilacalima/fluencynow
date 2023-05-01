package com.br.fluencynow.controller;

import com.br.fluencynow.dao.PlanoDAO;
import com.br.fluencynow.model.Plano;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

public class Plano_Controller {

    @RequestMapping("/plano")
    public ModelAndView plano() {
        return new ModelAndView("cadastrarPlano");
    }

    @RequestMapping("/cadastrarPlanos")
    public String adicionaPlano(Plano plano, HttpSession session) throws SQLException {
        try{

            //continuar daqui esta retornando apenas a exception
            boolean salvarAluno = new com.br.fluencynow.service.PlanoService().SalvarPlano(plano);
            if(salvarAluno == true){
                session.setAttribute("planoCadastrado", plano);
                return "redirect:administrador";
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return "redirect:home";
    }

//    @RequestMapping(value = "/cadastrarPlano", method = RequestMethod.GET)
//    public String getPlano(Model model) throws Exception{
//
//        List<Plano> planos = new PlanoDAO().getPlano();
//        Plano.Lista_container planoList = new Plano.Lista_container();
//        planoList.setPlanos(planos);
//        model.addAttribute("Planos", planoList);
//        return "administrador";
//    }
}
