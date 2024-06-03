package br.com.PortalRh.Projeto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "languages")
public class Language {
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Person person;

    public Language() {}

    public Language(String name, Person person) {
        this.name = name;
        this.person = person;
    }

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

    @Override
    public String toString() {
        return "Language [name=" + name + ", person=" + person + "]";
    }
}
