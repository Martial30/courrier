package com.example.courrier.implementations;

import com.example.courrier.model.Admin;
import com.example.courrier.repository.AdminRepository;
import com.example.courrier.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminImplementService implements AdminService {

    public AdminImplementService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    AdminRepository adminRepository;
    @Override
    public String creerUnAdmin(Admin admin) {
        adminRepository.save(admin);
        return "Admin crée avec succès";
    }

    @Override
    public String modifierUnAdmin(Admin admin) {
        adminRepository.save(admin);
        return "Admin modifié avec succès";
    }

    @Override
    public String supprimerUnAdmin(Integer id_admin) {
        adminRepository.deleteById(String.valueOf(id_admin));
        return "Admin supprimé avec succès";
    }

    @Override
    public Admin afficherUnAdmin(Integer id_admin) {
        return adminRepository.findById(String.valueOf(id_admin)).get();
    }

    @Override
    public List<Admin> afficherTousLesAdmin() {
        return  adminRepository.findAll();
    }
}
