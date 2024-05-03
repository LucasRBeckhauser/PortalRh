package br.com.PortalRh.Projeto.entities;

import br.com.PortalRh.Projeto.entities.enuns.AccType;

public class BankData {
    private AccType accType;
    private String bank;
    private String agency;
    private String acc;

    public BankData() {
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

    @Override
    public String toString() {
        return "BankData{" +
                "accType=" + accType +
                ", bank='" + bank + '\'' +
                ", agency='" + agency + '\'' +
                ", acc='" + acc + '\'' +
                '}';
    }
}
