package com.dnai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dnai.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

     
}