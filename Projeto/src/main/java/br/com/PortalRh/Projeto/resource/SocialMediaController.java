package br.com.PortalRh.Projeto.resource;

import br.com.PortalRh.Projeto.entities.PrevExp;
import br.com.PortalRh.Projeto.entities.SocialMedia;
import br.com.PortalRh.Projeto.service.PrevExpService;
import br.com.PortalRh.Projeto.service.SocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping ("/api/socialmedia")
public class SocialMediaController {

    @Autowired
    private SocialMediaService service;

    @PostMapping
    public ResponseEntity create(@RequestBody SocialMedia entity) {
        SocialMedia save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/socialmedia/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll() {
        List<SocialMedia> socialMedia = service.buscaTodos();
        return ResponseEntity.ok(socialMedia);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        SocialMedia socialMedia = service.buscaPorId(id);
        return ResponseEntity.ok(socialMedia);
    }

    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody SocialMedia entity) {
        SocialMedia socialMedia = service.alterar(id, entity);
        return ResponseEntity.ok().body(socialMedia);
    }
}
