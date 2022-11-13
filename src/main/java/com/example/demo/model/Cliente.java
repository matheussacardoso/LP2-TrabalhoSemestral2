package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CLIENTE_ID")
    private long id;

    
    @Column(name="ESP_CABELO_ID")
    private long espCabeloId;
    
    @Column(name="DES_CABELO_ID")
    private long desCabeloId;
    
    @Column(name="TIPO_CABELO_ID")
    private long tipoCabeloId;

    @Column(name="TAM_CABELO_ID")
    private long tamCabeloId;
    
    @Column(name="ELAS_CABELO_ID")
    private long elasCabeloId;    
    
    private String nome;
    
    private String DT_NASCIMENTO;
    private String INSTAGRAM;
    private String PROFISSAO;

    

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return long return the espCabeloId
     */
    public long getEspCabeloId() {
        return espCabeloId;
    }

    /**
     * @param espCabeloId the espCabeloId to set
     */
    public void setEspCabeloId(long espCabeloId) {
        this.espCabeloId = espCabeloId;
    }

    /**
     * @return long return the desCabeloId
     */
    public long getDesCabeloId() {
        return desCabeloId;
    }

    /**
     * @param desCabeloId the desCabeloId to set
     */
    public void setDesCabeloId(long desCabeloId) {
        this.desCabeloId = desCabeloId;
    }

    /**
     * @return long return the tipoCabeloId
     */
    public long getTipoCabeloId() {
        return tipoCabeloId;
    }

    /**
     * @param tipoCabeloId the tipoCabeloId to set
     */
    public void setTipoCabeloId(long tipoCabeloId) {
        this.tipoCabeloId = tipoCabeloId;
    }

    /**
     * @return long return the tamCabeloId
     */
    public long getTamCabeloId() {
        return tamCabeloId;
    }

    /**
     * @param tamCabeloId the tamCabeloId to set
     */
    public void setTamCabeloId(long tamCabeloId) {
        this.tamCabeloId = tamCabeloId;
    }

    /**
     * @return long return the elasCabeloId
     */
    public long getElasCabeloId() {
        return elasCabeloId;
    }

    /**
     * @param elasCabeloId the elasCabeloId to set
     */
    public void setElasCabeloId(long elasCabeloId) {
        this.elasCabeloId = elasCabeloId;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the DT_NASCIMENTO
     */
    public String getDT_NASCIMENTO() {
        return DT_NASCIMENTO;
    }

    /**
     * @param DT_NASCIMENTO the DT_NASCIMENTO to set
     */
    public void setDT_NASCIMENTO(String DT_NASCIMENTO) {
        this.DT_NASCIMENTO = DT_NASCIMENTO;
    }

    /**
     * @return String return the INSTAGRAM
     */
    public String getINSTAGRAM() {
        return INSTAGRAM;
    }

    /**
     * @param INSTAGRAM the INSTAGRAM to set
     */
    public void setINSTAGRAM(String INSTAGRAM) {
        this.INSTAGRAM = INSTAGRAM;
    }

    /**
     * @return String return the PROFISSAO
     */
    public String getPROFISSAO() {
        return PROFISSAO;
    }

    /**
     * @param PROFISSAO the PROFISSAO to set
     */
    public void setPROFISSAO(String PROFISSAO) {
        this.PROFISSAO = PROFISSAO;
    }

}
