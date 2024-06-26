package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.User;


import java.util.ArrayList;
import java.util.List;

public class UserDTO{
    String username;
    String password;

    public UserDTO() {}

    public UserDTO(String username, String password) {
        this.username = username;
        this.password = password;
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
    public static UserDTO fromEntity(User user) {
        return new UserDTO(
                user.getPassword(),
                user.getUsername()
        );
    }
    public static List<UserDTO> fromEntityList(List<User> users){
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user : users) {
            userDTOList.add(fromEntity(user));
        }
        return userDTOList;
    }

    public User toEntity() {
        User user = new User();
        user.setPassword(this.password);
        user.setUsername(this.username);

        return user;
    }

    public static List<User> toEntityList(List<UserDTO> userDTOS) {
        List<User> users = new ArrayList<>();
        for (UserDTO userDTO : userDTOS) {
            users.add(userDTO.toEntity());
        }
        return users;
    }

}