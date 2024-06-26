package br.com.PortalRh.Projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.PortalRh.Projeto.model.PreviousExperience;
import br.com.PortalRh.Projeto.controller.dtos.PreviousExperienceDTO;
import br.com.PortalRh.Projeto.repository.PreviousExperienceRepository;

@Service
public class PreviousExperienceService {
    @Autowired
    private PreviousExperienceRepository previousExperienceRepository;

    public PreviousExperienceService(PreviousExperienceRepository previousExperienceRepository) {
        this.previousExperienceRepository = previousExperienceRepository;
    }

    public ResponseEntity<PreviousExperience> create(PreviousExperienceDTO previousExperienceDTO) {
        PreviousExperience previousExperience = new PreviousExperience(
            previousExperienceDTO.getCompany(),
            previousExperienceDTO.getExperienceTime(),
            previousExperienceDTO.getDescription(),
            previousExperienceDTO.getPerson()
        );

        previousExperienceRepository.save(previousExperience);
        return ResponseEntity.ok(previousExperience);
    }

    public List<PreviousExperience> findAll() {
        List<PreviousExperience> previousExperiences = previousExperienceRepository.findAll();
        return previousExperiences;
    }

    public ResponseEntity<PreviousExperience> findById(Long id) {
        Optional<PreviousExperience> previousExperience = previousExperienceRepository.findById(id);
        if (previousExperience.isPresent()) {
            return ResponseEntity.ok(previousExperience.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<PreviousExperience> update(PreviousExperienceDTO previousExperienceDTO, Long id) {
        Optional<PreviousExperience> optionalPreviousExperience = previousExperienceRepository.findById(id);

        if (optionalPreviousExperience.isPresent()) {
            PreviousExperience previousExperience = optionalPreviousExperience.get();
            previousExperience.setCompany(previousExperienceDTO.getCompany());
            previousExperience.setExperienceTime(previousExperienceDTO.getExperienceTime());
            previousExperience.setDescription(previousExperienceDTO.getDescription());
            previousExperience.setPerson(previousExperienceDTO.getPerson());

            previousExperienceRepository.save(previousExperience);
            return ResponseEntity.ok(previousExperience);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<PreviousExperience> optionalPreviousExperience = previousExperienceRepository.findById(id);

        if (optionalPreviousExperience.isPresent()) {
            previousExperienceRepository.delete(optionalPreviousExperience.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
