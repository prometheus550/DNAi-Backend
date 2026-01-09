package com.dnai.services;

import com.dnai.dtos.EntryRequestDTO;
import com.dnai.dtos.EntryResponseDTO;
import com.dnai.entities.Entry;
import com.dnai.entities.Patient;
import com.dnai.repositories.EntryRepository;
import com.dnai.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntryService {
    
    @Autowired private EntryRepository entryRepo;
    @Autowired private PatientRepository patientRepo;

    public EntryResponseDTO createEntry(Long patientId, EntryRequestDTO request){

        // find the patient
        Patient patient = patientRepo.findById(patientId)
                .orElseThrow(()-> new RuntimeException("Patient not found"));
    
            // create note
        Entry entry = new Entry();
        entry.setTitle(request.getTitle());
        entry.setBody(request.getBody());
        entry.setTags(request.getTags());

        entry.setPatient(patient);

        Entry savedEntry = entryRepo.save(entry);

        //return dto
        return new EntryResponseDTO(
               savedEntry.getId(),
               savedEntry.getTitle(),
               savedEntry.getBody(),
               savedEntry.getTags(),
               savedEntry.getCreationDate()
        );
       } 
    public List<EntryResponseDTO>getentriesForPatient(Long patientId){
         List<Entry>entries = entryRepo.findByPatientIdOrderByCreationDateDesc(patientId);

         return entries.stream()
               .map(e -> new EntryResponseDTO(
                e.getId(),
                e.getTitle(),
                e.getBody(),
                e.getTags(),
                e.getCreationDate()
               ))
               .collect(Collectors.toList());
    }
     
}
    







