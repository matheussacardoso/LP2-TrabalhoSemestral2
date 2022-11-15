package com.example.demo.resource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Atendimento;
import com.example.demo.repository.AtendimentoRepository;

@RestController
@RequestMapping(value="/Salao")
public class AtendimentoResource {
	
	@Autowired
	AtendimentoRepository AtendimentoRepository;

	@GetMapping("/Atendimentos")
	public List<Atendimento> listAtendimentos(){
		return AtendimentoRepository.findAll();
	}
	
	@GetMapping("/Atendimentos/{id}")
	public Atendimento listaAtendimento(@PathVariable(value="id") long id){
		return AtendimentoRepository.findById(id);
	}
	
	@PostMapping("/Atendimento")
	public Atendimento salvarAtendimento(@RequestBody Atendimento Atendimento) {
		return AtendimentoRepository.save(Atendimento);
	}
}