package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Person;
import br.com.PortalRh.Projeto.controller.dtos.PersonDTO;
import br.com.PortalRh.Projeto.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    public PersonRepository personRepository;


    public PersonService (PersonRepository personRepository) {
        this.personRepository = personRepository;}

    public ResponseEntity <Person> create(PersonDTO personDTO) {
        Person person = new Person(
                personDTO.name(),
                personDTO.cpf(),
                personDTO.rg(),
                personDTO.voterRegist(),
                personDTO.birthday(),
                personDTO.reservist(),
                personDTO.cnh(),
                personDTO.raceColor(),
                personDTO.religion(),
                personDTO.bloodDonor(),
                personDTO.nationality(),
                personDTO.languages(),
                personDTO.overtime(),
                personDTO.clockIn(),
                personDTO.clockOut(),
                personDTO.parent(),
                personDTO.bankData(),
                personDTO.user(),
                personDTO.collaborator()

        );
        personRepository.save(person);
        return ResponseEntity.ok(person);
    }

    public List<Person> findAll() {
        List<Person> people = personRepository.findAll();
        return people;
    }

    public ResponseEntity<Person> findById(Long id) {
        Optional<Person> person = personRepository.findById(id);
        if (person.isPresent()) {
            return ResponseEntity.ok(person.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Person> update(PersonDTO personDTO, Long id) {
        Optional<Person> optionalPerson = personRepository.findById(id);

        if (optionalPerson.isPresent()) {
            Person person = optionalPerson.get();

            Person updatedPerson = new Person.Builder()
                    .name(personDTO.name())
                    .cpf(personDTO.cpf())
                    .rg(personDTO.rg())
                    .voterRegist(personDTO.voterRegist())
                    .birthday(personDTO.birthday())
                    .reservist(personDTO.reservist())
                    .cnh(personDTO.cnh())
                    .raceColor(personDTO.raceColor())
                    .religion(personDTO.religion())
                    .bloodDonor(personDTO.bloodDonor())
                    .nacionality(personDTO.nationality())
                    .languages(personDTO.languages())
                    .overtime(personDTO.overtime())
                    .clockIn(personDTO.clockIn())
                    .clockOut(personDTO.clockOut())
                    .parent(personDTO.parent())
                    .bankData(personDTO.bankData())
                    .user(personDTO.user())
                    .collaborator(personDTO.collaborator())
                    .build();

            updatedPerson.setId(person.getId());

            personRepository.save(updatedPerson);
            return ResponseEntity.ok(updatedPerson);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<Person> optionalPerson = personRepository.findById(id);

        if (optionalPerson.isPresent()) {
            personRepository.delete(optionalPerson.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
