package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.enums.JobType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record JobPositionDTO(
    @NotBlank(message = "A descrição da posição não pode estar em branco") 
    String description,
    
    @NotBlank(message = "O nível da posição não pode estar em branco") 
    String level,
    
    @NotNull(message = "O campo de comissão não pode ser nulo") 
    Boolean commission,
    
    @NotNull(message = "O tipo da posição não pode ser nulo") 
    JobType positionType,
    
    @Valid @NotNull(message = "O colaborador não pode ser nulo") 
    CollaboratorDTO collaborator
) {}