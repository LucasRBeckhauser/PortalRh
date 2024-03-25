package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.models.Filiacao;
import br.com.PortalRh.Projeto.repository.FiliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FiliacaoService {

    @Autowired
    private FiliacaoRepository repository;

    public Filiacao salvar (Filiacao entity){return repository.save(entity); }

    public List<Filiacao> buscaTodos(){return repository.findAll(); }

    public Filiacao buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Filiacao alterar(Long id, Filiacao alterado){
        Optional<Filiacao> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Filiacao filiacao = encontrado.get();

            filiacao.setNomePai(alterado.getNomePai());
            filiacao.setNomeMae(alterado.getNomeMae());
            filiacao.setTelPai(alterado.getTelPai());
            filiacao.setTelMae(alterado.getTelMae());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
