package br.com.PortalRh.Projeto.service;

import java.util.List;
import java.util.Optional;

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
            parentDTO.fathersName(),
            parentDTO.fathersPhone(),
            parentDTO.mothersName(),
            parentDTO.mothersPhone()
        );

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
            parent.setFathersName(parentDTO.fathersName());
            parent.setFathersPhone(parentDTO.fathersPhone());
            parent.setMothersName(parentDTO.mothersName());
            parent.setMothersPhone(parentDTO.mothersPhone());

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
