package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.enums.AccountType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BankDataDTO(
    @Valid
    @NotNull(message = "O tipo da conta não pode ser nula.")
    AccountType accountType,
    @Valid
    @NotBlank(message = "O banco não pode estar em branco")
    String bank,
    @NotBlank(message = "A agência não pode estar em branco")
    String agency,
    @NotBlank(message = "A conta não pode estar em branco")
    String account
) {}