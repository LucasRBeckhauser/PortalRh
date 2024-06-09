package br.com.PortalRh.Projeto.model.dtos;

import java.time.LocalDate;

public record DemissionDTO(
        LocalDate demissionDate,
        String reasonDemission

) {}
