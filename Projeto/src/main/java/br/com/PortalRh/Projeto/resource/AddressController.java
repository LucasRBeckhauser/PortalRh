package br.com.PortalRh.Projeto.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.PortalRh.Projeto.entities.Address;
import br.com.PortalRh.Projeto.entities.dtos.AddressDTO;
import br.com.PortalRh.Projeto.service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private AddressService service;


    @PostMapping
    public ResponseEntity<AddressDTO> create(@RequestBody AddressDTO dto) {
        AddressDTO savedDto = service.salvar(dto);
        return ResponseEntity.created(URI.create("/api/address/" + savedDto.getCep())).body(savedDto);
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
