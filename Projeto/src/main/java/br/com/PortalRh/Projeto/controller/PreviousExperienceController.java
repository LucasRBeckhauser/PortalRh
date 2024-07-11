package br.com.PortalRh.Projeto.controller;

import java.util.List;

import br.com.PortalRh.Projeto.controller.dtos.PersonDTO;
import br.com.PortalRh.Projeto.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.PortalRh.Projeto.model.PreviousExperience;
import br.com.PortalRh.Projeto.controller.dtos.PreviousExperienceDTO;
import br.com.PortalRh.Projeto.service.PreviousExperienceService;

@RestController
@RequestMapping("api/previousExperiences")
public class PreviousExperienceController extends AbstractController{


    @Autowired
    private PreviousExperienceService previousExperienceService;

    @PostMapping
    public ResponseEntity<PreviousExperience> createPreviousExperience(@RequestBody PreviousExperienceDTO previousExperienceDTO) {
        return previousExperienceService.create(previousExperienceDTO);
    }

    @GetMapping
    public ResponseEntity<List<PreviousExperienceDTO>> getAllPreviousExperience() {
        List<PreviousExperience> all = previousExperienceService.findAll();
        List<PreviousExperienceDTO> previousExperienceDTOS = PreviousExperienceDTO.fromEntityList(all);
        return ResponseEntity.ok(previousExperienceDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PreviousExperience> getPreviousExperienceById(@PathVariable Long id) {
        return previousExperienceService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PreviousExperience> updatePreviousExperience(@RequestBody PreviousExperienceDTO previousExperienceDTO, @PathVariable Long id) {
        return previousExperienceService.update(previousExperienceDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePreviousExperience(@PathVariable Long id) {
        return previousExperienceService.delete(id);
    }
}
