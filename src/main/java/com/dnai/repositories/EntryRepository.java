package com.dnai.repositories;

import com.dnai.backend.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EntryRepository extends JpaRepository<Entry, Long> {

    List<Entry> findByPatientId(Long patientId);

    List<Entry> findByPatientIdOrderByCreationDateDesc(Long patientId);
}