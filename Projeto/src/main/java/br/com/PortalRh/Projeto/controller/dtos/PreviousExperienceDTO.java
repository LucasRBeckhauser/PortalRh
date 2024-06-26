package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Person;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class PreviousExperienceDTO {
    String company;
    Integer experienceTime;
    String description;
    Person person;

//Constructors:
    public PreviousExperienceDTO() {
    }

    public PreviousExperienceDTO(String company, Integer experienceTime, String description, Person person) {
        this.company = company;
        this.experienceTime = experienceTime;
        this.description = description;
        this.person = person;
    }

//Getters and Setters:

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getExperienceTime() {
        return experienceTime;
    }

    public void setExperienceTime(Integer experienceTime) {
        this.experienceTime = experienceTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}




//        (
//    @NotBlank(message = "O nome da empresa não pode estar em branco")
//    String company,
//
//    @NotNull(message = "O tempo de experiência não pode ser nulo")
//    @PositiveOrZero(message = "O tempo de experiência não pode ser negativo")
//    Integer experienceTime,
//
//    @NotBlank(message = "A descrição da experiência não pode estar em branco")
//    @Size(min = 10, max = 1000, message = "A descrição deve ter entre 10 e 1000 caracteres")
//    String description,
//
//    @NotNull(message = "A pessoa não pode ser nula")
//    Person person
//) {}