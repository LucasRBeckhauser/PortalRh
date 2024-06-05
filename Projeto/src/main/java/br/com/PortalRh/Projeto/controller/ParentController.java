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

import br.com.PortalRh.Projeto.model.Parent;
import br.com.PortalRh.Projeto.model.dtos.ParentDTO;
import br.com.PortalRh.Projeto.service.ParentService;

@RestController
@RequestMapping("/api/parent")
public class ParentController {

    @Autowired
    private ParentService parentService;

    @PostMapping
    public ResponseEntity<Parent> createParent(@RequestBody ParentDTO parentDTO) {
        return parentService.create(parentDTO);
    }

    @GetMapping
    public ResponseEntity<List<Parent>> getAllParents() {
        return parentService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Parent> getParentById(@PathVariable Long id) {
        return parentService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Parent> updateParent(@RequestBody ParentDTO parentDTO, @PathVariable Long id) {
        return parentService.update(parentDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParent(@PathVariable Long id) {
        return parentService.delete(id);
    }
}
