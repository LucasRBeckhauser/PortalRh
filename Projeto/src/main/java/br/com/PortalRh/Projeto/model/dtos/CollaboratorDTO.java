package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.Admission;
import br.com.PortalRh.Projeto.model.Demission;
import br.com.PortalRh.Projeto.model.JobPosition;
import br.com.PortalRh.Projeto.model.enums.ContractModality;
import br.com.PortalRh.Projeto.model.enums.Shift;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record CollaboratorDTO(
        @NotNull(message = "A remuneração não pode ser nula")
        double wage,
        @NotNull(message = "Pis é campo obrigatório")
        String pisPasep,

        @Valid @NotNull(message = "O contrato não pode ser nulo")
        ContractModality contractModality,
        @Valid @NotNull(message = "O turno não pode ser nulo")
        Shift shift,
        @Valid @NotNull(message = "O cargo não pode ser nulo")
        JobPosition jobPosition,
        @Valid @NotNull(message = "A admissão não pode ser nula")
        Admission admission,
        @Valid @NotNull(message = "A demissão não pode ser nula")
        Demission demission
) {}