package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Person;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LanguageDTO{
    @NotBlank(message = "O nome do idioma não pode estar em branco")
    String name;
    @Valid @NotNull(message = "A pessoa não pode ser nula")
    Person person;

//Constructors:

    public LanguageDTO() {
    }

    public LanguageDTO(String name, Person person) {
        this.name = name;
        this.person = person;
    }

//Getters and Setters:


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

//To string:

    @Override
    public String toString() {
        return "LanguageDTO{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}





//        (
//    @NotBlank(message = "O nome do idioma não pode estar em branco")
//    String name,
//
//    @Valid @NotNull(message = "A pessoa não pode ser nula")
//    Person person
//) {}
