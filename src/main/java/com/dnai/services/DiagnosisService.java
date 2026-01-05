package com.dnai.services;

import org.springframework.stereotype.Service;

import com.dnai.dtos.DiagnosisRequestDTO;
import com.dnai.entities.Diagnosis;
import com.dnai.repositories.DiagnosisRepository;


@Service
public class DiagnosisService {

    private final DiagnosisRepository diagnosisRepo; 

    public DiagnosisService(DiagnosisRepository diagnosisRepo){
        this.diagnosisRepo = diagnosisRepo;
    
    }
        public Diagnosis createDiagnosis(DiagnosisRequestDTO request){
            Diagnosis diagnosis = new Diagnosis();

            diagnosis.setDiagnosis(request.getDiagnosis());
            diagnosis.setConfidenceScore(request.getConfidenceScore());
            return diagnosisRepo.save(diagnosis);
        }
    

        

        
}
