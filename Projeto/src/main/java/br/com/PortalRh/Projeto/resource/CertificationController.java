package br.com.PortalRh.Projeto.resource;

import br.com.PortalRh.Projeto.model.Certification;
import br.com.PortalRh.Projeto.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/certification")
public class CertificationController {

    @Autowired
    private CertificationService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Certification entity) {
        Certification save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/certification/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Certification> certificacoes = service.buscaTodos();
        return ResponseEntity.ok(certificacoes);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Certification certificacoes = service.buscaPorId(id);
        return ResponseEntity.ok(certificacoes);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Certification entity) {
        Certification alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}