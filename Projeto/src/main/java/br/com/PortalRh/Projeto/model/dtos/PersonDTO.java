package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.model.Collaborator;
import br.com.PortalRh.Projeto.model.Parent;
import br.com.PortalRh.Projeto.model.User;

import java.time.LocalDate;
import java.time.LocalTime;

public record PersonDTO(
    long id,
    String name,
    String cpf,
    String rg,
    String voterRegist,
    LocalDate birthday,
    String reservist,
    String cnh,
    String raceColor,
    String religion,
    Boolean bloodDonor,
    String nationality,
    String languages,
    Integer overtime,
    LocalTime clockIn,
    LocalTime clockOut,
    Parent parent,
    BankData bankData,
    User user,
    Collaborator collaborator
) {}