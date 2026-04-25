package org.example.healthcare.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


import java.time.LocalDate;
@Data

public class DossierMedicalDTO {

    private Long id;
    @NotBlank (message = "Diagnostic requis")
    private String diagnostic;
    @NotBlank(message = "Observation requise")
    private String observation;
    private LocalDate dateCreation;
    @NotNull
    private Long patientId;

}
