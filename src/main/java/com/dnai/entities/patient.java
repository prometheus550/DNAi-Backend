package com.dnai.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
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
    @JoinColumn(name = "user_id", nullable = false)
    private Doctor doctor;

    
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Entry> entries;

    
}