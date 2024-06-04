package br.com.PortalRh.Projeto.model.dtos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

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
    List<Long> previousExperiencesIds,
    List<Long> languagesIds,
    List<Long> socialMediaIds,
    List<Long> certificationsIds,
    List<Long> childrenIds,
    List<Long> addressesIds
) {}