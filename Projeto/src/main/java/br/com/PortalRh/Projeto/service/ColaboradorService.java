package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Colaborador;
import br.com.PortalRh.Projeto.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColaboradorService {

    @Autowired
    private ColaboradorRepository repository;

    public Colaborador salvar (Colaborador entity){return repository.save(entity); }

    public List<Colaborador> buscaTodos(){return repository.findAll(); }

    public Colaborador buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Colaborador alterar(Long id, Colaborador alterado){
        Optional<Colaborador> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Colaborador colaborador = encontrado.get();

            colaborador.setSalario(alterado.getSalario());
            colaborador.setPisPasep(alterado.getPisPasep());
            colaborador.setCargo(alterado.getCargo());
            colaborador.setModalidadeContratual(alterado.getModalidadeContratual());
            colaborador.setTurno(alterado.getTurno());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
