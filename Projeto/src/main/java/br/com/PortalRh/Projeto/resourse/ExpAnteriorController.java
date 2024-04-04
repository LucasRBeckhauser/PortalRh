package br.com.PortalRh.Projeto.resourse;

import br.com.PortalRh.Projeto.model.ExpAnterior;
import br.com.PortalRh.Projeto.service.ExpAnteriorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/expAnteriores/")
public class ExpAnteriorController {

    @Autowired
    private ExpAnteriorService service;

    @PostMapping
    public ResponseEntity create(@RequestBody ExpAnterior entity) {
        ExpAnterior save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/expAnteriores/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<ExpAnterior> expAnteriores = service.buscaTodos();
        return ResponseEntity.ok(expAnteriores);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        ExpAnterior expAnteriores = service.buscaPorId(id);
        return ResponseEntity.ok(expAnteriores);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody ExpAnterior entity) {
        ExpAnterior alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
