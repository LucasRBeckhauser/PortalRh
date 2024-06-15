package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.model.Collaborator;
import br.com.PortalRh.Projeto.model.Parent;
import br.com.PortalRh.Projeto.model.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.validator.constraints.br.CPF;

public record PersonDTO(
    @NotBlank(message = "O nome não pode estar em branco") 
    String name,

    @NotBlank(message = "O CPF não pode estar em branco") 
    @CPF
    String cpf,

    @NotBlank(message = "O RG não pode estar em branco") 
    String rg,

    @NotBlank(message = "O registro de eleitor não pode estar em branco") 
    String voterRegist,

    @NotNull(message = "A data de nascimento não pode ser nula") 
    LocalDate birthday,

    @NotBlank(message = "O reservista não pode estar em branco") 
    String reservist,

    @NotBlank(message = "A CNH não pode estar em branco") 
    String cnh,

    @NotBlank(message = "A cor/raça não pode estar em branco") 
    String raceColor,

    @NotBlank(message = "A religião não pode estar em branco") 
    String religion,
    
    @NotNull(message = "O campo de doador de sangue não pode ser nulo") 
    Boolean bloodDonor,
    
    @NotBlank(message = "A nacionalidade não pode estar em branco") 
    String nationality,
    
    @NotBlank(message = "Os idiomas falados não podem estar em branco") 
    String languages,
    
    @NotNull(message = "As horas extras não podem ser nulas") 
    @Min(value = 0, message = "As horas extras não podem ser negativas") 
    Integer overtime,
    
    @NotNull(message = "O horário de entrada não pode ser nulo") 
    LocalTime clockIn,
    
    @NotNull(message = "O horário de saída não pode ser nulo") 
    LocalTime clockOut,
    
    @Valid @NotNull(message = "Os dados do pai não podem ser nulos") 
    Parent parent,
    
    @Valid @NotNull(message = "Os dados bancários não podem ser nulos") 
    BankData bankData,
    
    @Valid @NotNull(message = "O usuário não pode ser nulo") 
    User user,
    
    @Valid @NotNull(message = "O colaborador não pode ser nulo") 
    Collaborator collaborator
) {}