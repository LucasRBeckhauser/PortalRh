package br.com.PortalRh.Projeto.model.dtos;

public record ParentDTO(
    String fathersName,
    String fathersPhone,
    String mothersName,
    String mothersPhone
) {}