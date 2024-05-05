package br.com.PortalRh.Projeto.resource;

import br.com.PortalRh.Projeto.entities.Aso;
import br.com.PortalRh.Projeto.service.AsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/ASOs")
public class AsoController {

    @Autowired
    private AsoService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Aso entity) {
        Aso save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/ASOs/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Aso> asoses = service.buscaTodos();
        return ResponseEntity.ok(asoses);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Aso enderecos = service.buscaPorId(id);
        return ResponseEntity.ok(enderecos);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Aso entity) {
        Aso alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
