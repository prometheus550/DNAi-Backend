package com.dnai.controllers;

import com.dnai.dtos.PatientRequestDTO;
import com.dnai.dtos.PatientResponseDTO;
import com.dnai.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired private PatientService patientService;

    @PostMapping
    public PatientResponseDTO createPatient(@RequestBody PatientRequestDTO request, Principal principal) {
        String doctorEmail = principal.getName();
        return patientService.createPatient(request, doctorEmail);
    }
    @GetMapping
    public List<PatientResponseDTO> getAllPatients(Principal principal) {
        String doctorEmail = principal.getName();
        return patientService.getAllPatientsForDoctor(doctorEmail);
    }

}


