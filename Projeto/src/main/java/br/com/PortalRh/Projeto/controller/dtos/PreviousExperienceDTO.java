package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Person;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record PreviousExperienceDTO(
    @NotBlank(message = "O nome da empresa não pode estar em branco") 
    String company,
    
    @NotNull(message = "O tempo de experiência não pode ser nulo") 
    @PositiveOrZero(message = "O tempo de experiência não pode ser negativo") 
    Integer experienceTime,
    
    @NotBlank(message = "A descrição da experiência não pode estar em branco") 
    @Size(min = 10, max = 1000, message = "A descrição deve ter entre 10 e 1000 caracteres") 
    String description,
    
    @NotNull(message = "A pessoa não pode ser nula") 
    Person person
) {}