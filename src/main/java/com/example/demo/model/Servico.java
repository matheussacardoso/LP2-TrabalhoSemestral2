package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SERVICO")
public class Servico implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="SERVICO_ID")
    private long id;
    
    private long ATENDIMENTO_ID;
    private long PROFISSIONAL_ID;
    private long PROCEDIMENTO_ID;
    private double VALOR_SERVICO;
    private double COMISSAO;


    

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
     * @return long return the ATENDIMENTO_ID
     */
    public long getATENDIMENTO_ID() {
        return ATENDIMENTO_ID;
    }

    /**
     * @param ATENDIMENTO_ID the ATENDIMENTO_ID to set
     */
    public void setATENDIMENTO_ID(long ATENDIMENTO_ID) {
        this.ATENDIMENTO_ID = ATENDIMENTO_ID;
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
     * @return long return the PROCEDIMENTO_ID
     */
    public long getPROCEDIMENTO_ID() {
        return PROCEDIMENTO_ID;
    }

    /**
     * @param PROCEDIMENTO_ID the PROCEDIMENTO_ID to set
     */
    public void setPROCEDIMENTO_ID(long PROCEDIMENTO_ID) {
        this.PROCEDIMENTO_ID = PROCEDIMENTO_ID;
    }

    /**
     * @return double return the VALOR_SERVICO
     */
    public double getVALOR_SERVICO() {
        return VALOR_SERVICO;
    }

    /**
     * @param VALOR_SERVICO the VALOR_SERVICO to set
     */
    public void setVALOR_SERVICO(double VALOR_SERVICO) {
        this.VALOR_SERVICO = VALOR_SERVICO;
    }

    /**
     * @return double return the COMISSAO
     */
    public double getCOMISSAO() {
        return COMISSAO;
    }

    /**
     * @param COMISSAO the COMISSAO to set
     */
    public void setCOMISSAO(double COMISSAO) {
        this.COMISSAO = COMISSAO;
    }

}