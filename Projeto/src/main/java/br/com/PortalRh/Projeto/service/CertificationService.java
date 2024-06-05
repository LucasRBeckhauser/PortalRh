package br.com.PortalRh.Projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.PortalRh.Projeto.model.Certification;
import br.com.PortalRh.Projeto.model.dtos.CertificationDTO;
import br.com.PortalRh.Projeto.repository.CertificationRepository;

@Service
public class CertificationService {
    @Autowired
    private CertificationRepository certificationRepository;

    public CertificationService(CertificationRepository certificationRepository) {
        this.certificationRepository = certificationRepository;
    }

    public ResponseEntity<Certification> create(CertificationDTO certificationDTO) {
        Certification certification = new Certification(
            certificationDTO.title(),
            certificationDTO.skills(),
            certificationDTO.workload(),
            certificationDTO.certificateDescription(),
            certificationDTO.person()
        );

        certificationRepository.save(certification);
        return ResponseEntity.ok(certification);
    }

    public ResponseEntity<List<Certification>> findAll() {
        List<Certification> addresses = certificationRepository.findAll();
        return ResponseEntity.ok(addresses);
    }

    public ResponseEntity<Certification> findById(Long id) {
        Optional<Certification> certification = certificationRepository.findById(id);
        if (certification.isPresent()) {
            return ResponseEntity.ok(certification.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Certification> update(CertificationDTO certificationDTO, Long id) {
        Optional<Certification> optionalCertification = certificationRepository.findById(id);

        if (optionalCertification.isPresent()) {
            Certification certification = optionalCertification.get();
            certification.setTitle(certificationDTO.title());
            certification.setSkills(certificationDTO.skills());
            certification.setWorkload(certificationDTO.workload());
            certification.setCertificateDescription(certificationDTO.certificateDescription());
            certification.setPerson(certificationDTO.person());

            certificationRepository.save(certification);
            return ResponseEntity.ok(certification);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<Certification> optionalCertification = certificationRepository.findById(id);

        if (optionalCertification.isPresent()) {
            certificationRepository.delete(optionalCertification.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
