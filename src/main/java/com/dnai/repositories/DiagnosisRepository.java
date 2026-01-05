package com.dnai.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dnai.entities.Diagnosis;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, Long>{
    List<Diagnosis> findByPatientIdOrDoctorId(Long patientId, Long doctorId);
    List<Diagnosis> findByPatientIdOrderByConfidenceScoreDesc(Long patientId);
}
