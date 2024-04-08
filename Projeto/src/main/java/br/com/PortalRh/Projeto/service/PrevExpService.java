package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.PrevExp;
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

            prevExp.setEmpresa(alterado.getEmpresa());
            prevExp.setMesesExp(alterado.getMesesExp());
            prevExp.setAnosExp(alterado.getAnosExp());
            prevExp.setDescricao(alterado.getDescricao());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}

