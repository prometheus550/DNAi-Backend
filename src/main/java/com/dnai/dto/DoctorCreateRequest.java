package com.dnai.dto;

public  class DoctorCreateRequest{

    private String name;
    private String email;
    private String password;
    private String speciality;

public String getName(){return name;}
public void setName(String name){this.name = name;}

public String getemail(){return email;}
public void setemail(String email){this.email = email;}

public String getpasswordHash(){return password;}
public void setpasswordHash(String password){this.password = password;}

public String getspeciality(){return speciality;}
public void setspeciality(String speciality){this.speciality = speciality;}
}
