package org.example.healthcare.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.healthcare.dto.PatientDTO;
import org.example.healthcare.model.Patient;
import org.example.healthcare.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/patient")
public class PatientController {
    private final PatientService patientService;

    @GetMapping
    public List<PatientDTO> getPatients() {
        return patientService.patientsList();
    }
    @PostMapping("/ajouter")
    public PatientDTO ajouterPatient(@Valid @RequestBody PatientDTO patientDTO) {
       return patientService.ajouterPatient(patientDTO);
    }

    @PutMapping("/modifier/{id}")
    public PatientDTO modifierPatient(@Valid @PathVariable Long id, @RequestBody PatientDTO patientDTO) {
return patientService.modifierPatient(id,patientDTO);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerPatient(@PathVariable Long id) {
        patientService.supprimerPatient(id);
    }

    @GetMapping("/chercher/{id}")
    public PatientDTO chercherPatient(@PathVariable Long id) {
        return patientService.consulterPatient(id);
    }
}
