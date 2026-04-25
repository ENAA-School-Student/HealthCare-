package org.example.healthcare.mapper;

import org.example.healthcare.dto.DossierMedicalDTO;
import org.example.healthcare.model.DossierMedical;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DossierMedicalMapper {

    DossierMedical toEntity(DossierMedicalDTO dossierMedicalDTO);
    DossierMedicalDTO toDTO(DossierMedical dossierMedical);
}
