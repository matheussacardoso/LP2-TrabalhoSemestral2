package com.example.demo.resource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Email;
import com.example.demo.repository.EmailRepository;

@RestController
@RequestMapping(value="/Salao")
public class EmailResource {
	
	@Autowired
	EmailRepository EmailRepository;

	@GetMapping("/Emails")
	public List<Email> listEmails(){
		return EmailRepository.findAll();
	}
	
	@GetMapping("/Emails/{id}")
	public Email listaEmail(@PathVariable(value="id") long id){
		return EmailRepository.findById(id);
	}
	
	@PostMapping("/Email")
	public Email salvarEmail(@RequestBody Email Email) {
		return EmailRepository.save(Email);
	}
}