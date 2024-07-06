package br.com.PortalRh.Projeto.controller.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDTO{
    @NotBlank(message = "O nome de usuário não pode estar em branco")
    String username;
    @NotBlank(message = "A senha não pode estar em branco")
    @Size(min = 6, message = "A senha deve ter pelo menos 6 caracteres")
    String password;

//Constructors:

    public UserDTO() {
    }

    public UserDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

//Getters and Setters:


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

//To string:

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}






//    @NotBlank(message = "O nome de usuário não pode estar em branco")
//    String username,
//
//    @NotBlank(message = "A senha não pode estar em branco")
//    @Size(min = 6, message = "A senha deve ter pelo menos 6 caracteres")
//    String password
//) {}