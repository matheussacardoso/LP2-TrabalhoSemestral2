package com.example.demo.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Fornecedor;

@Controller
public class FornecedorController {
    
    @RequestMapping(value = "/fornecedor", method = RequestMethod.GET)
    public ModelAndView fornecedor(){
        return new ModelAndView("fornecedor", "command", new Fornecedor());
    }



    @RequestMapping(value = "/listaFornecedor", method = RequestMethod.GET)
    public String listarFornecedores(
        @ModelAttribute("SpringWeb") ModelMap model, HttpServletRequest request
        ) {

    List<Fornecedor> fornecedores = (List<Fornecedor>)
    request.getAttribute("fornecedores");

    model.addAttribute("fornecedores", fornecedores);


    return "listaFornecedores";
   }
}