package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AGENDAMENTO")
public class Agendamento implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="AGENDAMENTO_ID")
    private long id;

    
    private long CLIENTE_ID;
    private long FUNCIONARIO_ID;
    private String DT_MARCADA;
    private String AVISO;
    


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
     * @return long return the CLIENTE_ID
     */
    public long getCLIENTE_ID() {
        return CLIENTE_ID;
    }

    /**
     * @param CLIENTE_ID the CLIENTE_ID to set
     */
    public void setCLIENTE_ID(long CLIENTE_ID) {
        this.CLIENTE_ID = CLIENTE_ID;
    }

    /**
     * @return long return the FUNCIONARIO_ID
     */
    public long getFUNCIONARIO_ID() {
        return FUNCIONARIO_ID;
    }

    /**
     * @param FUNCIONARIO_ID the FUNCIONARIO_ID to set
     */
    public void setFUNCIONARIO_ID(long FUNCIONARIO_ID) {
        this.FUNCIONARIO_ID = FUNCIONARIO_ID;
    }

    /**
     * @return String return the DT_MARCADA
     */
    public String getDT_MARCADA() {
        return DT_MARCADA;
    }

    /**
     * @param DT_MARCADA the DT_MARCADA to set
     */
    public void setDT_MARCADA(String DT_MARCADA) {
        this.DT_MARCADA = DT_MARCADA;
    }

    /**
     * @return String return the AVISO
     */
    public String getAVISO() {
        return AVISO;
    }

    /**
     * @param AVISO the AVISO to set
     */
    public void setAVISO(String AVISO) {
        this.AVISO = AVISO;
    }

}
