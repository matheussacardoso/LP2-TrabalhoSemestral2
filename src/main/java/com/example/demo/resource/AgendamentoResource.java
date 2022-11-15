package com.example.demo.resource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Agendamento;
import com.example.demo.repository.AgendamentoRepository;

@RestController
@RequestMapping(value="/Salao")
public class AgendamentoResource {
	
	@Autowired
	AgendamentoRepository AgendamentoRepository;

	@GetMapping("/Agendamentos")
	public List<Agendamento> listAgendamentos(){
		return AgendamentoRepository.findAll();
	}
	
	@GetMapping("/Agendamentos/{id}")
	public Agendamento listaAgendamento(@PathVariable(value="id") long id){
		return AgendamentoRepository.findById(id);
	}
	
	@PostMapping("/Agendamento")
	public Agendamento salvarAgendamento(@RequestBody Agendamento Agendamento) {
		return AgendamentoRepository.save(Agendamento);
	}
}