package com.example.demo.resource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Procedimento;
import com.example.demo.repository.ProcedimentoRepository;

@RestController
@RequestMapping(value="/Salao")
public class ProcedimentoResource {
	
	@Autowired
	ProcedimentoRepository ProcedimentoRepository;

	@GetMapping("/Procedimentos")
	public List<Procedimento> listProcedimentos(){
		return ProcedimentoRepository.findAll();
	}
	
	@GetMapping("/Procedimentos/{id}")
	public Procedimento listaProcedimento(@PathVariable(value="id") long id){
		return ProcedimentoRepository.findById(id);
	}
	
	@PostMapping("/Procedimento")
	public Procedimento salvarProcedimento(@RequestBody Procedimento Procedimento) {
		return ProcedimentoRepository.save(Procedimento);
	}
}