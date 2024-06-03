package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.enums.AccountType;

public record BankDataDTO(
    AccountType accountType, 
    String bank, 
    String agency, 
    String account
) {}
