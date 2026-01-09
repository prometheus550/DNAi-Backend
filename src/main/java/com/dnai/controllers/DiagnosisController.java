package com.dnai.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnai.dtos.DiagnosisRequestDTO;
import com.dnai.dtos.DiagnosisResponseDTO;
import com.dnai.entities.Diagnosis;
import com.dnai.services.DiagnosisService;

@RestController
@RequestMapping("/api/diagnoses")

public class DiagnosisController {
    private final DiagnosisService diagnosisService;

    public DiagnosisController(DiagnosisService diagnosisService){
        this.diagnosisService = diagnosisService;
    }
@PostMapping
public ResponseEntity<DiagnosisResponseDTO> createDiagnosis(@RequestBody DiagnosisRequestDTO request){ // Change return type
    Diagnosis saved = diagnosisService.createDiagnosis(request);

    DiagnosisResponseDTO responseDTO = new DiagnosisResponseDTO();
    
    responseDTO.setDiagnosis(saved.getDiagnosis());
    responseDTO.setConfidenceScore(saved.getConfidenceScore());
    responseDTO.setPatientId(saved.getPatient().getId());
    responseDTO.setDoctorId(saved.getDoctor().getId());
 
    return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
}
}
