package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.enums.AccountType;

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
