package com.example.demo.resource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Profissional;
import com.example.demo.repository.ProfissionalRepository;

@RestController
@RequestMapping(value="/Salao")
public class ProfissionalResource {
	
	@Autowired
	ProfissionalRepository ProfissionalRepository;

	@GetMapping("/Profissionals")
	public List<Profissional> listProfissionals(){
		return ProfissionalRepository.findAll();
	}
	
	@GetMapping("/Profissionals/{id}")
	public Profissional listaProfissional(@PathVariable(value="id") long id){
		return ProfissionalRepository.findById(id);
	}
	
	@PostMapping("/Profissional")
	public Profissional salvarProfissional(@RequestBody Profissional Profissional) {
		return ProfissionalRepository.save(Profissional);
	}
}