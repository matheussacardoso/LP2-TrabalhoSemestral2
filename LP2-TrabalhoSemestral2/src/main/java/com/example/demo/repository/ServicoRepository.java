package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long>{
	
	Servico findById(long id);
}
