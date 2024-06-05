package br.com.PortalRh.Projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.PortalRh.Projeto.model.SocialMedia;
import br.com.PortalRh.Projeto.model.dtos.SocialMediaDTO;
import br.com.PortalRh.Projeto.repository.SocialMediaRepository;

@Service
public class SocialMediaService {
    @Autowired
    private SocialMediaRepository socialMediaRepository;

    public SocialMediaService(SocialMediaRepository socialMediaRepository) {
        this.socialMediaRepository = socialMediaRepository;
    }

    public ResponseEntity<SocialMedia> create(SocialMediaDTO socialMediaDTO) {
        SocialMedia socialMedia = new SocialMedia(
            socialMediaDTO.name(),
            socialMediaDTO.url(),
            socialMediaDTO.person()
        );

        socialMediaRepository.save(socialMedia);
        return ResponseEntity.ok(socialMedia);
    }

    public ResponseEntity<List<SocialMedia>> findAll() {
        List<SocialMedia> socialMedias = socialMediaRepository.findAll();
        return ResponseEntity.ok(socialMedias);
    }

    public ResponseEntity<SocialMedia> findById(Long id) {
        Optional<SocialMedia> socialMedia = socialMediaRepository.findById(id);
        if (socialMedia.isPresent()) {
            return ResponseEntity.ok(socialMedia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<SocialMedia> update(SocialMediaDTO socialMediaDTO, Long id) {
        Optional<SocialMedia> optionalSocialMedia = socialMediaRepository.findById(id);

        if (optionalSocialMedia.isPresent()) {
            SocialMedia socialMedia = optionalSocialMedia.get();
            socialMedia.setName(socialMediaDTO.name());
            socialMedia.setUrl(socialMediaDTO.url());
            socialMedia.setPerson(socialMediaDTO.person());

            socialMediaRepository.save(socialMedia);
            return ResponseEntity.ok(socialMedia);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<SocialMedia> optionalSocialMedia = socialMediaRepository.findById(id);

        if (optionalSocialMedia.isPresent()) {
            socialMediaRepository.delete(optionalSocialMedia.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

