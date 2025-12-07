package com.dnai.dtos;

public  class DoctorCreateRequest{

    private String name;
    private String email;
    private String password;
    private String speciality;

public String getName(){return name;}
public void setName(String name){this.name = name;}

public String getEmail(){return email;}
public void setemail(String email){this.email = email;}

public String getPasswordHash(){return password;}
public void setPasswordHash(String password){this.password = password;}

public String getSpeciality(){return speciality;}
public void setSpeciality(String speciality){this.speciality = speciality;}
}
