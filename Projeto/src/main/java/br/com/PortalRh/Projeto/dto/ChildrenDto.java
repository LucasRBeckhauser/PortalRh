package br.com.PortalRh.Projeto.dto;

import br.com.PortalRh.Projeto.entities.Person;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;

public class ChildrenDto {
    private String name;
    private Integer age;
    private Person person;

    public ChildrenDto() {
    }

    public ChildrenDto(String name, Integer age, Person person) {
        this.name = name;
        this.age = age;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
