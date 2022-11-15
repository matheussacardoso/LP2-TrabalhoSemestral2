package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMAIL")
public class Email implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="EMAIL_ID")
    private long id;
    
    private String EMAIL;

    /**
     * @return long return the EMAIL_ID
     */
    public long getEMAIL_ID() {
        return id;
    }

    /**
     * @param EMAIL_ID the EMAIL_ID to set
     */
    public void setEMAIL_ID(long EMAIL_ID) {
        this.id = EMAIL_ID;
    }

    /**
     * @return String return the EMAIL
     */
    public String getEMAIL() {
        return EMAIL;
    }

    /**
     * @param EMAIL the EMAIL to set
     */
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

}