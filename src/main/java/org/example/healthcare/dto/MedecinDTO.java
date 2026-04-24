package org.example.healthcare.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.mapstruct.Mapper;
@Data
@Mapper(componentModel = "spring")
public class MedecinDTO {
    private Long id;
    @NotBlank(message ="le nom est obligatoire")
    private String nom;
    @NotBlank(message = "la spécialité est obligatoire")
    private String specialite;
    @Email(message = "email est obligatoire")
    private String email;
    @Size(min = 10, max = 10, message = "numero doit étre mois de 10")
    private String telephone;
}
