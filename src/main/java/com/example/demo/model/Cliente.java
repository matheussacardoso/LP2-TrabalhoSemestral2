package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cliente_id;
	@Column
	private String nome;
	private LocalDate dt_nascimento;
	private String instagram;
	private String profissao;

	/*
	 * @Column(name="ESP_CABELO_ID") private long espCabeloId;
	 * 
	 * @Column(name="DES_CABELO_ID") private long desCabeloId;
	 * 
	 * @Column(name="TIPO_CABELO_ID") private long tipoCabeloId;
	 * 
	 * @Column(name="TAM_CABELO_ID") private long tamCabeloId;
	 * 
	 * @Column(name="ELAS_CABELO_ID") private long elasCabeloId;
	 */

	@OneToMany(mappedBy = "cliente")
	private List<Agendamento> agendamento;

	/*
	 * //OLHAR SOBRE A NECESSIDADE DOS CONSTRUTORES
	 * 
	 * @Deprecated public Cliente() { }
	 * 
	 * public Cliente(String nome, String dt_nascimento, String instagram, String
	 * profissao) { this.nome = nome; this.dt_nascimento = dt_nascimento;
	 * this.instagram = instagram; this.profissao = profissao; }
	 */

	public Long getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Long cliente_id) {
		this.cliente_id = cliente_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(LocalDate dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
