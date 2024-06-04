package br.com.PortalRh.Projeto.model.dtos;

public record CertificationDTO(
    String title,
    String skills,
    Double workload,
    String certificateDescription,
    Long personId
) {}
