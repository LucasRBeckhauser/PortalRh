package br.com.PortalRh.Projeto.controller.dtos;

import org.hibernate.validator.constraints.URL;

import br.com.PortalRh.Projeto.model.Person;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SocialMediaDTO(
    @NotBlank(message = "O nome da organização não pode estar em branco") 
    String name,
    
    @URL(message = "A URL deve ser válida") 
    String url,
    
    @NotNull(message = "A pessoa não pode ser nula") 
    Person person
) {}