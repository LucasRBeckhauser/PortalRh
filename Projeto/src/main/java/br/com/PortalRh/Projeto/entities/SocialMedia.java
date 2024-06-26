package br.com.PortalRh.Projeto.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SocialMedia extends EntityId {
    @Column(name = "nome")
    private String name;
    @Column(name = "url")
    private String url;
    @OneToMany(mappedBy = "socialMedia", cascade = CascadeType.ALL)
    private List<Person> persons = new ArrayList<>();

    public SocialMedia() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Person> getPerson() {
        return persons;
    }

    public void addPessoa(Person person) { persons.add(person); }

    public void  removePessoa(Person person) { persons.remove(person); }
}
