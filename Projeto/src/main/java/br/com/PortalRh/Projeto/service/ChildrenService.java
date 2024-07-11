package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.entities.Children;
import br.com.PortalRh.Projeto.repository.ChildrenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.PortalRh.Projeto.model.Children;
import br.com.PortalRh.Projeto.controller.dtos.ChildrenDTO;
import br.com.PortalRh.Projeto.repository.ChildrenRepository;

@Service
public class ChildrenService {

    @Autowired
    private ChildrenRepository repository;

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

    public List<Children> buscaTodos(){return repository.findAll(); }

    public Children buscaPorId(Long id){return repository.findById(id).orElse(null); }

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

    public void remover(Long id) { repository.deleteById(id);}
}
