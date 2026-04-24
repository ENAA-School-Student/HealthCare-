package org.example.healthcare.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.example.healthcare.model.RendezVous;
import org.mapstruct.Mapper;

import java.time.LocalDateTime;
@Data
@Mapper(componentModel = "spring")

public class RendezVousDTO {
    private Long id;
    @NotNull
    private LocalDateTime dateRendezVous;
    @NotNull(message = "statut est obligatoire")
    private RendezVous.StatutRendezVous statut;
}
