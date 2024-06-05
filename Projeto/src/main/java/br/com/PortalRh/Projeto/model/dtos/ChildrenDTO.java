package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.Person;

public record ChildrenDTO(
    String name,
    Integer age,
    Person person
) {}