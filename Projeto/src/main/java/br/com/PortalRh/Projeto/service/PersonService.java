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
                personDTO.getName(),
                personDTO.getCpf(),
                personDTO.getRg(),
                personDTO.getVoterRegist(),
                personDTO.getBirthday(),
                personDTO.getReservist(),
                personDTO.getCnh(),
                personDTO.getRaceColor(),
                personDTO.getReligion(),
                personDTO.getBloodDonor(),
                personDTO.getNationality(),
                personDTO.getLanguages(),
                personDTO.getOvertime(),
                personDTO.getClockIn(),
                personDTO.getClockOut(),
                personDTO.getParent(),
                personDTO.getBankData(),
                personDTO.getUser(),
                personDTO.getCollaborator()

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
            person.setName(personDTO.getName());
            person.setCpf(personDTO.getCpf());
            person.setRg(personDTO.getRg());
            person.setVoterRegist(personDTO.getVoterRegist());
            person.setBirthday(personDTO.getBirthday());
            person.setReservist(personDTO.getReservist());
            person.setCnh(personDTO.getCnh());
            person.setRaceColor(personDTO.getRaceColor());
            person.setReligion(personDTO.getReligion());
            person.setBloodDonor(personDTO.getBloodDonor());
            person.setNacionality(personDTO.getNationality());
            person.setLanguages(personDTO.getLanguages());
            person.setOvertime(personDTO.getOvertime());
            person.setClockIn(personDTO.getClockIn());
            person.setClockOut(personDTO.getClockOut());
            person.setParent(personDTO.getParent());
            person.setBankData(personDTO.getBankData());
            person.setUser(personDTO.getUser());
            person.setCollaborator(personDTO.getCollaborator());

            personRepository.save(person);
            return ResponseEntity.ok(person);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

//    public ResponseEntity<Person> update(PersonDTO personDTO, Long id) {
//        Optional<Person> optionalPerson = personRepository.findById(id);
//
//        if (optionalPerson.isPresent()) {
//            Person person = optionalPerson.get();
//
//            Person updatedPerson = new Person.Builder()
//                    .name(personDTO.name())
//                    .cpf(personDTO.cpf())
//                    .rg(personDTO.rg())
//                    .voterRegist(personDTO.voterRegist())
//                    .birthday(personDTO.birthday())
//                    .reservist(personDTO.reservist())
//                    .cnh(personDTO.cnh())
//                    .raceColor(personDTO.raceColor())
//                    .religion(personDTO.religion())
//                    .bloodDonor(personDTO.bloodDonor())
//                    .nacionality(personDTO.nationality())
//                    .languages(personDTO.languages())
//                    .overtime(personDTO.overtime())
//                    .clockIn(personDTO.clockIn())
//                    .clockOut(personDTO.clockOut())
//                    .parent(personDTO.parent())
//                    .bankData(personDTO.bankData())
//                    .user(personDTO.user())
//                    .collaborator(personDTO.collaborator())
//                    .build();
//
//            updatedPerson.setId(person.getId());
//
//            personRepository.save(updatedPerson);
//            return ResponseEntity.ok(updatedPerson);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }



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
