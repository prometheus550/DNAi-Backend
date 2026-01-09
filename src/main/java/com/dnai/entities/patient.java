package com.dnai.entities;

import jakarta.persistence.*;
//import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    
    
    private String initialSymptoms; 
    private String duration;        
    private String severity; 
    
    @Column(length = 1000) 
    private String familyHistory; 
    private String comorbidities;

    
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Entry> entries;

    public Patient() {}

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getInitialSymptoms() { return initialSymptoms; }
    public void setInitialSymptoms(String initialSymptoms) { this.initialSymptoms = initialSymptoms; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
    public String getFamilyHistory() { return familyHistory; }
    public void setFamilyHistory(String familyHistory) { this.familyHistory = familyHistory; }
    public String getComorbidities() { return comorbidities; }  
    public void setComorbidities(String comorbidities) { this.comorbidities = comorbidities; }
    public Doctor getDoctor() { return doctor; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }

}