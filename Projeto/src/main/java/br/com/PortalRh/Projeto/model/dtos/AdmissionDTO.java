package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.Aso;

import java.time.LocalDate;

public record AdmissionDTO(
        LocalDate AdmissionDate,
        Aso aso) {}
