package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.Person;

public record CertificationDTO(
    String title,
    String skills,
    Integer workload,
    String certificateDescription,
    Person person
) {}
