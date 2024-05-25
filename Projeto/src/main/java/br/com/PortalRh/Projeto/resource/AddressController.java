package br.com.PortalRh.Projeto.resource;

import br.com.PortalRh.Projeto.dto.AddressDto;
import br.com.PortalRh.Projeto.entities.Address;
import br.com.PortalRh.Projeto.service.AddressService;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private AddressService service;


    @PostMapping
    public ResponseEntity<AddressDto> create(@RequestBody AddressDto dto) {
        AddressDto savedDto = service.salvar(dto);
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
