package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long>{
	
	Profissional findById(long id);
}
