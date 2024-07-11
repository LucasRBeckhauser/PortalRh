package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.enterprise.ValidationException;
import br.com.PortalRh.Projeto.model.Aso;
import br.com.PortalRh.Projeto.controller.dtos.AsoDTO;
import br.com.PortalRh.Projeto.repository.AsoRepository;
import br.com.PortalRh.Projeto.validation.Aso.CoordinatingDoctorCrmSpecification;
import br.com.PortalRh.Projeto.validation.Aso.FinalJudgmentSpecification;
import br.com.PortalRh.Projeto.validation.Aso.ResponsibleDoctorCrmSpecification;
import br.com.PortalRh.Projeto.validation.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AsoService {

    @Autowired
    private AsoRepository asoRepository;

    public AsoService(AsoRepository asoRepository) {
        this.asoRepository = asoRepository;
    }

    public ResponseEntity<Aso> create(AsoDTO asoDTO) {
        Aso aso = new Aso(
                asoDTO.getHealthHistory(),
                asoDTO.getMedicalProcesses(),
                asoDTO.getSupplementaryExamsDate(),
                asoDTO.getResponsibleDoctorName(),
                asoDTO.getResponsibleDoctorCrm(),
                asoDTO.getCoordinatingDoctorName(),
                asoDTO.getCoordinatingDoctorCrm(),
                asoDTO.getOccupationalRisks(),
                asoDTO.getFinalJudgment(),
                asoDTO.getDoctorSignatureDate()
        );

        // Validate responsible doctor's CRM
        ValidationResult responsibleDoctorCrmValidation = new ResponsibleDoctorCrmSpecification().isSatisfiedBy(aso);
        if (!responsibleDoctorCrmValidation.isValid()) {
            throw new ValidationException(responsibleDoctorCrmValidation.getMessage());
        }

        // Validate coordinating doctor's CRM
        ValidationResult coordinatingDoctorCrmValidation = new CoordinatingDoctorCrmSpecification().isSatisfiedBy(aso);
        if (!coordinatingDoctorCrmValidation.isValid()) {
            throw new ValidationException(coordinatingDoctorCrmValidation.getMessage());
        }

        // Validate final judgment length
        ValidationResult finalJudgmentValidation = new FinalJudgmentSpecification().isSatisfiedBy(aso);
        if (!finalJudgmentValidation.isValid()) {
            throw new ValidationException(finalJudgmentValidation.getMessage());
        }

        asoRepository.save(aso);
        return ResponseEntity.ok(aso);
    }

    public List<Aso> findAll() {
        List <Aso> asos = asoRepository.findAll();
        return asos;
    }

    public ResponseEntity<Aso> findById (Long id) {
        Optional <Aso> aso = asoRepository.findById(id);
        if (aso.isPresent()) {
            return ResponseEntity.ok(aso.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Aso> update(AsoDTO asoDTO, Long id) {
        Optional<Aso> optionalAso = asoRepository.findById(id);

        if (optionalAso.isPresent()) {
            Aso aso = optionalAso.get();
            aso.setHealthHistory(asoDTO.getHealthHistory());
            aso.setMedicalProcesses(asoDTO.getMedicalProcesses());
            aso.setSupplementaryExamsDate(asoDTO.getSupplementaryExamsDate());
            aso.setResponsibleDoctorName(asoDTO.getResponsibleDoctorName());
            aso.setResponsibleDoctorCrm(asoDTO.getResponsibleDoctorCrm());
            aso.setCoordinatingDoctorName(asoDTO.getCoordinatingDoctorName());
            aso.setCoordinatingDoctorCrm(asoDTO.getCoordinatingDoctorCrm());
            aso.setOccupationalRisks(asoDTO.getOccupationalRisks());
            aso.setFinalJudgment(asoDTO.getFinalJudgment());
            aso.setDoctorSignatureDate(asoDTO.getDoctorSignatureDate());

            asoRepository.save(aso);
            return ResponseEntity.ok(aso);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    public ResponseEntity<Void> delete(Long id) {
        Optional<Aso> optionalAso = asoRepository.findById(id);

        if (optionalAso.isPresent()) {
            asoRepository.delete(optionalAso.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
