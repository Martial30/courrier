package com.example.courrier.model;

import jakarta.persistence.*;

@Entity
@Table(name = "{admin}")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_admin;
    private String  email_admin;
    private  String mdp_admin;

    public Admin() {
    }

    public Admin(Integer id_admin, String email_admin, String mdp_admin) {
        this.id_admin = id_admin;
        this.email_admin = email_admin;
        this.mdp_admin = mdp_admin;
    }

    public Integer getId_admin() {
        return id_admin;
    }

    public void setId_admin(Integer id_admin) {
        this.id_admin = id_admin;
    }

    public String getEmail_admin() {
        return email_admin;
    }

    public void setEmail_admin(String email_admin) {
        this.email_admin = email_admin;
    }

    public String getMdp_admin() {
        return mdp_admin;
    }

    public void setMdp_admin(String mdp_admin) {
        this.mdp_admin = mdp_admin;
    }
}
