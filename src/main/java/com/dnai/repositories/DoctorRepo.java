package com.dnai.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dnai.entities.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {

    Optional<Doctor> findByEmail(String email);  
}