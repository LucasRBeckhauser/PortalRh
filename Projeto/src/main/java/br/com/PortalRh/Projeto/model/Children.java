package br.com.PortalRh.Projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "children")
public class Children extends EntityId {

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;
    
    @ManyToOne
    @JoinColumn(name = "child_id")
    private Person person;

    public Children() {
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

    @Override
    public String toString() {
        return "Children{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", person=" + person +
                '}';
    }
}
