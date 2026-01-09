package com.dnai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dnai.entities.Doctor;
import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Optional<Doctor> findByEmail(String email);

   
}