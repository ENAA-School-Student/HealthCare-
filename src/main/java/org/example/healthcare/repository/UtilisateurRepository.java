package org.example.healthcare.repository;

import org.example.healthcare.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

    Utilisateur findByUsername(String username);

    Utilisateur findByEmail(String email);
}
