package com.dnai.controllers;

import org.springframework.web.bind.annotation.PostMapping;

import java.net.http.HttpRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dnai.dtos.DoctorCreateRequest;
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
public ResponseEntity<Doctor> createDoctor(@RequestBody DoctorCreateRequest request){

    Doctor saved = doctorService.createDoctor(request);
    return new ResponseEntity<>(saved, HttpStatus.CREATED);
}
}