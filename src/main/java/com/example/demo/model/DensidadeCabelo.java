package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DENSIDADE_CABELO")
public class DensidadeCabelo {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private long DES_CABELO_ID;
    private String DENSIDADE_CABELO;

    /**
     * @return long return the DES_CABELO_ID
     */
    public long getDES_CABELO_ID() {
        return DES_CABELO_ID;
    }

    /**
     * @param DES_CABELO_ID the DES_CABELO_ID to set
     */
    public void setDES_CABELO_ID(long DES_CABELO_ID) {
        this.DES_CABELO_ID = DES_CABELO_ID;
    }

    /**
     * @return String return the DENSIDADE_CABELO
     */
    public String getDENSIDADE_CABELO() {
        return DENSIDADE_CABELO;
    }

    /**
     * @param DENSIDADE_CABELO the DENSIDADE_CABELO to set
     */
    public void setDENSIDADE_CABELO(String DENSIDADE_CABELO) {
        this.DENSIDADE_CABELO = DENSIDADE_CABELO;
    }

}