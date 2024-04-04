package com.example.courrier.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "courrier")
public class Courrier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cou;
    private String type_cou;
    private Timestamp dateHeureSave_cou;
    @Lob
    private byte[] fichier_cou;

    public Courrier() {
    }

    public Courrier(Integer id_cou, String type_cou, Timestamp dateHeureSave_cou, byte[] fichier_cou) {
        this.id_cou = id_cou;
        this.type_cou = type_cou;
        this.dateHeureSave_cou = dateHeureSave_cou;
        this.fichier_cou = fichier_cou;
    }

    public Integer getId_cou() {
        return id_cou;
    }

    public void setId_cou(Integer id_cou) {
        this.id_cou = id_cou;
    }

    public String getType_cou() {
        return type_cou;
    }

    public void setType_cou(String type_cou) {
        this.type_cou = type_cou;
    }

    public Timestamp getDateHeureSave_cou() {
        return dateHeureSave_cou;
    }

    public void setDateHeureSave_cou(Timestamp dateHeureSave_cou) {
        this.dateHeureSave_cou = dateHeureSave_cou;
    }

    public byte[] getFichier_cou() {
        return fichier_cou;
    }

    public void setFichier_cou(byte[] fichier_cou) {
        this.fichier_cou = fichier_cou;
    }


}
