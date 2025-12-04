package com.dnai.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    
    @Column(columnDefinition = "TEXT") 
    private String body; 

    
    private String tags; 

    private LocalDateTime creationDate;

    
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    
    @PrePersist
    protected void onCreate() {
        this.creationDate = LocalDateTime.now();
    }

    
}