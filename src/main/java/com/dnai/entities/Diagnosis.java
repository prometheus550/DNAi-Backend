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
    
    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }

    public Doctor getDoctor() { return doctor; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }
    
    public String getDiagnosis(){return diagnosis;}
    public void setDiagnosis(String diagnosis){this.diagnosis = diagnosis;}

    public float getConfidenceScore(){return confidenceScore;}
    public void setConfidenceScore(float confidenceScore){this.confidenceScore = confidenceScore;}
    
}
