package com.dnai.entities;

import jakarta.persistence.*;

@Entity
@Table (name="diagnosis") 

public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;
    
    private String diagnosis;
    private float confidenceScore;

    public Diagnosis(){}
    
    public Long getDoctorId(){return id;}
    public void setDoctorId(Long id){this.id = id;}

    public Long getPatientId(){return id;}
    public void setPatientId(Long id){this.id = id;}

    public String getDiagnosis(){return diagnosis;}
    public void setDiagnosis(String diagnosis){this.diagnosis = diagnosis;}

    public float getConfidenceScore(){return confidenceScore;}
    public void setConfidenceScore(float confidenceScore){this.confidenceScore = confidenceScore;}
    
}
