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

public class PatientController {
    private final PatientService patientService;
    @RequestMapping("/api/patient")
    @GetMapping
    public List<PatientDTO> getPatients() {
        return patientService.patientsList();
    }
    @RequestMapping("/api/patient")
    @PostMapping("/ajouter")
    public PatientDTO ajouterPatient(@Valid @RequestBody PatientDTO patientDTO) {
       return patientService.ajouterPatient(patientDTO);
    }
    @RequestMapping("/api/patient")
    @PutMapping("/modifier/{id}")
    public PatientDTO modifierPatient( @PathVariable Long id,@Valid @RequestBody PatientDTO patientDTO) {
return patientService.modifierPatient(id,patientDTO);
    }
    @RequestMapping("/api/patient")
    @DeleteMapping("/supprimer/{id}")
    public void supprimerPatient(@PathVariable Long id) {
        patientService.supprimerPatient(id);
    }

    @RequestMapping("/api/patient")
    @GetMapping("/chercher/{id}")
    public PatientDTO chercherPatient(@PathVariable Long id) {
        return patientService.consulterPatient(id);
    }
}
