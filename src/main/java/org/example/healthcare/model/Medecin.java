package org.example.healthcare.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Medecin extends Utilisateur {

    private String nom;
    private String specialite;
    private String telephone;

    @OneToMany(mappedBy = "medecin")
    private List<RendezVous> rendezVousList = new ArrayList<>();

    public Medecin() {
        super();
        this.setRole(Role.MEDECIN);
    }

    @PrePersist
    public void initRole() {
        if (this.getRole() == null) {
            this.setRole(Role.MEDECIN);
        }
    }
}