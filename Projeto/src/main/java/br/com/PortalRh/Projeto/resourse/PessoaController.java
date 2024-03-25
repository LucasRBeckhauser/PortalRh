package br.com.PortalRh.Projeto.resourse;

import br.com.PortalRh.Projeto.models.Pessoa;
import br.com.PortalRh.Projeto.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Pessoa entitu) {
        Pessoa save = service.salvar(entitu);
        return ResponseEntity.created(URI.create("/api/pessoas/" + entitu.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Pessoa> pessoas = service.buscaTodos();
        return ResponseEntity.ok(pessoas);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Pessoa pessoas = service.buscaPorId(id);
        return ResponseEntity.ok(pessoas);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Pessoa entity) {
        Pessoa alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
