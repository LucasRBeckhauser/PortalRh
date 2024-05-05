package br.com.PortalRh.Projeto.resource;

import br.com.PortalRh.Projeto.entities.Person;
import br.com.PortalRh.Projeto.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Person entitu) {
        Person save = service.salvar(entitu);
        return ResponseEntity.created(URI.create("/api/persons/" + entitu.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Person> people = service.buscaTodos();
        return ResponseEntity.ok(people);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Person pessoas = service.buscaPorId(id);
        return ResponseEntity.ok(pessoas);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Person entity) {
        Person alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
