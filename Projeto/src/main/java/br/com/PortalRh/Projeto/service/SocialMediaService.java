package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.entities.PrevExp;
import br.com.PortalRh.Projeto.entities.SocialMedia;
import br.com.PortalRh.Projeto.repository.PrevExpRepository;
import br.com.PortalRh.Projeto.repository.SocialMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocialMediaService {

    @Autowired
    private SocialMediaRepository repository;

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

    public List<SocialMedia> buscaTodos(){return repository.findAll(); }

    public SocialMedia buscaPorId(Long id){return repository.findById(id).orElse(null); }

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

    public void remover(Long id) { repository.deleteById(id);}
}
