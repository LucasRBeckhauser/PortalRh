package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.Person;

public record LanguageDTO(
    String name,
    Person person
) {}
