package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.enums.ContractModality;
import br.com.PortalRh.Projeto.model.enums.Shift;

public record CollaboratorDTO(
    double wage,
    String pisPasep,
    ContractModality contractModality,
    Shift shift,
    Long jobPositionId,
    Long admissionId,
    Long demissionId
) {}