package br.com.PortalRh.Projeto.controllers;

import br.com.PortalRh.Projeto.model.Position;
import br.com.PortalRh.Projeto.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/position")
public class PositionController {

    @Autowired
    private PositionService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Position entity) {
        Position save = service.save(entity);
        return ResponseEntity.created(URI.create("/api/position/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Position> cargos = service.getAll();
        return ResponseEntity.ok(cargos);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Position cargos = service.getById(id);
        return ResponseEntity.ok(cargos);
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Position entity) {
        Position changed = service.update(id, entity);
        return ResponseEntity.ok().body(changed);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
