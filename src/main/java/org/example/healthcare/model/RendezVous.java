package org.example.healthcare.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateRendezVous;
    @Enumerated(EnumType.STRING)
    private StatutRendezVous statut;

    public enum StatutRendezVous{
        PLANIFIE,
        CONFIRME,
        PATIENT_ARRIVE,
        EN_CONSULTATION,
        TERMINE,
        ANNULE,
        ABSENCE,
        REPROGRAMME
    }

    @ManyToOne
    Patient patient;
    @ManyToOne
    Medecin medecin;
}
