package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Agendamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long agendamento_id;
	private Date dt_marcada;
	private String aviso;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;

	@Deprecated
	public Agendamento() {
	}

	public Agendamento(Date dt_marcada, String aviso) {
		this.dt_marcada = dt_marcada;
		this.aviso = aviso;
	}

	public Date getDt_marcada() {
		return dt_marcada;
	}

	public void setDt_marcada(Date dt_marcada) {
		this.dt_marcada = dt_marcada;
	}

	public String getAviso() {
		return aviso;
	}

	public void setAviso(String aviso) {
		this.aviso = aviso;
	}

}
