package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteNotFoundException;
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
		model.addAttribute("cliente", new Cliente());
		return "cliente_form";
	}

	@PostMapping("/clientes/save")
	public String saveCliente(Cliente cliente, RedirectAttributes ra) {
		service.save(cliente);
		ra.addFlashAttribute("message", "O cliente foi adicionado com sucesso!");
		return "redirect:/clientes";

	}

	@GetMapping("/clientes/edit/{id}")
	public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {

		try {
			Cliente cliente = service.get(id);
			model.addAttribute("cliente", cliente);
			return "clinte_form";
		} catch (ClienteNotFoundException e) {
			ra.addFlashAttribute("message", "O cliente foi adicionado com sucesso!");
			e.printStackTrace();
			return "redirect:/clientes";
		}

	}

}
