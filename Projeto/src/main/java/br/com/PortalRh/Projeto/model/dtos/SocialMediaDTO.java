package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.Person;

public record SocialMediaDTO(
    String name,
    String url,
    Person person
) {}