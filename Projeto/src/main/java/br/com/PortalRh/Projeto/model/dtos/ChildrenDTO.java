package br.com.PortalRh.Projeto.model.dtos;

import java.time.LocalDate;

import br.com.PortalRh.Projeto.model.Person;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

public record ChildrenDTO(
        @NotBlank(message = "O nome não pode estar em branco")
        String name,
        @NotNull(message = "A idade não pode ser nula")
        LocalDate age,
        @Valid
        @NotNull(message = "A pessoa não pode ser nula")
        Person person
) {}