package com.dnai.services;

import com.dnai.dtos.PatientRequestDTO;
import com.dnai.dtos.PatientResponseDTO;
import com.dnai.entities.Doctor;
import com.dnai.entities.Patient;
import com.dnai.repositories.DoctorRepository;
import com.dnai.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service 
public class PatientService {

    @Autowired private PatientRepository patientRepo;
    @Autowired private DoctorRepository doctorRepo;

    
    public PatientResponseDTO createPatient(PatientRequestDTO request, String doctorEmail) {
        

        Doctor doctor = doctorRepo.findByEmail(doctorEmail)
                .orElseThrow(() -> new RuntimeException("Doctor not found with email: " + doctorEmail));


        Patient patient = new Patient();
        patient.setName(request.getName());
        patient.setAge(request.getAge());
        patient.setInitialSymptoms(request.getInitialSymptoms());
        patient.setDuration(request.getDuration());
        patient.setFamilyHistory(request.getFamilyHistory());
        patient.setComorbidities(request.getComorbidities());
        
        
        patient.setDoctor(doctor);

        
        Patient savedPatient = patientRepo.save(patient);

        
        return new PatientResponseDTO(
                savedPatient.getId(),
                savedPatient.getName(),
                savedPatient.getAge(),
                savedPatient.getInitialSymptoms(),
                doctor.getEmail() 
        );
    }

    
    public List<PatientResponseDTO> getAllPatientsForDoctor(String doctorEmail) {
        List<Patient> patients = patientRepo.findByDoctorEmail(doctorEmail);
        
        
        return patients.stream().map(p -> new PatientResponseDTO(
                p.getId(),
                p.getName(),
                p.getAge(),
                p.getInitialSymptoms(),
                doctorEmail
        )).collect(Collectors.toList());
    }
}



    

























