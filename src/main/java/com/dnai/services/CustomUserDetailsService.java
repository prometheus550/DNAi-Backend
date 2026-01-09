package com.dnai.services;

import com.dnai.entities.Doctor;
import com.dnai.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private DoctorRepository doctorRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
        Doctor doctor = doctorRepo.findByEmail(email)
            .orElseThrow(() -> new UsernameNotFoundException("Doctor not found with email: " + email));

       
        return User.builder()
                .username(doctor.getEmail())
                .password(doctor.getPasswordHash())
                .roles("USER")
                .build();
    }
}