package br.com.PortalRh.Projeto.resourse;

import br.com.PortalRh.Projeto.model.Cargo;
import br.com.PortalRh.Projeto.model.Certificacao;
import br.com.PortalRh.Projeto.service.CargoService;
import br.com.PortalRh.Projeto.service.CertificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/cargos")
public class CargoController {

    @Autowired
    private CargoService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Cargo entity) {
        Cargo save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/cargos/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<Cargo> cargos = service.buscaTodos();
        return ResponseEntity.ok(cargos);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Cargo cargos = service.buscaPorId(id);
        return ResponseEntity.ok(cargos);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Cargo entity) {
        Cargo alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
