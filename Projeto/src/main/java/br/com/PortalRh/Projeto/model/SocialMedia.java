package br.com.PortalRh.Projeto.model;

import jakarta.persistence.*;

@Entity
public class SocialMedia {
    @Column(name = "nome")
    private String nome;
    @Column(name = "url")
    private String url;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private Person person;

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getLink() {
        return url;
    }

    public void setLink(String link) {
        this.url = link;
    }

    public SocialMedia() {
    }

    @Override
    public String toString() {
        return "SocialNetwork{" +
                "name='" + nome + '\'' +
                ", link='" + url + '\'' +
                '}';
    }
}
