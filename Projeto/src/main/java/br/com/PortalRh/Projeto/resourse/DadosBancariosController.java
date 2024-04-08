package br.com.PortalRh.Projeto.resourse;

import br.com.PortalRh.Projeto.model.Certificacao;
import br.com.PortalRh.Projeto.model.DadosBancarios;
import br.com.PortalRh.Projeto.service.CertificacaoService;
import br.com.PortalRh.Projeto.service.DadosBancariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/dadosBancarios")
public class DadosBancariosController {

    @Autowired
    private DadosBancariosService service;

    @PostMapping
    public ResponseEntity create(@RequestBody DadosBancarios entity) {
        DadosBancarios save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/dadosBancarios/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<DadosBancarios> dadosBancarios = service.buscaTodos();
        return ResponseEntity.ok(dadosBancarios);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        DadosBancarios dadosBancarios = service.buscaPorId(id);
        return ResponseEntity.ok(dadosBancarios);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody DadosBancarios entity) {
        DadosBancarios alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
