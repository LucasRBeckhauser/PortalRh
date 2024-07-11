package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.entities.Certification;
import br.com.PortalRh.Projeto.repository.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private CertificationRepository repository;

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

    public List<Certification> buscaTodos(){return repository.findAll(); }

    public Certification buscaPorId(Long id){return repository.findById(id).orElse(null); }

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

    public void remover(Long id) { repository.deleteById(id);}
}
