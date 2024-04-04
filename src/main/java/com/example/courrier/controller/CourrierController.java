package com.example.courrier.controller;

import com.example.courrier.model.Courrier;
import com.example.courrier.service.CourrierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/afficher_courrier")
public class CourrierController {
    CourrierService courrierService;
    public CourrierController(CourrierService courrierService) {
        this.courrierService = courrierService;
    }

    @GetMapping("{id_cou}")
    public Courrier  afficherUnCourrier(@PathVariable("id_cou") Integer  id_cou){
        return  courrierService.afficherCourrier(id_cou);
    }

    @GetMapping()
    public List<Courrier> afficherTousLesCourrier(){
        return  courrierService.afficherTousCourriers();
    }

    @PutMapping
    public String modifierUnCourrier(@RequestBody Courrier courrier){
        courrierService.modifierCourrier(courrier);
        return  "Courrier  modifié avec  succès";
    }

    @DeleteMapping("{id_cou}")
    public String supprimerUnCourrier(@PathVariable("id_cou") Integer id_cou){
    courrierService.supprimerCourrier(id_cou);
    return "Courrier supprimé avec succès";
    }

    @PostMapping
    public String creerUnCourrier(@RequestBody Courrier courrier){
        courrierService.creerCourrier(courrier);
        return "Courrier crée avec succès";
        



    }


}
