package org.example.healthcare.repository;

import org.example.healthcare.model.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page<Patient> findAll(Pageable pageable);
}
