package com.dnai.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Doctors")

public class Doctor{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false)
private String name;

@Column(nullable = false, unique = true)
private String email;

@Column(name = "password_hash" ,nullable = false)
private String passwordHash;

@Column(nullable = false)
private String speciality;

public Doctor() {}

public Long getId(){return id;}
public void setId(Long id){this.id = id;}

public String getName(){return name;}
public void setName(String name){this.name = name;}

public String getEmail(){return email;}
public void setEmail(String email){this.email = email;}

public String getPasswordHash(){return passwordHash;}
public void setPasswordHash(String passwordHash){this.passwordHash = passwordHash;}

public String getSpeciality(){return speciality;}
public void setSpeciality(String speciality){this.speciality = speciality;}


}