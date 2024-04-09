package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Certification;
import br.com.PortalRh.Projeto.repository.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificationService {

    @Autowired
    private CertificationRepository repository;

    public Certification salvar (Certification entity){return repository.save(entity); }

    public List<Certification> buscaTodos(){return repository.findAll(); }

    public Certification buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Certification alterar(Long id, Certification alterado){
        Optional<Certification> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Certification certification = encontrado.get();

            certification.setTitulo(alterado.getTitulo());
            certification.setCompetencias(alterado.getCompetencias());
            certification.setCargaHoraria(alterado.getCargaHoraria());
            certification.setDescricao(alterado.getDescricao());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
