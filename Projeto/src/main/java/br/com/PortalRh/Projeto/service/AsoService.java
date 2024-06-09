package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Aso;
import br.com.PortalRh.Projeto.model.dtos.AsoDTO;
import br.com.PortalRh.Projeto.repository.AsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsoService {

    @Autowired
    private AsoRepository asoRepository;

    public AsoService (AsoRepository asoRepository) {
        this.asoRepository = asoRepository;
    }

    public ResponseEntity<Aso> create(AsoDTO asoDTO) {
        Aso aso = new Aso(
            asoDTO.healthHistory(),
            asoDTO.medicalProcesses(),
            asoDTO.supplementaryExamsDate(),
            asoDTO.responsibleDoctorName(),
            asoDTO.responsibleDoctorCrm(),
            asoDTO.coordinatingDoctorName(),
            asoDTO.coordinatingDoctorCrm(),
            asoDTO.occupationalRisks(),
            asoDTO.finalJudgment(),
            asoDTO.doctorSignatureDate()
        );

        asoRepository.save(aso);
        return ResponseEntity.ok(aso);
    }

    public ResponseEntity<List<Aso>> findAll () {
        List <Aso> asos = asoRepository.findAll();
        return ResponseEntity.ok(asos);
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
            aso.setHealthHistory(asoDTO.healthHistory());
            aso.setMedicalProcesses(asoDTO.medicalProcesses());
            aso.setSupplementaryExamsDate(asoDTO.supplementaryExamsDate());
            aso.setResponsibleDoctorName(aso.getResponsibleDoctorName());
            aso.setResponsibleDoctorCrm(asoDTO.responsibleDoctorCrm());
            aso.setCoordinatingDoctorName(asoDTO.coordinatingDoctorName());
            aso.setCoordinatingDoctorCrm(asoDTO.coordinatingDoctorCrm());
            aso.setOccupationalRisks(asoDTO.occupationalRisks());
            aso.setFinalJudgment(asoDTO.finalJudgment());
            aso.setDoctorSignatureDate(asoDTO.doctorSignatureDate());

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
