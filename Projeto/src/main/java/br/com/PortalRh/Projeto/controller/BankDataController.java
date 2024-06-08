package br.com.PortalRh.Projeto.controller;

import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.model.dtos.BankDataDTO;
import br.com.PortalRh.Projeto.service.BankDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/bankDatas")
public class BankDataController {
    @Autowired
    private BankDataService bankDataService;


    @PostMapping
    public ResponseEntity<BankData> createBankData (@RequestBody BankDataDTO bankDataDTO) {
        return bankDataService.create(bankDataDTO);
    }

    @GetMapping
    public ResponseEntity<List<BankData>> getAllBankData() {return bankDataService.findAll();}

    @PutMapping ("/{id}")
    public ResponseEntity <BankData> updateBankData (@RequestBody BankDataDTO bankDataDTO, @PathVariable Long id) {
        return bankDataService.update(bankDataDTO, id);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity <Void> deleteBankData (@PathVariable Long id) { return bankDataService.delete(id);}
}
