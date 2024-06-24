package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Admission;
import br.com.PortalRh.Projeto.controller.dtos.AdmissionDTO;
import br.com.PortalRh.Projeto.repository.AdmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdmissionService {

    @Autowired
    public AdmissionRepository admissionRepository;

    public AdmissionService(AdmissionRepository admissionRepository) {
        this.admissionRepository = admissionRepository;
    }

    public ResponseEntity<Admission> create(AdmissionDTO admissionDTO) {
        Admission admission = new Admission(
                admissionDTO.getAdmissionDate(),
                admissionDTO.getAso()
        );
        admissionRepository.save(admission);
        return ResponseEntity.ok(admission);
    }

    public List<Admission> findAll() {
        List<Admission> admissions = admissionRepository.findAll();
        return admissions;
    }

    public ResponseEntity<Admission> findById(Long id) {
        Optional<Admission> admission = admissionRepository.findById(id);
        if (admission.isPresent()) {
            return ResponseEntity.ok(admission.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Admission> update(AdmissionDTO admissionDTO, Long id) {
        Optional<Admission> optionalAdmission = admissionRepository.findById(id);

        if (optionalAdmission.isPresent()) {
            Admission admission = optionalAdmission.get();
            admission.setAdmissionDate(admissionDTO.getAdmissionDate());
            admission.setAso(admissionDTO.getAso());


            admissionRepository.save(admission);
            return ResponseEntity.ok(admission);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<Admission> optionalAdmission = admissionRepository.findById(id);

        if (optionalAdmission.isPresent()) {
            admissionRepository.delete(optionalAdmission.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
