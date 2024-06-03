package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.PreviousExperience;
import br.com.PortalRh.Projeto.repository.PrevExpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrevExpService {

    @Autowired
    private PrevExpRepository repository;

    public PreviousExperience salvar (PreviousExperience entity){return repository.save(entity); }

    public List<PreviousExperience> buscaTodos(){return repository.findAll(); }

    public PreviousExperience buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public PreviousExperience alterar(Long id, PreviousExperience alterado){
        Optional<PreviousExperience> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            PreviousExperience prevExp = encontrado.get();

            prevExp.setCompany(alterado.getCompany());
            prevExp.setExpMonths(alterado.getExpMonths());
            prevExp.setExpYears(alterado.getExpYears());
            prevExp.setDescription(alterado.getDescription());
            prevExp.setPerson(alterado.getPerson());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}

