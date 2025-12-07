package com.dnai.dtos;


public record PatientResponseDTO(
    Long id, 
    String name, 
    int age, 
    String initialSymptoms,
    String doctorEmail 
) {}