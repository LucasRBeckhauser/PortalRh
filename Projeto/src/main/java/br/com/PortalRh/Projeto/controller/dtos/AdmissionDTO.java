package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Aso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record AdmissionDTO(
        @NotNull(message = "A data de admissão não pode ser nula.")
        LocalDate AdmissionDate,
        @Valid
        @NotNull(message = "Atestado de Saúde Ocupacional não pode ser nulo.")
        Aso aso) {}
