package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Cooperator;
import br.com.PortalRh.Projeto.repository.CooperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CooperatorService {

    @Autowired
    private CooperatorRepository repository;

    public Cooperator salvar (Cooperator entity){return repository.save(entity); }

    public List<Cooperator> buscaTodos(){return repository.findAll(); }

    public Cooperator buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Cooperator alterar(Long id, Cooperator alterado){
        Optional<Cooperator> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Cooperator cooperator = encontrado.get();

            cooperator.setSalario(alterado.getSalario());
            cooperator.setPisPasep(alterado.getPisPasep());
            cooperator.setCargo(alterado.getCargo());
            cooperator.setModalidadeContratual(alterado.getModalidadeContratual());
            cooperator.setTurno(alterado.getTurno());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
