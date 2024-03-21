package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.models.Dependente;
import br.com.PortalRh.Projeto.repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DependenteService {

    @Autowired
    private DependenteRepository repository;

    public Dependente salvar (Dependente entity){return repository.save(entity); }

    public List<Dependente> buscaTodos(){return repository.findAll(); }

    public Dependente buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Dependente alterar(Long id, Dependente alterado){
        Optional<Dependente> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Dependente dependente = encontrado.get();

            dependente.setNome(alterado.getNome());
            dependente.setIdade(alterado.getIdade());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
