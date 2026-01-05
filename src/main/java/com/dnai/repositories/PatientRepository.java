package com.dnai.repositories;

import com.dnai.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    
    List<Patient> findByDoctorEmail(Long Email);
    
}