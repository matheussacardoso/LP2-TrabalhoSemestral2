package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	    // quando o usuario digitar essa requisicao, 
	    // ele vai redirecionado para pagina index.html
	    @RequestMapping("/login")
	    public String login() {
	        return "login";
	}
}
