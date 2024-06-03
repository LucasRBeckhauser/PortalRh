package br.com.PortalRh.Projeto.dtos;

import br.com.PortalRh.Projeto.entities.enuns.AccountType;

public class BankDataDTO {
    private AccountType accountType;
    private String bank;
    private String agency;
    private String account;

    public BankDataDTO() {
    }

    public BankDataDTO(AccountType accType, String bank, String agency, String account) {
        this.accountType = accType;
        this.bank = bank;
        this.agency = agency;
        this.account = account;
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
}
