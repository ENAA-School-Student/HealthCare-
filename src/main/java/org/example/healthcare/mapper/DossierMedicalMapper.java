package org.example.healthcare.mapper;

import org.example.healthcare.dto.DossierMedicalDTO;
import org.example.healthcare.model.DossierMedical;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface DossierMedicalMapper {

    DossierMedical toEntity(DossierMedicalDTO dossierMedicalDTO);

    @Mapping(target = "patientId", source = "patient.id")
    DossierMedicalDTO toDTO(DossierMedical dossierMedical);
}
