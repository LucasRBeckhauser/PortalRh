package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Collaborator;
import br.com.PortalRh.Projeto.controller.dtos.CollaboratorDTO;
import br.com.PortalRh.Projeto.repository.CollaboratorRepository;
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
                collaboratorDTO.wage(),
                collaboratorDTO.pisPasep(),
                collaboratorDTO.contractModality(),
                collaboratorDTO.shift(),
                collaboratorDTO.jobPosition(),
                collaboratorDTO.admission(),
                collaboratorDTO.demission()

        );
        collaboratorRepository.save(collaborator);
        return ResponseEntity.ok(collaborator);
    }

    public ResponseEntity<List<Collaborator>> findAll() {
        List<Collaborator> collaborators = collaboratorRepository.findAll();
        return ResponseEntity.ok(collaborators);
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
            collaborator.setWage(collaboratorDTO.wage());
            collaborator.setPisPasep(collaboratorDTO.pisPasep());
            collaborator.setContractModality(collaboratorDTO.contractModality());
            collaborator.setShift(collaboratorDTO.shift());
            collaborator.setJobPosition(collaboratorDTO.jobPosition());
            collaborator.setAdmission(collaboratorDTO.admission());
            collaborator.setDemission(collaboratorDTO.demission());

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
