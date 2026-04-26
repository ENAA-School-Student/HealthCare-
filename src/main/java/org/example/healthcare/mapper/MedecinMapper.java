package org.example.healthcare.mapper;

import org.example.healthcare.dto.DossierMedicalDTO;
import org.example.healthcare.dto.MedecinDTO;
import org.example.healthcare.model.Medecin;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MedecinMapper {

    Medecin toEntity(MedecinDTO medecinDTO);

    MedecinDTO toDTO(Medecin medecin);

    @Mapping(target = "id", ignore = true)
    void modifierMedecinDTO(MedecinDTO medecinDTO, @MappingTarget Medecin medecin);

    List<MedecinDTO> toDTO(List<Medecin> medecins);
}
