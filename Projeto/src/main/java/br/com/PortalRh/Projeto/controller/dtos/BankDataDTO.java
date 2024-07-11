package br.com.PortalRh.Projeto.controller.dtos;


import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.model.enums.AccountType;
import java.util.ArrayList;
import java.util.List;

public class BankDataDTO {

    AccountType accountType;

    String bank;

    String agency;

    String account;


    public BankDataDTO() {}

    public BankDataDTO(AccountType accountType, String bank, String agency, String account) {
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

    public static BankDataDTO fromEntity(BankData bankData) {
        return new BankDataDTO(
                bankData.getAccountType(),
                bankData.getBank(),
                bankData.getAgency(),
                bankData.getAccount()
        );

    }

    public static List<BankDataDTO> fromEntityList(List<BankData> bankDatas){
        List<BankDataDTO> bankDataDTOList = new ArrayList<>();
        for (BankData bankData : bankDatas) {
            bankDataDTOList.add(fromEntity(bankData));
        }
        return bankDataDTOList;
    }

    public BankData toEntity() {
        BankData bankData = new BankData();
        bankData.setAccount(this.account);
        bankData.setBank(this.bank);
        bankData.setAgency(this.agency);
        bankData.setAccountType(this.accountType);
        return bankData;
    }

    public static List<BankData> toEntityList(List<BankDataDTO> bankDataDTOS) {
        List<BankData> bankData = new ArrayList<>();
        for (BankDataDTO bankDataDTO : bankDataDTOS) {
            bankData.add(bankDataDTO.toEntity());
        }
        return bankData;
    }

}