package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.entities.Parent;
import br.com.PortalRh.Projeto.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParentService {

    @Autowired
    private ParentRepository repository;

    public Parent salvar (Parent entity){return repository.save(entity); }

    public List<Parent> buscaTodos(){return repository.findAll(); }

    public Parent buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Parent alterar(Long id, Parent alterado){
        Optional<Parent> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Parent parent = encontrado.get();

            parent.setNomePai(alterado.getNomePai());
            parent.setNomeMae(alterado.getNomeMae());
            parent.setTelPai(alterado.getTelPai());
            parent.setTelMae(alterado.getTelMae());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
