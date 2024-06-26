package br.com.PortalRh.Projeto.controller.dtos;

import org.hibernate.validator.constraints.URL;

import br.com.PortalRh.Projeto.model.Person;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class SocialMediaDTO{
    String name;
    String url;
    Person person;

//Constructors:

    public SocialMediaDTO() {
    }

    public SocialMediaDTO(String name, String url, Person person) {
        this.name = name;
        this.url = url;
        this.person = person;
    }

//Getters and Setters:

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        return "SocialMediaDTO{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", person=" + person +
                '}';
    }
}




//        (
//    @NotBlank(message = "O nome da organização não pode estar em branco")
//    String name,
//
//    @URL(message = "A URL deve ser válida")
//    String url,
//
//    @NotNull(message = "A pessoa não pode ser nula")
//    Person person
//) {}