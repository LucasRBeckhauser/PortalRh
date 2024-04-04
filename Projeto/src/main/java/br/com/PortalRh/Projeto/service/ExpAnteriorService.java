package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.ExpAnterior;
import br.com.PortalRh.Projeto.repository.ExpAnteriorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpAnteriorService {

    @Autowired
    private ExpAnteriorRepository repository;

    public ExpAnterior salvar (ExpAnterior entity){return repository.save(entity); }

    public List<ExpAnterior> buscaTodos(){return repository.findAll(); }

    public ExpAnterior buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public ExpAnterior alterar(Long id, ExpAnterior alterado){
        Optional<ExpAnterior> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            ExpAnterior expAnterior = encontrado.get();

            expAnterior.setEmpresa(alterado.getEmpresa());
            expAnterior.setMesesExp(alterado.getMesesExp());
            expAnterior.setAnosExp(alterado.getAnosExp());
            expAnterior.setDescricao(alterado.getDescricao());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}

