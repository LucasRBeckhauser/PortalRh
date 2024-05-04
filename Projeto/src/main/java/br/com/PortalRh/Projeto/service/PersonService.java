package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.entities.Person;
import br.com.PortalRh.Projeto.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person salvar (Person entity){return repository.save(entity); }

    public List<Person>buscaTodos(){return repository.findAll(); }

    public Person buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Person alterar(Long id, Person alterado){
        Optional<Person> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Person person = encontrado.get();

            person.setNome(alterado.getNome());
            person.setCpf(alterado.getCpf());
            person.setRg(alterado.getRg());
            person.setTituloEleitor(alterado.getTituloEleitor());
            person.setDataNascimento(alterado.getDataNascimento());
            person.setCarteiraReservista(alterado.getCarteiraReservista());
            person.setCnh(alterado.getCnh());
            person.setRacaCor(alterado.getRacaCor());
            person.setReligiao(alterado.getReligiao());
            person.setDoadorSangue(alterado.getDoadorSangue());
//            pessoa.setCertificacoes(alterado.getCertificacoes());
            person.setNacionalidade(alterado.getNacionalidade());
//            pessoa.setExpAnteriores(alterado.getExpAnteriores());
            person.setIdiomas(alterado.getIdiomas());
            person.setHoraExtra(alterado.getHoraExtra());
            person.setEntrada(alterado.getEntrada());
            person.setSaida(alterado.getSaida());
        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}

}

