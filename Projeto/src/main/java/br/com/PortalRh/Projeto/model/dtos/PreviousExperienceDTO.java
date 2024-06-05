package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.Person;

public record PreviousExperienceDTO(
    String company,
    Integer experienceTime,
    String description,
    Person person
) {}