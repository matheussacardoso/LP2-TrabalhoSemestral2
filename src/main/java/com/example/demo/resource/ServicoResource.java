package com.example.demo.resource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Servico;
import com.example.demo.repository.ServicoRepository;

@RestController
@RequestMapping(value="/Salao")
public class ServicoResource {
	
	@Autowired
	ServicoRepository ServicoRepository;

	@GetMapping("/Servicos")
	public List<Servico> listServicos(){
		return ServicoRepository.findAll();
	}
	
	@GetMapping("/Servicos/{id}")
	public Servico listaServico(@PathVariable(value="id") long id){
		return ServicoRepository.findById(id);
	}
	
	@PostMapping("/Servico")
	public Servico salvarServico(@RequestBody Servico Servico) {
		return ServicoRepository.save(Servico);
	}
}