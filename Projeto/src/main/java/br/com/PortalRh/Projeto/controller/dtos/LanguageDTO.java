package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Person;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LanguageDTO(
    @NotBlank(message = "O nome do idioma não pode estar em branco") 
    String name,
    
    @Valid @NotNull(message = "A pessoa não pode ser nula") 
    Person person
) {}
