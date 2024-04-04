package com.example.courrier.service;

import com.example.courrier.model.Courrier;

import java.util.List;

public interface CourrierService {

    public String creerCourrier(Courrier courrier);
    public String modifierCourrier(Courrier courrier);
    public  String supprimerCourrier(Integer id_cou);
    public Courrier afficherCourrier(Integer id_cou);
    public List<Courrier> afficherTousCourriers();
}
