package com.example.courrier.repository;

import com.example.courrier.model.Courrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourrierRepository extends JpaRepository<Courrier, String> {

}
