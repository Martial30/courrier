package com.example.courrier.connexion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class Connexion implements CommandLineRunner {
    @Autowired
    private DataSource dataSource;
    @Override
    public void run(String... args) throws Exception {
        try {
            Connection connection = dataSource.getConnection();
            System.out.println("Connexion à la base de données réussie.");
            // Afficher une notification ou effectuer d'autres actions en cas de succès de la connexion
        } catch (SQLException e) {
            System.err.println("Échec de la connexion à la base de données : " + e.getMessage());
            // Afficher une notification ou effectuer d'autres actions en cas d'échec de la connexion
        }
    }
    }
