package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ATENDIMENTO")
public class Atendimento implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ATENDIMENTO_ID")
    private long id;
    
    private long ATENDIMENTO_ID;
    private long AGENDAMENTO_ID;
    private String FEEDBACK;
    private long STATUS;
    private String DT_HORA_CHEGADA;
    private long DURACAO;
    private double VALOR_FINAL;

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
     * @return long return the AGENDAMENTO_ID
     */
    public long getAGENDAMENTO_ID() {
        return AGENDAMENTO_ID;
    }

    /**
     * @param AGENDAMENTO_ID the AGENDAMENTO_ID to set
     */
    public void setAGENDAMENTO_ID(long AGENDAMENTO_ID) {
        this.AGENDAMENTO_ID = AGENDAMENTO_ID;
    }

    /**
     * @return String return the FEEDBACK
     */
    public String getFEEDBACK() {
        return FEEDBACK;
    }

    /**
     * @param FEEDBACK the FEEDBACK to set
     */
    public void setFEEDBACK(String FEEDBACK) {
        this.FEEDBACK = FEEDBACK;
    }

    /**
     * @return long return the STATUS
     */
    public long getSTATUS() {
        return STATUS;
    }

    /**
     * @param STATUS the STATUS to set
     */
    public void setSTATUS(long STATUS) {
        this.STATUS = STATUS;
    }

    /**
     * @return String return the DT_HORA_CHEGADA
     */
    public String getDT_HORA_CHEGADA() {
        return DT_HORA_CHEGADA;
    }

    /**
     * @param DT_HORA_CHEGADA the DT_HORA_CHEGADA to set
     */
    public void setDT_HORA_CHEGADA(String DT_HORA_CHEGADA) {
        this.DT_HORA_CHEGADA = DT_HORA_CHEGADA;
    }

    /**
     * @return long return the DURACAO
     */
    public long getDURACAO() {
        return DURACAO;
    }

    /**
     * @param DURACAO the DURACAO to set
     */
    public void setDURACAO(long DURACAO) {
        this.DURACAO = DURACAO;
    }

    /**
     * @return double return the VALOR_FINAL
     */
    public double getVALOR_FINAL() {
        return VALOR_FINAL;
    }

    /**
     * @param VALOR_FINAL the VALOR_FINAL to set
     */
    public void setVALOR_FINAL(double VALOR_FINAL) {
        this.VALOR_FINAL = VALOR_FINAL;
    }

}