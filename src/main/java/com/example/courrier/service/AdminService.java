package com.example.courrier.service;

import com.example.courrier.model.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AdminService {

    public String creerUnAdmin(Admin admin);
    public  String modifierUnAdmin(Admin admin);
    public String supprimerUnAdmin(Integer id_admin);
    public Admin afficherUnAdmin(Integer id_admin);
    public List<Admin> afficherTousLesAdmin();
}
