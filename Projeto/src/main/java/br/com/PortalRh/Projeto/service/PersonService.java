package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Person;
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

            person.setName(alterado.getName());
            person.setCpf(alterado.getCpf());
            person.setRg(alterado.getRg());
            person.setVoterRegist(alterado.getVoterRegist());
            person.setBirthday(alterado.getBirthday());
            person.setReservist(alterado.getReservist());
            person.setCnh(alterado.getCnh());
            person.setRaceColor(alterado.getRaceColor());
            person.setReligion(alterado.getReligion());
            person.setBloodDonor(alterado.getBloodDonor());
//            pessoa.setCertificacoes(alterado.getCertificacoes());
            person.setNacionality(alterado.getNacionality());
//            pessoa.setExpAnteriores(alterado.getExpAnteriores());
            person.setLanguages(alterado.getLanguages());
            person.setHoraExtra(alterado.getHoraExtra());
            person.setClockIn(alterado.getClockIn());
            person.setClockOut(alterado.getClockOut());
            //verificar novamente se está faltando algo
        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}

}

