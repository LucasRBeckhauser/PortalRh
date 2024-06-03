package br.com.PortalRh.Projeto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "previous_experiences")
public class PreviousExperience extends EntityId {
    @Column(name = "company")
    private String company;

    @Column(name = "experience_time")
    private Integer experienceTime;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "previous_experience_id")
    private Person person;

    public PreviousExperience() {}

    public PreviousExperience(String company, Integer experienceTime, String description, Person person) {
        this.company = company;
        this.experienceTime = experienceTime;
        this.description = description;
        this.person = person;
    }

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