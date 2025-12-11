package com.dnai.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dnai.dtos.DiagnosisCreateRequest;
import com.dnai.entities.Diagnosis;
import com.dnai.services.DiagnosisService;

@RequestController
@RequestMapping("/api/diagnosis")

public class DiagnosisController {
    private final DiagnosisService diagnosisService;

    public DiagnosisController(DiagnosisService diagnosisService){
        this.diagnosisService = diagnosisService;
    }
@PostMapping
public ResponseEntity<Diagnosis> createDiagnosis(@RequestBody DiagnosisCreateRequest request){
    Diagnosis saved = diagnosisService.createDiagnosis((request));
    return new ResponseEntity<>(saved, HttpStatus.CREATED);
}
}
