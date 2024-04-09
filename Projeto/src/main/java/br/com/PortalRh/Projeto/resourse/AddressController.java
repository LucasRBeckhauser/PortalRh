package br.com.PortalRh.Projeto.resourse;

import br.com.PortalRh.Projeto.model.Address;
import br.com.PortalRh.Projeto.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/enderecos")
public class AddressController {

    @Autowired
    private AddressService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Address entity) {
        Address save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/enderecos/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Address> addresses = service.buscaTodos();
        return ResponseEntity.ok(addresses);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Address enderecos = service.buscaPorId(id);
        return ResponseEntity.ok(enderecos);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Address entity) {
        Address alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
