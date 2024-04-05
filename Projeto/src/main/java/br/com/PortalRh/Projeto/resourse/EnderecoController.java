package br.com.PortalRh.Projeto.resourse;

import br.com.PortalRh.Projeto.model.Endereco;
import br.com.PortalRh.Projeto.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Endereco entity) {
        Endereco save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/enderecos/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Endereco> enderecos = service.buscaTodos();
        return ResponseEntity.ok(enderecos);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Endereco enderecos = service.buscaPorId(id);
        return ResponseEntity.ok(enderecos);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Endereco entity) {
        Endereco alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
