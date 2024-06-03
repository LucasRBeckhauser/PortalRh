package br.com.PortalRh.Projeto.resource;

import br.com.PortalRh.Projeto.model.JobPosition;
import br.com.PortalRh.Projeto.service.JobPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/position")
public class JobPositionController {

    @Autowired
    private JobPositionService service;

    @PostMapping
    public ResponseEntity create(@RequestBody JobPosition entity) {
        JobPosition save = service.save(entity);
        return ResponseEntity.created(URI.create("/api/position/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<JobPosition> cargos = service.getAll();
        return ResponseEntity.ok(cargos);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        JobPosition cargos = service.getById(id);
        return ResponseEntity.ok(cargos);
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody JobPosition entity) {
        JobPosition changed = service.update(id, entity);
        return ResponseEntity.ok().body(changed);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
