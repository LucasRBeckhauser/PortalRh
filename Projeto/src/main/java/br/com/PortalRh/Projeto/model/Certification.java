package br.com.PortalRh.Projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "certificates")
public class Certification extends EntityId {
    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "skills", nullable = false)
    private String skills;

    @Column(name = "workload", nullable = false)
    private Integer workload;

    @Column(name = "certificate_description", nullable = false)
    private String certificateDescription;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Certification() {}

    public Certification(String title, String skills, Integer workload, String certificateDescription, Person person) {
        this.title = title;
        this.skills = skills;
        this.workload = workload;
        this.certificateDescription = certificateDescription;
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

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    public String getCertificateDescription() {
        return certificateDescription;
    }

    public void setCertificateDescription(String certificateDescription) {
        this.certificateDescription = certificateDescription;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Certification [title=" + title + ", skills=" + skills + ", workload=" + workload
                + ", certificateDescription=" + certificateDescription + ", person=" + person + "]";
    }

    
}
