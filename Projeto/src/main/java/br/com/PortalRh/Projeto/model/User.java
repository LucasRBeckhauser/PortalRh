package br.com.PortalRh.Projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity

public class User extends EntityId {
    @Column (name = "usarname")
    private String username;

    @Column (name = "password")
    private String password;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Person person;

    public User() {}

    public User(String username, String password, Person person) {
        this.username = username;
        this.password = password;
        this.person = person;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", person=" + person + "]";
    }
}
