package com.dnai.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.dnai.entities.Doctor;
import com.dnai.dto.DoctorCreateRequest;
import com.dnai.repositories.DoctorRepo;

@Service
public class DoctorService {

    private final DoctorRepo doctorRepo;
    private final PasswordEncoder passwordEncoder;

    public DoctorService(DoctorRepo doctorRepo,PasswordEncoder passwordEncoder){
        this.doctorRepo = doctorRepo;
        this.passwordEncoder = passwordEncoder;
    }
    public Doctor createDoctor(DoctorCreateRequest request){
        Doctor doctor = new Doctor();
        
        doctor.setName(request.getName());
        return doctor;


    }
    
}
