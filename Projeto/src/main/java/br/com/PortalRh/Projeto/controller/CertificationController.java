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

import br.com.PortalRh.Projeto.model.Certification;
import br.com.PortalRh.Projeto.model.dtos.CertificationDTO;
import br.com.PortalRh.Projeto.service.CertificationService;

@RestController
@RequestMapping("api/certification")
public class CertificationController {
    @Autowired
    private CertificationService certificationService;

    @PostMapping
    public ResponseEntity<Certification> createAddress(@RequestBody CertificationDTO certificationDTO) {
        return certificationService.create(certificationDTO);
    }

    @GetMapping
    public ResponseEntity<List<Certification>> getAllAddresses() {
        return certificationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Certification> getAddressById(@PathVariable Long id) {
        return certificationService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Certification> updateAddress(@RequestBody CertificationDTO certificationDTO, @PathVariable Long id) {
        return certificationService.update(certificationDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        return certificationService.delete(id);
    }
}