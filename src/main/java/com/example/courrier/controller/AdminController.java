package com.example.courrier.controller;
import com.example.courrier.model.Admin;
import com.example.courrier.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/afficher_admin")
public class AdminController {
    AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/{id_admin}")
    public Admin afficherUnAdmin(@PathVariable("id_admin") Integer id_admin){
        return adminService.afficherUnAdmin(id_admin);
    }
    @GetMapping()
    public List<Admin> afficherTousLesAdmins(){
        return  adminService.afficherTousLesAdmin();
    }
    @PutMapping
    public String modifierAdmin(@RequestBody Admin admin){
        adminService.modifierUnAdmin(admin);
        return "Succès de la modification de l'admin ";
    }

    @DeleteMapping("{id_admin}")
   public String supprimerAdmin(@PathVariable("id_admin") Integer id_admin){
        adminService.supprimerUnAdmin(id_admin);
        return  "Succès de la suppression de l'admin ";
    }
    @PostMapping
    public String creerAdmin(@RequestBody Admin admin){
    adminService.creerUnAdmin(admin);
    return "Succès de la création de l'admin ";
    }


}
