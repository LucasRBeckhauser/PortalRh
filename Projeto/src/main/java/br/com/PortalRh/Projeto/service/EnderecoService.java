package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Endereco;
import br.com.PortalRh.Projeto.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public Endereco salvar (Endereco entity){return repository.save(entity); }

    public List<Endereco> buscaTodos(){return repository.findAll(); }

    public Endereco buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Endereco alterar(Long id, Endereco alterado){
        Optional<Endereco> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Endereco endereco = encontrado.get();

            endereco.setNumeroResidencia(alterado.getNumeroResidencia());
            endereco.setNomeRua(alterado.getNomeRua());
            endereco.setComplemento(alterado.getComplemento());
            endereco.setBairro(alterado.getBairro());
            endereco.setCidade(alterado.getCidade());
            endereco.setEstado(alterado.getEstado());
            endereco.setCep(alterado.getCep());
            endereco.setPais(alterado.getPais());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
