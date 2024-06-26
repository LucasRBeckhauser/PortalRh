package br.com.PortalRh.Projeto.resource;

import br.com.PortalRh.Projeto.entities.Users;
import br.com.PortalRh.Projeto.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Users entity) {
        Users save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/users/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Users> users = service.buscaTodos();
        return ResponseEntity.ok(users);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Users users = service.buscaPorId(id);
        return ResponseEntity.ok(users);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Users entity) {
        Users alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
