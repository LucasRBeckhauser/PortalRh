package br.com.PortalRh.Projeto.resource;

import br.com.PortalRh.Projeto.service.CooperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/cooperators")
public class CooperatorController {

    @Autowired
    private CooperatorService service;

    @PostMapping
    public ResponseEntity create(@RequestBody br.com.PortalRh.Projeto.entities.Cooperator entity) {
        br.com.PortalRh.Projeto.entities.Cooperator save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/cooperators/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<br.com.PortalRh.Projeto.entities.Cooperator> colaboradores = service.buscaTodos();
        return ResponseEntity.ok(colaboradores);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        br.com.PortalRh.Projeto.entities.Cooperator colaboradores = service.buscaPorId(id);
        return ResponseEntity.ok(colaboradores);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody br.com.PortalRh.Projeto.entities.Cooperator entity) {
        br.com.PortalRh.Projeto.entities.Cooperator alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
