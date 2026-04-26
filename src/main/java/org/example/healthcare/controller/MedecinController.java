package org.example.healthcare.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.healthcare.dto.MedecinDTO;
import org.example.healthcare.model.Medecin;
import org.example.healthcare.service.MedecinService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/medecin")
public class MedecinController {
    private final MedecinService medecinService;

    @GetMapping
    public List<MedecinDTO> medecinList(){
        return medecinService.medecinsList();
    }

    @PostMapping("/ajouter")
    public MedecinDTO ajouterMedecin(@Valid @RequestBody MedecinDTO medecinDTO){
        return medecinService.ajouterMedecin(medecinDTO);
    }

    @PutMapping("/modifier/{id}")
    public MedecinDTO modifierMedecin(@Valid @PathVariable Long id, @RequestBody MedecinDTO medecinDTO){
        return medecinService.modifierMedecin(id, medecinDTO);
    }

    @DeleteMapping("/supprimer/{id}")
    public void deleteMedecin(@PathVariable Long id){
        medecinService.supprimerMedecin(id);
    }
}
