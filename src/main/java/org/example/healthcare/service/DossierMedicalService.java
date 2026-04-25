package org.example.healthcare.service;

import lombok.AllArgsConstructor;
import org.example.healthcare.dto.DossierMedicalDTO;
import org.example.healthcare.dto.PatientDTO;
import org.example.healthcare.mapper.DossierMedicalMapper;
import org.example.healthcare.model.DossierMedical;
import org.example.healthcare.model.Patient;
import org.example.healthcare.repository.DossierMedicalRepository;
import org.example.healthcare.repository.PatientRepository;
import org.springframework.stereotype.Service;
import tools.jackson.databind.cfg.MapperBuilder;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class DossierMedicalService {
    final DossierMedicalRepository dossierMedicalRepository;
    final DossierMedicalMapper dossierMedicalMapper;
    final PatientRepository patientRepository;
    final MedecinService medecinService;
    private final MapperBuilder mapperBuilder;

    public DossierMedicalDTO creerDossierMedical(Long idPatient) {
        Patient patient = patientRepository.findById(idPatient).orElseThrow(() -> new RuntimeException("Patient introuvable"));
        DossierMedical dossierMedical = new DossierMedical();
        dossierMedical.setPatient(patient);
        dossierMedical.setDateCreation(LocalDate.now());
        return dossierMedicalMapper.toDTO(dossierMedicalRepository.save(dossierMedical));
    }

    public DossierMedicalDTO chercherDossierMedicalParId(Long idPatient) {
        DossierMedical dossierMedical = dossierMedicalRepository.findById(idPatient).orElseThrow(() -> new RuntimeException("Dossier médical introuvable"));
        return dossierMedicalMapper.toDTO(dossierMedical);
    }
    public DossierMedicalDTO ajouterDiagnostic(Long idDossier, String diagnostic) {
        DossierMedical dossierMedical = dossierMedicalMapper.toEntity(chercherDossierMedicalParId(idDossier));
        dossierMedical.setDiagnostic(diagnostic);
        return dossierMedicalMapper.toDTO(dossierMedicalRepository.save(dossierMedical));
    }
    public DossierMedicalDTO ajouterObservation(Long idDossier, String observation) {
        DossierMedical dossierMedical = dossierMedicalMapper.toEntity(chercherDossierMedicalParId(idDossier));
        dossierMedical.setObservation(observation);
        return dossierMedicalMapper.toDTO(dossierMedicalRepository.save(dossierMedical));
    }
}
