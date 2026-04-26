package org.example.healthcare.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.healthcare.dto.DossierMedicalDTO;
import org.example.healthcare.service.DossierMedicalService;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/dossierMedical")
public class DossierMedicalController {
    private final DossierMedicalService dossierMedicalService;

    @GetMapping("/consulter/{id}")
    public DossierMedicalDTO consulterDM(@PathVariable Long id) {
        return dossierMedicalService.consulterDossierMedicalParId(id);
    }

    @PostMapping("/creer/{idPatient}")
    public DossierMedicalDTO creerDossierMedical(@PathVariable Long idPatient) {
        return dossierMedicalService.creerDossierMedical(idPatient);
    }

    @PostMapping("/ajouterDiagnostic/{idDossier}")
    public DossierMedicalDTO ajouterDiagnostic(@PathVariable Long idDossier,@Valid @RequestParam String diagnostic) {
        return dossierMedicalService.ajouterDiagnostic(idDossier,diagnostic);
    }

    @PostMapping("/ajouterObservation/{idDossier}")
    public DossierMedicalDTO ajouterObservation(@PathVariable Long idDossier,@Valid @RequestParam String observation) {
        return dossierMedicalService.ajouterObservation(idDossier,observation);
    }
}
