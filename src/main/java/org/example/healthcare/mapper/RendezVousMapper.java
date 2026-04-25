package org.example.healthcare.mapper;

import org.example.healthcare.dto.RendezVousDTO;
import org.example.healthcare.model.RendezVous;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RendezVousMapper {
    RendezVousDTO toDTO(RendezVous rendezVous);
    RendezVous toEntity(RendezVousDTO rendezVousDTO);
    void modifierRendezVous(RendezVousDTO rendezVousDTO,@MappingTarget RendezVous rendezVous);
    List<RendezVousDTO>  toDTO(List<RendezVous> rendezVous);
}
