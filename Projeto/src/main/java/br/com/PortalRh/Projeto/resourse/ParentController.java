package br.com.PortalRh.Projeto.resourse;

import br.com.PortalRh.Projeto.model.Parent;
import br.com.PortalRh.Projeto.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/filiacoes")
public class ParentController {

    @Autowired
    private ParentService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Parent entity) {
        Parent save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/filiacoes/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Parent> filiacoes = service.buscaTodos();
        return ResponseEntity.ok(filiacoes);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Parent filiacoes = service.buscaPorId(id);
        return ResponseEntity.ok(filiacoes);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Parent entity) {
        Parent alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
