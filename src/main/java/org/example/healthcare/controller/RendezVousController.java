package org.example.healthcare.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.healthcare.dto.RendezVousDTO;
import org.example.healthcare.model.RendezVous;
import org.example.healthcare.service.RendezVousService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/rendezVous")
public class RendezVousController {
    private final RendezVousService rendezVousService;

    @GetMapping
    public List<RendezVousDTO> rendezVousList(){
        return rendezVousService.rendezVousDTOList();
    }
    @GetMapping("/rendezVousPatient/{idPatient}")
    public List<RendezVousDTO> rendezVousPatient(@PathVariable Long idPatient){
        return rendezVousService.rendezVousDtoPatient(idPatient);
    }
    @GetMapping("/rendezVousMedecin/{idMedecin}")
    public List<RendezVousDTO>  rendezVousMedecin(@PathVariable Long idMedecin){
        return rendezVousService.rendezVousDtoMedecin(idMedecin);
    }
    @PostMapping("/CreerRendzVous")
    public RendezVousDTO creerRendezVous(@Valid @RequestBody RendezVousDTO rendezVousDTO){
        return rendezVousService.creerRendezVous(
                rendezVousDTO.getIdPatient(),
                rendezVousDTO.getIdMedecin(),
                rendezVousDTO.getDateRendezVous()
        );
    }

    @PostMapping("/AnnulerRendzVous/{idRendezVous}")
    public RendezVousDTO annulerRendeVous(@PathVariable Long idRendezVous){
        return rendezVousService.annulerRendezVous(idRendezVous);
    }

    @PatchMapping("/modifier/{idRendezVous}")
    public RendezVousDTO modifierRendezVous(@Valid @PathVariable Long idRendezVous, @RequestBody RendezVousDTO rendezVousDTO){
        return rendezVousService.modifierRendezVous(idRendezVous,rendezVousDTO);
    }




}
