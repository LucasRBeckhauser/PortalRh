package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Certificacao;
import br.com.PortalRh.Projeto.repository.CertificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificacaoService {

    @Autowired
    private CertificacaoRepository repository;

    public Certificacao salvar (Certificacao entity){return repository.save(entity); }

    public List<Certificacao> buscaTodos(){return repository.findAll(); }

    public Certificacao buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Certificacao alterar(Long id, Certificacao alterado){
        Optional<Certificacao> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Certificacao certificacao = encontrado.get();

            certificacao.setTitulo(alterado.getTitulo());
            certificacao.setCompetencias(alterado.getCompetencias());
            certificacao.setCargaHoraria(alterado.getCargaHoraria());
            certificacao.setDescricao(alterado.getDescricao());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
