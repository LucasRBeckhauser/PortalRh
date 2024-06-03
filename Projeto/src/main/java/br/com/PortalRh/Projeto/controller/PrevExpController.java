package br.com.PortalRh.Projeto.controller;

import br.com.PortalRh.Projeto.model.PreviousExperience;
import br.com.PortalRh.Projeto.service.PrevExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/prevexp/")
public class PrevExpController {

    @Autowired
    private PrevExpService service;

    @PostMapping
    public ResponseEntity create(@RequestBody PreviousExperience entity) {
        PreviousExperience save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/prevexp/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<PreviousExperience> prevExpAnteriores = service.buscaTodos();
        return ResponseEntity.ok(prevExpAnteriores);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        PreviousExperience prevExpAnteriores = service.buscaPorId(id);
        return ResponseEntity.ok(prevExpAnteriores);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody PreviousExperience entity) {
        PreviousExperience alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
