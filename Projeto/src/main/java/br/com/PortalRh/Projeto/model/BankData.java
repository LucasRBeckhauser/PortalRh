package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enums.AccountType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bank_datas")
public class BankData extends EntityId {
    @Enumerated(EnumType.STRING)
    @Column (name = "accountType", nullable = false)
    private AccountType accountType;

    @Column (name = "bank", nullable = false)
    private String bank;

    @Column (name = "agency", nullable = false)
    private String agency;

    @Column(name = "account", nullable = false)
    private String account;

    @OneToOne(mappedBy = "bankData", cascade = CascadeType.ALL)
    private Person person;

    public BankData() {}

    public BankData(AccountType accountType, String bank, String agency, String account) {
        this.accountType = accountType;
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
    
    @Override
    public String toString() {
        return "BankData [accountType=" + accountType + ", bank=" + bank + ", agency=" + agency + ", account=" + account + "]";
    }
}
