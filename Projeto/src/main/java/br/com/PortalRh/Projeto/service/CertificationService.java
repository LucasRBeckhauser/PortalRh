package br.com.PortalRh.Projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.PortalRh.Projeto.model.Certification;
import br.com.PortalRh.Projeto.controller.dtos.CertificationDTO;
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
            certificationDTO.getTitle(),
            certificationDTO.getSkills(),
            certificationDTO.getWorkload(),
            certificationDTO.getCertificateDescription(),
            certificationDTO.getPerson()
        );

        certificationRepository.save(certification);
        return ResponseEntity.ok(certification);
    }

    public List<Certification> findAll() {
        List<Certification> certifications = certificationRepository.findAll();
        return certifications;
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
            certification.setTitle(certificationDTO.getTitle());
            certification.setSkills(certificationDTO.getSkills());
            certification.setWorkload(certificationDTO.getWorkload());
            certification.setCertificateDescription(certificationDTO.getCertificateDescription());
            certification.setPerson(certificationDTO.getPerson());

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
