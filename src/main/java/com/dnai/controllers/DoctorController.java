package com.dnai.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dnai.dtos.DoctorRequestDTO;
import com.dnai.dtos.DoctorResponseDTO;
import com.dnai.entities.Doctor;
import com.dnai.services.DoctorService;

@RestController
@RequestMapping("/api/Doctor")

public class DoctorController {
    private final DoctorService doctorService;
    
    public DoctorController(DoctorService doctorService){
        this.doctorService = doctorService;
    }


@PostMapping
public ResponseEntity<Doctor> createDoctor(@RequestBody DoctorRequestDTO request){

    Doctor saved = doctorService.createDoctor(request);

    DoctorResponseDTO responseDTO = new DoctorResponseDTO();
    responseDTO.setId(saved.getId());
    responseDTO.setName(saved.getName());
    responseDTO.setEmail(saved.getEmail());
    responseDTO.setSpeciality(saved.getSpeciality());
    
    return new ResponseEntity<>(saved, HttpStatus.CREATED);
}
}