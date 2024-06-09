package br.com.PortalRh.Projeto.model.dtos;

import java.time.LocalDate;

import br.com.PortalRh.Projeto.model.Person;

public record ChildrenDTO(
    String name,
    LocalDate age,
    Person person
) {}