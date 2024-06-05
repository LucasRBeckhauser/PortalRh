package br.com.PortalRh.Projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.PortalRh.Projeto.model.Children;
import br.com.PortalRh.Projeto.model.dtos.ChildrenDTO;
import br.com.PortalRh.Projeto.repository.ChildrenRepository;

@Service
public class ChildrenService {
    @Autowired
    private ChildrenRepository childrenRepository;

    public ChildrenService(ChildrenRepository childrenRepository) {
        this.childrenRepository = childrenRepository;
    }

    public ResponseEntity<Children> create(ChildrenDTO childrenDTO) {
        Children children = new Children(
            childrenDTO.name(),
            childrenDTO.age(),
            childrenDTO.person()
        );

        childrenRepository.save(children);
        return ResponseEntity.ok(children);
    }

    public ResponseEntity<List<Children>> findAll() {
        List<Children> children = childrenRepository.findAll();
        return ResponseEntity.ok(children);
    }

    public ResponseEntity<Children> findById(Long id) {
        Optional<Children> children = childrenRepository.findById(id);
        if (children.isPresent()) {
            return ResponseEntity.ok(children.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Children> update(ChildrenDTO childrenDTO, Long id) {
        Optional<Children> optionalChildren = childrenRepository.findById(id);

        if (optionalChildren.isPresent()) {
            Children children = optionalChildren.get();
            children.setName(childrenDTO.name());
            children.setAge(childrenDTO.age());
            children.setPerson(childrenDTO.person());

            childrenRepository.save(children);
            return ResponseEntity.ok(children);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<Children> optionalChildren = childrenRepository.findById(id);

        if (optionalChildren.isPresent()) {
            childrenRepository.delete(optionalChildren.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
