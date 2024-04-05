package br.com.PortalRh.Projeto.resourse;

import br.com.PortalRh.Projeto.model.Colaborador;
import br.com.PortalRh.Projeto.service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Colaborador entity) {
        Colaborador save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/colaboradores/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Colaborador> colaboradores = service.buscaTodos();
        return ResponseEntity.ok(colaboradores);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Colaborador colaboradores = service.buscaPorId(id);
        return ResponseEntity.ok(colaboradores);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Colaborador entity) {
        Colaborador alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
