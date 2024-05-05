package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.entities.Children;
import br.com.PortalRh.Projeto.repository.ChildrenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChildrenService {

    @Autowired
    private ChildrenRepository repository;

    public Children salvar (Children entity){return repository.save(entity); }

    public List<Children> buscaTodos(){return repository.findAll(); }

    public Children buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Children alterar(Long id, Children alterado){
        Optional<Children> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Children children = encontrado.get();

            children.setAge(alterado.getAge());
            children.setName(alterado.getName());
            children.setPerson(alterado.getPerson());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
