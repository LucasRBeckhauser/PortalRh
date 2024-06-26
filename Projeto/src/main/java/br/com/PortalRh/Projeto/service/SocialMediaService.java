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

    public SocialMedia salvar (SocialMedia entity){return repository.save(entity); }

    public List<SocialMedia> buscaTodos(){return repository.findAll(); }

    public SocialMedia buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public SocialMedia alterar(Long id, SocialMedia alterado){
        Optional<SocialMedia> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            SocialMedia socialMedia = encontrado.get();
            socialMedia.setName(alterado.getName());
            socialMedia.setUrl(alterado.getUrl());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
