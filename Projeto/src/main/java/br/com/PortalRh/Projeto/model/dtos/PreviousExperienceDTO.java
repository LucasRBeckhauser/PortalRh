package br.com.PortalRh.Projeto.model.dtos;

public record PreviousExperienceDTO(
    String company,
    Integer experienceTime,
    String description,
    Long personId
) {}