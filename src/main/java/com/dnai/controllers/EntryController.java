package com.dnai.controllers;

import com.dnai.dtos.EntryRequestDTO;
import com.dnai.dtos.EntryResponseDTO;
import com.dnai.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/entries")
public class EntryController {

    @Autowired
    private EntryService entryService;

    
    @PostMapping("/{patientId}")
    public EntryResponseDTO createEntry(
            @PathVariable Long patientId, 
            @RequestBody EntryRequestDTO request
    ) {
        
        return entryService.createEntry(patientId, request);
    }

    
    @GetMapping("/{patientId}")
    public List<EntryResponseDTO> getEntries(@PathVariable Long patientId) {
        return entryService.getEntriesForPatient(patientId);
    }
}