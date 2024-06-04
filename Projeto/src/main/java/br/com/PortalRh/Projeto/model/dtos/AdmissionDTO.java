package br.com.PortalRh.Projeto.model.dtos;

import java.time.LocalDate;

public record AdmissionDTO(
        LocalDate AdmissionDate,
        Long aso_id
) {}
