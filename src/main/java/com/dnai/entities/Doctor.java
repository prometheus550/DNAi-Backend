package com.dnai.entities;

import jakarta.persistence.*;;

@Entity
@Table(name = "Doctors")

public class Doctor{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(nullable = false)
private String name;

@Column(nullable = false, unique = true)
private String email;

@Column(name = "password_hash" ,nullable = false)
private String passwordHash;

@Column(nullable = false)
private String speciality;

public Doctor() {}

public Long getid(){return id;}
public void setid(Long id){this.id = id;}

public String getname(){return name;}
public void setname(String name){this.name = name;}

public String getemail(){return email;}
public void setemail(String email){this.email = email;}

public String getpasswordHash(){return passwordHash;}
public void setpasswordHash(String passwordHash){this.passwordHash = passwordHash;}

public String getspeciality(){return speciality;}
public void setspeciality(String speciality){this.speciality = speciality;}


}