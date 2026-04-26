package org.example.healthcare.mapper;

import org.example.healthcare.dto.PatientDTO;
import org.example.healthcare.model.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    Patient toEntity(PatientDTO patientDTO);
    PatientDTO toDTO(Patient patient);

    @Mapping(target = "id", ignore = true)
    void modifierPatient(PatientDTO patientDTO,@MappingTarget Patient patient);

    List<PatientDTO> toDTO(List<Patient> patients);
}
