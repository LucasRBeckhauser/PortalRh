package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.enums.AccountType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BankDataDTO {
    AccountType accountType;
    String bank;
    String agency;
    String account;

//Constructors , Getters and Setters :

    public BankDataDTO() {
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public BankDataDTO(AccountType accountType, String bank, String agency, String account) {
        this.accountType = accountType;
        this.bank = bank;
        this.agency = agency;
        this.account = account;




    }
}


//    @Valid
//    @NotNull(message = "O tipo da conta não pode ser nula.")
//    AccountType accountType,
//    @Valid
//    @NotBlank(message = "O banco não pode estar em branco")
//    String bank,
//    @NotBlank(message = "A agência não pode estar em branco")
//    String agency,
//    @NotBlank(message = "A conta não pode estar em branco")
//    String account
//) {}
