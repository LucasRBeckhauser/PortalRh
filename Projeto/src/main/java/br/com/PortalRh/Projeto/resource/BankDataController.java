package br.com.PortalRh.Projeto.resource;

import br.com.PortalRh.Projeto.entities.BankData;
import br.com.PortalRh.Projeto.service.BankDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/bankDatas")
public class BankDataController {

    @Autowired
    private BankDataService service;

    @PostMapping
    public ResponseEntity create(@RequestBody BankData entity) {
        BankData save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/bankDatas/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<BankData> bankData = service.buscaTodos();
        return ResponseEntity.ok(bankData);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        BankData bankData = service.buscaPorId(id);
        return ResponseEntity.ok(bankData);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody BankData entity) {
        BankData alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
