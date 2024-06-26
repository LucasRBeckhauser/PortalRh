package br.com.PortalRh.Projeto.dto;

import br.com.PortalRh.Projeto.entities.enuns.AccType;

public class BankDataDto {
    private AccType accType;
    private String bank;
    private String agency;
    private String acc;

    public BankDataDto() {
    }

    public BankDataDto(AccType accType, String bank, String agency, String acc) {
        this.accType = accType;
        this.bank = bank;
        this.agency = agency;
        this.acc = acc;
    }

    public AccType getAccType() {
        return accType;
    }

    public void setAccType(AccType accType) {
        this.accType = accType;
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

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }
}
