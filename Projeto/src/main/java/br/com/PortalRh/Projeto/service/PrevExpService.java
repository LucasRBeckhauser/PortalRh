package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.entities.PrevExp;
import br.com.PortalRh.Projeto.repository.PrevExpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrevExpService {

    @Autowired
    private PrevExpRepository repository;

    public PrevExp salvar (PrevExp entity){return repository.save(entity); }

    public List<PrevExp> buscaTodos(){return repository.findAll(); }

    public PrevExp buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public PrevExp alterar(Long id, PrevExp alterado){
        Optional<PrevExp> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            PrevExp prevExp = encontrado.get();

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

