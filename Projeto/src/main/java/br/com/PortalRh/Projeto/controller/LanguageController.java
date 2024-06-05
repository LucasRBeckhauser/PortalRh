package br.com.PortalRh.Projeto.controller;

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

import br.com.PortalRh.Projeto.model.Language;
import br.com.PortalRh.Projeto.model.dtos.LanguageDTO;
import br.com.PortalRh.Projeto.service.LanguageService;

@RestController
@RequestMapping("/api/language")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @PostMapping
    public ResponseEntity<Language> createLanguage(@RequestBody LanguageDTO languageDTO) {
        return languageService.create(languageDTO);
    }

    @GetMapping
    public ResponseEntity<List<Language>> getAllLanguages() {
        return languageService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Language> getLanguageById(@PathVariable Long id) {
        return languageService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Language> updateLanguage(@RequestBody LanguageDTO languageDTO, @PathVariable Long id) {
        return languageService.update(languageDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLanguage(@PathVariable Long id) {
        return languageService.delete(id);
    }
}