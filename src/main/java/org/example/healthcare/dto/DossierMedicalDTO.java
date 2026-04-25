package org.example.healthcare.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


import java.time.LocalDate;
@Data

public class DossierMedicalDTO {

    private Long id;
    private String diagnostic;
    private String observation;
    @NotBlank(message = "il faut ajouter la date de création du dossier")
    private LocalDate dateCreation;

}
