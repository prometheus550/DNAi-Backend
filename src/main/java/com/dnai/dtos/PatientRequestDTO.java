package com.dnai.dtos;

// 1. INPUT
public class PatientRequestDTO {
    private String name;
    private int age;
    private String initialSymptoms;
    private String duration;
    private String familyHistory;
    private String comorbidities;

    
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
}

