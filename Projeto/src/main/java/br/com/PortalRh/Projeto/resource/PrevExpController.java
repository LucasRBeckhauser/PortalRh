package br.com.PortalRh.Projeto.resource;

import br.com.PortalRh.Projeto.entities.PrevExp;
import br.com.PortalRh.Projeto.service.PrevExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/expAnteriores/")
public class PrevExpController {

    @Autowired
    private PrevExpService service;

    @PostMapping
    public ResponseEntity create(@RequestBody PrevExp entity) {
        PrevExp save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/expAnteriores/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<PrevExp> prevExpAnteriores = service.buscaTodos();
        return ResponseEntity.ok(prevExpAnteriores);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        PrevExp prevExpAnteriores = service.buscaPorId(id);
        return ResponseEntity.ok(prevExpAnteriores);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody PrevExp entity) {
        PrevExp alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
