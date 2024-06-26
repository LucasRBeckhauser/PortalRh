package br.com.PortalRh.Projeto.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "children")
public class Children extends EntityId {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private LocalDate age;
    
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Children() {}

    public Children(String name, LocalDate age, Person person) {
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

    @Override
    public String toString() {
        return "Children{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", person=" + person +
                '}';
    }
}
