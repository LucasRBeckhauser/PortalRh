package br.com.PortalRh.Projeto.dtos;

import br.com.PortalRh.Projeto.entities.Person;

public class CertificationDto {

    private String title;

    private String skills;

    private Double workload;

    private String description;

    private Person person;

    public CertificationDto() {
    }

    public CertificationDto(String title, String skills, Double workload, String description, Person person) {
        this.title = title;
        this.skills = skills;
        this.workload = workload;
        this.description = description;
        this.person = person;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Double getWorkload() {
        return workload;
    }

    public void setWorkload(Double workload) {
        this.workload = workload;
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
