package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FUNCIONARIO")
public class Funcionario implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="FUNCIONARIO_ID")
    private long id;
    
    private long FUNCIONARIO_ID;
    private String NOME;
    private String DT_NASCIMENTO;
    private String CPF;
    private String SENHA;
    


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

    /**
     * @return String return the SENHA
     */
    public String getSENHA() {
        return SENHA;
    }

    /**
     * @param SENHA the SENHA to set
     */
    public void setSENHA(String SENHA) {
        this.SENHA = SENHA;
    }

}