package br.com.PortalRh.Projeto.controller;

import java.util.List;

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

import br.com.PortalRh.Projeto.model.Children;
import br.com.PortalRh.Projeto.model.dtos.ChildrenDTO;
import br.com.PortalRh.Projeto.service.ChildrenService;

@RestController
@RequestMapping("api/childrens")
public class ChildrenController {

    @Autowired
    private ChildrenService childrenService;

    @PostMapping
    public ResponseEntity<Children> createChildren(@RequestBody ChildrenDTO childrenDTO) {
        return childrenService.create(childrenDTO);
    }

    @GetMapping
    public ResponseEntity<List<Children>> getAllChildren() {
        return childrenService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Children> getChildrenById(@PathVariable Long id) {
        return childrenService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Children> updateChildren(@RequestBody ChildrenDTO childrenDTO, @PathVariable Long id) {
        return childrenService.update(childrenDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChildren(@PathVariable Long id) {
        return childrenService.delete(id);
    }
}
