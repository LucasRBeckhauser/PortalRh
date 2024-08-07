package br.com.PortalRh.Projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "previous_experiences")
public class PreviousExperience extends EntityId {
    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "experience_time", nullable = false)
    private LocalDate experienceTime;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public PreviousExperience() {}

    public PreviousExperience(String company, LocalDate experienceTime, String description, Person person) {
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

    public LocalDate getExperienceTime() {
        return experienceTime;
    }

    public void setExperienceTime(LocalDate experienceTime) {
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