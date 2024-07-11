package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.controller.dtos.BankDataDTO;
import br.com.PortalRh.Projeto.repository.BankDataRepository;
import br.com.PortalRh.Projeto.validation.BankData.AccountSpecification;
import br.com.PortalRh.Projeto.validation.BankData.AgencySpecification;
import br.com.PortalRh.Projeto.validation.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankDataService {

    @Autowired
    private BankDataRepository repository;

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

    public List<BankData> buscaTodos(){return repository.findAll(); }

    public BankData buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public ResponseEntity<BankData> update(BankDataDTO bankDataDTO, Long id) {
        Optional<BankData> optionalBankData = bankDataRepository.findById(id);

        if (optionalBankData.isPresent()) {
            BankData bankData = optionalBankData.get();
            bankData.setBank(bankDataDTO.bank());
            bankData.setAccount(bankDataDTO.bank());
            bankData.setAccountType(bankDataDTO.accountType());
            bankData.setAgency(bankDataDTO.agency());

            bankDataRepository.save(bankData);
            return ResponseEntity.ok(bankData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public void remover(Long id) { repository.deleteById(id);}
}
