package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.JobPosition;
import br.com.PortalRh.Projeto.controller.dtos.JobPositionDTO;
import br.com.PortalRh.Projeto.repository.JobPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobPositionService {
    @Autowired
    public JobPositionRepository jobPositionRepository;

    public JobPositionService(JobPositionRepository jobPositionRepository) {
        this.jobPositionRepository = jobPositionRepository;
    }

    public ResponseEntity<JobPosition> create(JobPositionDTO jobPositionDTO) {
        JobPosition jobPosition = new JobPosition(
                jobPositionDTO.getDescription(),
                jobPositionDTO.getLevel(),
                jobPositionDTO.getCommission(),
                jobPositionDTO.getPositionType()
        );
        jobPositionRepository.save(jobPosition);
        return ResponseEntity.ok(jobPosition);
    }

    public List<JobPosition> findAll() {
        List<JobPosition> jobPositions = jobPositionRepository.findAll();
        return jobPositions;
    }

    public ResponseEntity<JobPosition> findById(Long id) {
        Optional<JobPosition> jobPosition = jobPositionRepository.findById(id);
        if (jobPosition.isPresent()) {
            return ResponseEntity.ok(jobPosition.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<JobPosition> update(JobPositionDTO jobPositionDTO, Long id) {
        Optional<JobPosition> optionalJobPosition = jobPositionRepository.findById(id);

        if (optionalJobPosition.isPresent()) {
            JobPosition jobPosition = optionalJobPosition.get();
            jobPosition.setPositionType(jobPositionDTO.getPositionType());
            jobPosition.setCommission(jobPositionDTO.getCommission());
            jobPosition.setDescription(jobPositionDTO.getDescription());
            jobPosition.setLevel(jobPositionDTO.getLevel());

            jobPositionRepository.save(jobPosition);
            return ResponseEntity.ok(jobPosition);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<JobPosition> optionalJobPosition = jobPositionRepository.findById(id);

        if (optionalJobPosition.isPresent()) {
            jobPositionRepository.delete(optionalJobPosition.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
