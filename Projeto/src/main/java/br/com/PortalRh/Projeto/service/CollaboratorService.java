package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.enterprise.ValidationException;
import br.com.PortalRh.Projeto.model.Collaborator;
import br.com.PortalRh.Projeto.controller.dtos.CollaboratorDTO;
import br.com.PortalRh.Projeto.repository.CollaboratorRepository;
import br.com.PortalRh.Projeto.validation.Collaborator.PisPasepSpecification;
import br.com.PortalRh.Projeto.validation.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollaboratorService {

    @Autowired
    public CollaboratorRepository collaboratorRepository;

    public CollaboratorService(CollaboratorRepository collaboratorRepository) {
        this.collaboratorRepository = collaboratorRepository;
    }

    public ResponseEntity<Collaborator> create(CollaboratorDTO collaboratorDTO) {
        Collaborator collaborator = new Collaborator(
                collaboratorDTO.getWage(),
                collaboratorDTO.getPisPasep(),
                collaboratorDTO.getContractModality(),
                collaboratorDTO.getShift(),
                collaboratorDTO.getJobPosition(),
                collaboratorDTO.getAdmission(),
                collaboratorDTO.getDemission()

        );

        ValidationResult pisPasepValidationResult = new PisPasepSpecification().isSatisfiedBy(collaborator);
        if (!pisPasepValidationResult.isValid()) {
            throw new ValidationException(pisPasepValidationResult.getMessage());
        }


        collaboratorRepository.save(collaborator);
        return ResponseEntity.ok(collaborator);
    }

    public List<Collaborator> findAll() {
        List<Collaborator> collaborators = collaboratorRepository.findAll();
        return collaborators;
    }

    public ResponseEntity<Collaborator> findById(Long id) {
        Optional<Collaborator> collaborator = collaboratorRepository.findById(id);
        if (collaborator.isPresent()) {
            return ResponseEntity.ok(collaborator.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Collaborator> update(CollaboratorDTO collaboratorDTO, Long id) {
        Optional<Collaborator> optionalCollaborator = collaboratorRepository.findById(id);

        if (optionalCollaborator.isPresent()) {
            Collaborator collaborator = optionalCollaborator.get();
            collaborator.setWage(collaboratorDTO.getWage());
            collaborator.setPisPasep(collaboratorDTO.getPisPasep());
            collaborator.setContractModality(collaboratorDTO.getContractModality());
            collaborator.setShift(collaboratorDTO.getShift());
            collaborator.setJobPosition(collaboratorDTO.getJobPosition());
            collaborator.setAdmission(collaboratorDTO.getAdmission());
            collaborator.setDemission(collaboratorDTO.getDemission());

            collaboratorRepository.save(collaborator);
            return ResponseEntity.ok(collaborator);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

        public ResponseEntity<Void> delete(Long id) {
            Optional<Collaborator> optionalCollaborator = collaboratorRepository.findById(id);

            if (optionalCollaborator.isPresent()) {
                collaboratorRepository.delete(optionalCollaborator.get());
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        }
}
