package br.com.PortalRh.Projeto.entities;

import br.com.PortalRh.Projeto.entities.enuns.AccType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class BankData extends EntityId {
    @Column (name = "accType" )
    private AccType accType;
    @Column (name = "bank")
    private String bank;
    @Column (name = "agency")
    private String agency;
    @Column(name = "acc")
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
