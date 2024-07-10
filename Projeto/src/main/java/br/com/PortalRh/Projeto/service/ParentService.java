package br.com.PortalRh.Projeto.service;

import java.util.List;
import java.util.Optional;

import br.com.PortalRh.Projeto.enterprise.ValidationException;
import br.com.PortalRh.Projeto.validation.Parent.FathersPhoneSpecification;
import br.com.PortalRh.Projeto.validation.Parent.MothersPhoneSpecification;
import br.com.PortalRh.Projeto.validation.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.PortalRh.Projeto.model.Parent;
import br.com.PortalRh.Projeto.controller.dtos.ParentDTO;
import br.com.PortalRh.Projeto.repository.ParentRepository;

@Service
public class ParentService {
    @Autowired
    private ParentRepository parentRepository;

    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    public ResponseEntity<Parent> create(ParentDTO parentDTO) {

        Parent parent = new Parent(
                parentDTO.getFathersName(),
                parentDTO.getFathersPhone(),
                parentDTO.getMothersName(),
                parentDTO.getMothersPhone()
        );

        ValidationResult mothersPhoneValidation = new MothersPhoneSpecification().isSatisfiedBy(parent);
        if (!mothersPhoneValidation.isValid()) {
            throw new ValidationException(mothersPhoneValidation.getMessage());
        }

        ValidationResult fathersPhoneValidation = new FathersPhoneSpecification().isSatisfiedBy(parent);
        if (!fathersPhoneValidation.isValid()) {
            throw new ValidationException(fathersPhoneValidation.getMessage());
        }

        parentRepository.save(parent);
        return ResponseEntity.ok(parent);
    }


    public List<Parent> findAll() {
        List<Parent> parents = parentRepository.findAll();
        return parents;
    }

    public ResponseEntity<Parent> findById(Long id) {
        Optional<Parent> parent = parentRepository.findById(id);
        if (parent.isPresent()) {
            return ResponseEntity.ok(parent.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Parent> update(ParentDTO parentDTO, Long id) {
        Optional<Parent> optionalParent = parentRepository.findById(id);

        if (optionalParent.isPresent()) {
            Parent parent = optionalParent.get();
            parent.setFathersName(parentDTO.getFathersName());
            parent.setFathersPhone(parentDTO.getFathersPhone());
            parent.setMothersName(parentDTO.getMothersName());
            parent.setMothersPhone(parentDTO.getMothersPhone());

            parentRepository.save(parent);
            return ResponseEntity.ok(parent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<Parent> optionalParent = parentRepository.findById(id);

        if (optionalParent.isPresent()) {
            parentRepository.delete(optionalParent.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
