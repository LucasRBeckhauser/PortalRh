package br.com.PortalRh.Projeto.resourse;

import br.com.PortalRh.Projeto.model.Children;
import br.com.PortalRh.Projeto.service.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/dependentes")
public class ChildrenController {

    @Autowired
    private ChildrenService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Children entity) {
        Children save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/dependentes/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Children> children = service.buscaTodos();
        return ResponseEntity.ok(children);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Children dependentes = service.buscaPorId(id);
        return ResponseEntity.ok(dependentes);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Children entity) {
        Children alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
