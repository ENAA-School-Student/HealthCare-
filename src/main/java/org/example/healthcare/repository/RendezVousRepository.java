package org.example.healthcare.repository;

import org.example.healthcare.model.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {


    List<RendezVous> findByMedecin_Id(Long medecinId);
    List<RendezVous> findByPatient_Id(Long patientId);
}
