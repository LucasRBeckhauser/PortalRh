package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.JobPosition;
import br.com.PortalRh.Projeto.controller.dtos.JobPositionDTO;
import br.com.PortalRh.Projeto.repository.JobPositionRepository;
import br.com.PortalRh.Projeto.validation.BankData.AccountSpecification;
import br.com.PortalRh.Projeto.validation.JobPosition.DescriptionSpecification;
import br.com.PortalRh.Projeto.validation.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
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
                jobPositionDTO.description(),
                jobPositionDTO.level(),
                jobPositionDTO.commission(),
                jobPositionDTO.positionType()
        );
        jobPositionRepository.save(jobPosition);
        return ResponseEntity.ok(jobPosition);
    }

    public List<JobPosition> getAll(){return repository.findAll(); }

    public JobPosition getById(Long id){return repository.findById(id).orElse(null); }

    public ResponseEntity<JobPosition> update(JobPositionDTO jobPositionDTO, Long id) {
        Optional<JobPosition> optionalJobPosition = jobPositionRepository.findById(id);

        if (optionalJobPosition.isPresent()) {
            JobPosition jobPosition = optionalJobPosition.get();
            jobPosition.setPositionType(jobPositionDTO.positionType());
            jobPosition.setCommission(jobPositionDTO.commission());
            jobPosition.setDescription(jobPositionDTO.description());
            jobPosition.setLevel(jobPositionDTO.level());

            jobPositionRepository.save(jobPosition);
            return ResponseEntity.ok(jobPosition);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public void delete(Long id) { repository.deleteById(id);}
}
