package com.example.demo.resource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Funcionario;
import com.example.demo.repository.FuncionarioRepository;

@RestController
@RequestMapping(value="/Salao")
public class FuncionarioResource {
	
	@Autowired
	FuncionarioRepository FuncionarioRepository;

	@GetMapping("/Funcionarios")
	public List<Funcionario> listFuncionarios(){
		return FuncionarioRepository.findAll();
	}
	
	@GetMapping("/Funcionarios/{id}")
	public Funcionario listaFuncionario(@PathVariable(value="id") long id){
		return FuncionarioRepository.findById(id);
	}
	
	@PostMapping("/Funcionario")
	public Funcionario salvarFuncionario(@RequestBody Funcionario Funcionario) {
		return FuncionarioRepository.save(Funcionario);
	}
}