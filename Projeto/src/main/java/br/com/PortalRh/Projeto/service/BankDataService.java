package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.controller.dtos.BankDataDTO;
import br.com.PortalRh.Projeto.repository.BankDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankDataService {
    @Autowired
    private BankDataRepository bankDataRepository;

    public BankDataService(BankDataRepository bankDataRepository) {
        this.bankDataRepository = bankDataRepository;
    }

    public ResponseEntity<BankData> create(BankDataDTO bankDataDTO) {
        BankData bankData = new BankData(
                bankDataDTO.getAccountType(),
                bankDataDTO.getBank(),
                bankDataDTO.getAgency(),
                bankDataDTO.getAccount()
        );

        bankDataRepository.save(bankData);
        return ResponseEntity.ok(bankData);
    }

    public List<BankData> findAll() {
        List<BankData> bankDatas = bankDataRepository.findAll();
        return bankDatas;
    }

    public ResponseEntity<BankData> findById(Long id) {
        Optional<BankData> bankData = bankDataRepository.findById(id);
        if (bankData.isPresent()) {
            return ResponseEntity.ok(bankData.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<BankData> update(BankDataDTO bankDataDTO, Long id) {
        Optional<BankData> optionalBankData = bankDataRepository.findById(id);

        if (optionalBankData.isPresent()) {
            BankData bankData = optionalBankData.get();
            bankData.setBank(bankDataDTO.getBank());
            bankData.setAccount(bankDataDTO.getAccount());
            bankData.setAccountType(bankDataDTO.getAccountType());
            bankData.setAgency(bankDataDTO.getAgency());

            bankDataRepository.save(bankData);
            return ResponseEntity.ok(bankData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<BankData> optionalBankData = bankDataRepository.findById(id);

        if (optionalBankData.isPresent()) {
            bankDataRepository.delete(optionalBankData.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
