package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.Person;
import br.com.PortalRh.Projeto.model.enums.State;

public record AddressDTO(
    String houseNumber,
    String streetName,
    String complement,
    String neighborhood,
    String city,
    State state,
    String cep,
    Person person
) {}
