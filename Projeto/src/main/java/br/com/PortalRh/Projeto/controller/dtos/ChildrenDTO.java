package br.com.PortalRh.Projeto.controller.dtos;

import java.time.LocalDate;

import br.com.PortalRh.Projeto.model.Person;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.springframework.cglib.core.Local;
import org.springframework.validation.annotation.Validated;

public class ChildrenDTO {
        @NotBlank(message = "O nome não pode estar em branco")
        String name;
        @NotNull(message = "A idade não pode ser nula")
        LocalDate age;
        @NotNull(message = "A pessoa não pode ser nula")
        Person person;

 //Constructors:
        public ChildrenDTO() {
        }

        public ChildrenDTO(String name, LocalDate age, Person person) {
                this.name = name;
                this.age = age;
                this.person = person;
        }

//Getters and Setters:

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public LocalDate getAge() {
                return age;
        }

        public void setAge(LocalDate age) {
                this.age = age;
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
        return "ChildrenDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", person=" + person +
                '}';
    }
}












//        (
//        @NotBlank(message = "O nome não pode estar em branco")
//        String name,
//        @NotNull(message = "A idade não pode ser nula")
//        LocalDate age,
//        @Valid
//        @NotNull(message = "A pessoa não pode ser nula")
//        Person person
//) {}