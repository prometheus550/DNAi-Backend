package com.dnai.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dnai.entities.Diagnosis;

public interface DiagnosisRepo extends JpaRepository<Diagnosis, Long>{
    List<Diagnosis> findByPatientId(Long patientId);
}
