package com.example.courrier.implementations;

import com.example.courrier.model.Courrier;
import com.example.courrier.repository.CourrierRepository;
import com.example.courrier.service.CourrierService;

import java.util.List;

public class CourrierImplementService  implements CourrierService {

    CourrierRepository courrierRepository;
    public CourrierImplementService(CourrierRepository courrierRepository) {
        this.courrierRepository = courrierRepository;
    }

    @Override
    public String creerCourrier(Courrier courrier) {
        courrierRepository.save(courrier);
        return "Courrier crée avec succès";
    }

    @Override
    public String modifierCourrier(Courrier courrier) {
        courrierRepository.save(courrier);
        return "Courrier modifié avec succès";
    }

    @Override
    public String supprimerCourrier(Integer id_cou) {
        courrierRepository.deleteById(String.valueOf(id_cou));
        return "Suppression du courrier effectuée avec succès";
    }

    @Override
    public Courrier afficherCourrier(Integer id_cou) {
        return courrierRepository.findById(String.valueOf(id_cou)).get();

    }

    @Override
    public List<Courrier> afficherTousCourriers() {
        return courrierRepository.findAll();
    }
}
