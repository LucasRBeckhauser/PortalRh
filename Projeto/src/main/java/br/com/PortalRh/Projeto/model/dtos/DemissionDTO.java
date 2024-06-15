package br.com.PortalRh.Projeto.model.dtos;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DemissionDTO(
        @NotNull(message = "A data de demissão não pode ser nula") 
        LocalDate demissionDate,
        
        @NotBlank(message = "O motivo da demissão não pode estar em branco")
        String reasonDemission
) {}
