package org.example.healthcare.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Patient extends Utilisateur {

    private String nom;
    private String prenom;
    private String telephone;
    private LocalDate dateNaissance;

    @OneToMany(mappedBy = "patient")
    private List<RendezVous> rendezVousList = new ArrayList<>();

    @OneToOne(mappedBy = "patient")
    private DossierMedical dossierMedical;

    public Patient() {
        super();
        this.setRole(Role.PATIENT);
    }

    @PrePersist
    public void initRole() {
        if (this.getRole() == null) {
            this.setRole(Role.PATIENT);
        }
    }
}