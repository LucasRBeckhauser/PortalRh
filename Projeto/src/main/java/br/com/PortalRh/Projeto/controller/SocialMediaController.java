package br.com.PortalRh.Projeto.controller;

import java.util.List;

import br.com.PortalRh.Projeto.controller.dtos.PersonDTO;
import br.com.PortalRh.Projeto.model.Person;
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

import br.com.PortalRh.Projeto.model.SocialMedia;
import br.com.PortalRh.Projeto.controller.dtos.SocialMediaDTO;
import br.com.PortalRh.Projeto.service.SocialMediaService;

@RestController
@RequestMapping("api/socialMedias")
public class SocialMediaController extends AbstractController{

    @Autowired
    private SocialMediaService socialMediaService;

    @PostMapping
    public ResponseEntity<SocialMedia> createSocialMedia(@RequestBody SocialMediaDTO socialMediaDTO) {
        return socialMediaService.create(socialMediaDTO);
    }

    @GetMapping
    public ResponseEntity<List<SocialMediaDTO>> getAllSocialMedias() {
        List<SocialMedia> all = socialMediaService.findAll();
        List<SocialMediaDTO> socialMediaDTOS = SocialMediaDTO.fromEntityList(all);
        return ResponseEntity.ok(socialMediaDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SocialMedia> getSocialMediaById(@PathVariable Long id) {
        return socialMediaService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SocialMedia> updateSocialMedia(@RequestBody SocialMediaDTO socialMediaDTO, @PathVariable Long id) {
        return socialMediaService.update(socialMediaDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSocialMedia(@PathVariable Long id) {
        return socialMediaService.delete(id);
    }
}
