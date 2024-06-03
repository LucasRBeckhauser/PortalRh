package br.com.PortalRh.Projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.model.dtos.BankDataDTO;
import br.com.PortalRh.Projeto.repository.BankDataRepository;

@Service
public class BankDataService {

    @Autowired
    private BankDataRepository bankDataRepository;

    public BankDataService(BankDataRepository bankDataRepository) {
        this.bankDataRepository = bankDataRepository;
    }

    public ResponseEntity<BankData> create(BankDataDTO bankDataDTO) {
        BankData bankData = new BankData(
                bankDataDTO.accountType(),
                bankDataDTO.bank(),
                bankDataDTO.agency(),
                bankDataDTO.account()
        );

        bankDataRepository.save(bankData);
        return ResponseEntity.ok(bankData);
    }

    public List<BankData> findAll() {
        return bankDataRepository.findAll();
    }

    public BankData findById(Long id) {
        Optional<BankData> bankData = bankDataRepository.findById(id);
        return bankData.orElse(null);
    }

    public ResponseEntity<BankData> update(BankDataDTO bankDataDTO, Long id) {
        BankData bankData = findById(id);

        if (bankData != null) {
            bankData.setAccountType(bankDataDTO.accountType());
            bankData.setBank(bankDataDTO.bank());
            bankData.setAgency(bankDataDTO.agency());
            bankData.setAccount(bankDataDTO.account());

            bankDataRepository.save(bankData);
            return ResponseEntity.ok(bankData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<BankData> delete(Long id) {
        BankData bankData = findById(id);

        if (bankData != null) {
            bankDataRepository.delete(bankData);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
