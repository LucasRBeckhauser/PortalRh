package br.com.PortalRh.Projeto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Users extends EntityId {
    @Column (name = "usarname")
    private String username;
    @Column (name = "password")
    private String password;

    public Users() {
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

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
