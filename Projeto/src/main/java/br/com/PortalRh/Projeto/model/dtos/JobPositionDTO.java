package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.enums.JobType;

public record JobPositionDTO(
    String description,
    String level,
    Boolean commission,
    JobType positionType,
    CollaboratorDTO collaborator
) {}