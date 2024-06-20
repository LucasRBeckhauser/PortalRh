package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Demission;
import br.com.PortalRh.Projeto.controller.dtos.DemissionDTO;
import br.com.PortalRh.Projeto.repository.DemissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemissionService {

    @Autowired
    public DemissionRepository demissionRepository;

    public DemissionService(DemissionRepository demissionRepository) {
        this.demissionRepository = demissionRepository;
    }

    public ResponseEntity<Demission> create(DemissionDTO demissionDTO) {
        Demission demission = new Demission(
                demissionDTO.demissionDate(),
                demissionDTO.reasonDemission()
        );
        demissionRepository.save(demission);
        return ResponseEntity.ok(demission);
    }

    public ResponseEntity<List<Demission>> findAll() {
        List<Demission> demissions = demissionRepository.findAll();
        return ResponseEntity.ok(demissions);
    }

    public ResponseEntity<Demission> findById(Long id) {
        Optional<Demission> demission = demissionRepository.findById(id);
        if (demission.isPresent()) {
            return ResponseEntity.ok(demission.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Demission> update(DemissionDTO demissionDTO, Long id) {
        Optional<Demission> optionalDemission = demissionRepository.findById(id);

        if (optionalDemission.isPresent()) {
            Demission demission = optionalDemission.get();
            demission.setReasonDemission(demissionDTO.reasonDemission());
            demission.setDemissionDate(demissionDTO.demissionDate());


            demissionRepository.save(demission);
            return ResponseEntity.ok(demission);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<Demission> optionalDemission = demissionRepository.findById(id);

        if (optionalDemission.isPresent()) {
            demissionRepository.delete(optionalDemission.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
