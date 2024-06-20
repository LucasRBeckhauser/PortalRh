package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Person;
import br.com.PortalRh.Projeto.model.enums.State;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AddressDTO(
    String houseNumber,
    String streetName,
    String complement,
    String neighborhood,
    String city,
    State state,


    @Size(min = 8, max = 8, message = "O cep deve ter 8 dígitos")
    String cep,
    @Valid
    @NotNull(message = "A pessoa não pode nulo")
    Person person
) {}
