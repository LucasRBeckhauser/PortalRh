package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Person;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CertificationDTO(
        @NotBlank(message = "O título não pode estar em branco")
        String title,
        @NotBlank(message = "As habilidades não podem estar em branco")
        String skills,
        @NotNull(message = "A carga horária de trabalho não pode ser nula.")
        Integer workload,
        @NotBlank(message = "A descrição não pode estar em branco.")
        String certificateDescription,
        @Valid
        @NotNull(message = "A pessoa não pode ser nula")
        Person person
) {}
