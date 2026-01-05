package com.dnai.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dnai.dtos.DoctorRequestDTO;
import com.dnai.entities.Doctor;
import com.dnai.repositories.DoctorRepository;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepo;
    private final PasswordEncoder passwordEncoder;

    public DoctorService(DoctorRepository doctorRepo,PasswordEncoder passwordEncoder){
        this.doctorRepo = doctorRepo;
        this.passwordEncoder = passwordEncoder;
    }
    public Doctor createDoctor(DoctorRequestDTO request){
        Doctor doctor = new Doctor();
        
        doctor.setName(request.getName());
        doctor.setEmail(request.getEmail());

        String encodedPassword = passwordEncoder.encode(request.getPassword());
        doctor.setPasswordHash(encodedPassword);
        doctor.setSpeciality(request.getSpeciality());
        return doctorRepo.save(doctor);


    }
    
}
