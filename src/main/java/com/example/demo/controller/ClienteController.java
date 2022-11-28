package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;

@Controller
public class ClienteController {
	@Autowired
	private ClienteService service;

	@GetMapping("/clientes")
	public String showClienteList(Model model) {
		List<Cliente> listClientes = service.listAll();
		model.addAttribute("listClientes", listClientes);
		return "clientes";
	}
	
	@GetMapping("/clientes/new")
	public String showNewForm(Model model) {
		model.addAttribute("cliente",new Cliente());
		return "cliente_form";
	}
	

}
