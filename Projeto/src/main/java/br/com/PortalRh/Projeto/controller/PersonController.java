package br.com.PortalRh.Projeto.controller;

import br.com.PortalRh.Projeto.model.Person;
import br.com.PortalRh.Projeto.controller.dtos.PersonDTO;
import br.com.PortalRh.Projeto.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/persons")
public class PersonController extends AbstractController{

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody PersonDTO personDTO) {

//        Person person = new Person.Builder()
//                .cnh("7868768")
//                .cpf("776786786")
//                .languages("hjhh")
//                .build();


        return personService.create(personDTO);
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAllPerson() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        return personService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(@RequestBody PersonDTO personDTO, @PathVariable Long id) {
        return personService.update(personDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
        return personService.delete(id);
    }
}
