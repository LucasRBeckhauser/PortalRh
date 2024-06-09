package br.com.PortalRh.Projeto.controller;

import br.com.PortalRh.Projeto.model.Admission;
import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.model.dtos.AdmissionDTO;
import br.com.PortalRh.Projeto.model.dtos.BankDataDTO;
import br.com.PortalRh.Projeto.service.AdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admissions")
public class AdmissionController {

    @Autowired
    private AdmissionService admissionService;


    @PostMapping
    public ResponseEntity<Admission> createAdmission(@RequestBody AdmissionDTO admissionDTO) {
        return admissionService.create(admissionDTO);
    }

    @GetMapping
    public ResponseEntity<List<Admission>> getAllAdmission() {return admissionService.findAll();}

    @PutMapping ("/{id}")
    public ResponseEntity <Admission> updateAdmission (@RequestBody AdmissionDTO admissionDTO, @PathVariable Long id) {
        return admissionService.update(admissionDTO, id);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity <Void> deleteAdmission (@PathVariable Long id) { return admissionService.delete(id);}
}
