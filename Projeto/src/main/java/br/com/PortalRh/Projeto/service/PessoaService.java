package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Pessoa;
import br.com.PortalRh.Projeto.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa salvar (Pessoa entity){return repository.save(entity); }

    public List<Pessoa>buscaTodos(){return repository.findAll(); }

    public Pessoa buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Pessoa alterar(Long id, Pessoa alterado){
        Optional<Pessoa> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Pessoa pessoa = encontrado.get();

            pessoa.setNome(alterado.getNome());
            pessoa.setCpf(alterado.getCpf());
            pessoa.setRg(alterado.getRg());
            pessoa.setTituloEleitor(alterado.getTituloEleitor());
            pessoa.setDataNascimento(alterado.getDataNascimento());
            pessoa.setCarteiraReservista(alterado.getCarteiraReservista());
            pessoa.setCnh(alterado.getCnh());
            pessoa.setRacaCor(alterado.getRacaCor());
            pessoa.setReligiao(alterado.getReligiao());
            pessoa.setDoadorSangue(alterado.getDoadorSangue());
//            pessoa.setCertificacoes(alterado.getCertificacoes());
            pessoa.setNacionalidade(alterado.getNacionalidade());
//            pessoa.setExpAnteriores(alterado.getExpAnteriores());
            pessoa.setIdiomas(alterado.getIdiomas());
            pessoa.setHoraExtra(alterado.getHoraExtra());
            pessoa.setEntrada(alterado.getEntrada());
            pessoa.setSaida(alterado.getSaida());
        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}

}

