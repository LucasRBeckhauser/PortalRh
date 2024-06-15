package br.com.PortalRh.Projeto.model.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserDTO(
    @NotBlank(message = "O nome de usuário não pode estar em branco") 
    String username,
    
    @NotBlank(message = "A senha não pode estar em branco") 
    @Size(min = 6, message = "A senha deve ter pelo menos 6 caracteres") 
    String password
) {}