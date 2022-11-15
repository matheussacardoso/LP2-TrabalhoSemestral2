package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROCEDIMENTO")
public class Procedimento implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PROCEDIMENTO_ID")
    private long id;
    
    private String TIPO_PROCEDIMENTO;
    private String DETALHE_PROCEDIMENTO;
    private double COMISSAO_PER;
    private long DESCANSO;

    

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
     * @return String return the TIPO_PROCEDIMENTO
     */
    public String getTIPO_PROCEDIMENTO() {
        return TIPO_PROCEDIMENTO;
    }

    /**
     * @param TIPO_PROCEDIMENTO the TIPO_PROCEDIMENTO to set
     */
    public void setTIPO_PROCEDIMENTO(String TIPO_PROCEDIMENTO) {
        this.TIPO_PROCEDIMENTO = TIPO_PROCEDIMENTO;
    }

    /**
     * @return String return the DETALHE_PROCEDIMENTO
     */
    public String getDETALHE_PROCEDIMENTO() {
        return DETALHE_PROCEDIMENTO;
    }

    /**
     * @param DETALHE_PROCEDIMENTO the DETALHE_PROCEDIMENTO to set
     */
    public void setDETALHE_PROCEDIMENTO(String DETALHE_PROCEDIMENTO) {
        this.DETALHE_PROCEDIMENTO = DETALHE_PROCEDIMENTO;
    }

    /**
     * @return double return the COMISSAO_PER
     */
    public double getCOMISSAO_PER() {
        return COMISSAO_PER;
    }

    /**
     * @param COMISSAO_PER the COMISSAO_PER to set
     */
    public void setCOMISSAO_PER(double COMISSAO_PER) {
        this.COMISSAO_PER = COMISSAO_PER;
    }

    /**
     * @return long return the DESCANSO
     */
    public long getDESCANSO() {
        return DESCANSO;
    }

    /**
     * @param DESCANSO the DESCANSO to set
     */
    public void setDESCANSO(long DESCANSO) {
        this.DESCANSO = DESCANSO;
    }

}