package br.com.PortalRh.Projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.PortalRh.Projeto.model.Language;
import br.com.PortalRh.Projeto.controller.dtos.LanguageDTO;
import br.com.PortalRh.Projeto.repository.LanguageRepository;

@Service
public class LanguageService {
    @Autowired
    private LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public ResponseEntity<Language> create(LanguageDTO languageDTO) {
        Language language = new Language(
            languageDTO.name(),
            languageDTO.person()
        );

        languageRepository.save(language);
        return ResponseEntity.ok(language);
    }

    public ResponseEntity<List<Language>> findAll() {
        List<Language> languages = languageRepository.findAll();
        return ResponseEntity.ok(languages);
    }

    public ResponseEntity<Language> findById(Long id) {
        Optional<Language> language = languageRepository.findById(id);
        if (language.isPresent()) {
            return ResponseEntity.ok(language.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Language> update(LanguageDTO languageDTO, Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);

        if (optionalLanguage.isPresent()) {
            Language language = optionalLanguage.get();
            language.setName(languageDTO.name());
            language.setPerson(languageDTO.person());

            languageRepository.save(language);
            return ResponseEntity.ok(language);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);

        if (optionalLanguage.isPresent()) {
            languageRepository.delete(optionalLanguage.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
