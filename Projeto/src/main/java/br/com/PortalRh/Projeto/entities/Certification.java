package br.com.PortalRh.Projeto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Certification extends EntityId {

    @Column(name = "titulo")
    private String title;
    @Column(name = "competencias")
    private String skills;
    @Column(name = "carga_horaria", columnDefinition = "REAL")
    private Double workload;
    @Column(name = "descricao_certif")
    private String description;
    @ManyToOne
    private Person person;

    public Certification() {
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



    @Override
    public String toString() {
        return "Certification{" +
                "title='" + title + '\'' +
                ", skills='" + skills + '\'' +
                ", workload=" + workload +
                ", description='" + description + '\'' +
                ", person=" + person +
                '}';
    }
}
