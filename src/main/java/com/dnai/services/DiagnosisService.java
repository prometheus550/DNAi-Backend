package com.dnai.services;

import org.springframework.stereotype.Service;
import com.dnai.dtos.DiagnosisRequestDTO;
import com.dnai.entities.Diagnosis;
import com.dnai.entities.Doctor;
import com.dnai.entities.Patient;
import com.dnai.repositories.DiagnosisRepository;
import com.dnai.repositories.DoctorRepository;
import com.dnai.repositories.PatientRepository;

@Service
public class DiagnosisService {

    private final DiagnosisRepository diagnosisRepo;
    private final PatientRepository patientRepo;
    private final DoctorRepository doctorRepo;

    public DiagnosisService(DiagnosisRepository diagnosisRepo, 
                            PatientRepository patientRepo, 
                            DoctorRepository doctorRepo) {
        this.diagnosisRepo = diagnosisRepo;
        this.patientRepo = patientRepo;
        this.doctorRepo = doctorRepo;
    }

    public Diagnosis createDiagnosis(DiagnosisRequestDTO request) {
    
        Patient patient = patientRepo.findById(request.getPatientId())
                .orElseThrow(() -> new RuntimeException("Patient not found with ID: " + request.getPatientId()));

        Doctor doctor = doctorRepo.findById(request.getDoctorId())
                .orElseThrow(() -> new RuntimeException("Doctor not found with ID: " + request.getDoctorId()));

        Diagnosis diagnosis = new Diagnosis();
        

        diagnosis.setPatient(patient);
        diagnosis.setDoctor(doctor);
        diagnosis.setDiagnosis(request.getDiagnosis());
        diagnosis.setConfidenceScore(request.getConfidenceScore());

        return diagnosisRepo.save(diagnosis);
    }
}