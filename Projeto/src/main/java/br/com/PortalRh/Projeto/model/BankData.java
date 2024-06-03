package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enums.AccountType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bank_datas")
public class BankData extends EntityId {
    @Column (name = "accountType" )
    private AccountType accountType;

    @Column (name = "bank")
    private String bank;

    @Column (name = "agency")
    private String agency;

    @Column(name = "account")
    private String account;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private Person person;

    public BankData() {}

    public BankData(
        AccountType accountType, 
        String bank, 
        String agency, 
        String account
        ) {
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
