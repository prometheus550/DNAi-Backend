package com.dnai.services;

import org.springframework.stereotype.Service;

import com.dnai.dtos.DiagnosisCreateRequest;
import com.dnai.entities.Diagnosis;
import com.dnai.repositories.DiagnosisRepo;


@Service
public class DiagnosisService {

    private final DiagnosisRepo diagnosisRepo; 

    public DiagnosisService(DiagnosisRepo diagnosisRepo){
        this.diagnosisRepo = diagnosisRepo;
    
    }
        public Diagnosis createDiagnosis(DiagnosisCreateRequest request){
            Diagnosis diagnosis = new Diagnosis();

            diagnosis.setDiagnosis(request.getDiagnosis());
            diagnosis.setConfidenceScore(request.getConfidenceScore());
            return diagnosisRepo.save(diagnosis);
        }
    

        

        
}
