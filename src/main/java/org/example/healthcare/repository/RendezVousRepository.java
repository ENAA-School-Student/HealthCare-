package org.example.healthcare.repository;

import org.example.healthcare.model.RendezVous;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {

    Page<RendezVous> findByMedecin_Id(Long medecinId, Pageable pageable);
    Page<RendezVous> findByPatient_Id(Long patientId, Pageable pageable);

    Page<RendezVous> findAll(Pageable pageable);
}
