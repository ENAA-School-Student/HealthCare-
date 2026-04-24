package org.example.healthcare.repository;

import org.example.healthcare.model.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendezVousRepositoryt extends JpaRepository<RendezVous,Long> {
}
