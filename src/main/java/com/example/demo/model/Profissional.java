package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROFISSIONAL")
public class Profissional implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PROFISSIONAL_ID")
    private long id;
    
    private long PROFISSIONAL_ID;
    private String NOME;
    private String DT_NASCIMENTO;
    private String CPF;

    


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
     * @return long return the PROFISSIONAL_ID
     */
    public long getPROFISSIONAL_ID() {
        return PROFISSIONAL_ID;
    }

    /**
     * @param PROFISSIONAL_ID the PROFISSIONAL_ID to set
     */
    public void setPROFISSIONAL_ID(long PROFISSIONAL_ID) {
        this.PROFISSIONAL_ID = PROFISSIONAL_ID;
    }

    /**
     * @return String return the NOME
     */
    public String getNOME() {
        return NOME;
    }

    /**
     * @param NOME the NOME to set
     */
    public void setNOME(String NOME) {
        this.NOME = NOME;
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
     * @return String return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}