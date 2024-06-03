package br.com.PortalRh.Projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.model.dtos.BankDataDTO;
import br.com.PortalRh.Projeto.service.BankDataService;

@RestController
@RequestMapping("/api/bankdata")
public class BankDataController {
    private final BankDataService bankDataService;

    @Autowired
    public BankDataController(BankDataService bankDataService) {
        this.bankDataService = bankDataService;
    }

    @PostMapping
    public ResponseEntity<BankData> createBankData(@RequestBody BankDataDTO bankDataDTO) {
        return bankDataService.create(bankDataDTO);
    }

    @GetMapping
    public List<BankData> getAllBankData() {
        return bankDataService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BankData> getBankDataById(@PathVariable Long id) {
        BankData bankData = bankDataService.findById(id);
        if (bankData != null) {
            return ResponseEntity.ok(bankData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<BankData> updateBankData(@RequestBody BankDataDTO bankDataDTO, @PathVariable Long id) {
        return bankDataService.update(bankDataDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BankData> deleteBankData(@PathVariable Long id) {
        return bankDataService.delete(id);
    }
}
