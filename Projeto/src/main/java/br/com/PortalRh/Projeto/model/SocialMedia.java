package br.com.PortalRh.Projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SocialMedia extends EntityId {
    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "url", nullable = false)
    private String url;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public SocialMedia() {}

    public SocialMedia(String name, String url, Person person) {
        this.name = name;
        this.url = url;
        this.person = person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "SocialMedia [name=" + name + ", url=" + url + ", person=" + person + "]";
    }
}
