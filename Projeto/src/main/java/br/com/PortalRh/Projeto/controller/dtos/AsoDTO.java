package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Aso;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AsoDTO {

    String healthHistory;
    String medicalProcesses;
    LocalDate supplementaryExamsDate;
    String responsibleDoctorName;
    String responsibleDoctorCrm;
    String coordinatingDoctorName;
    String coordinatingDoctorCrm;
    String occupationalRisks;
    String finalJudgment;
    LocalDate doctorSignatureDate;

    public AsoDTO() {}

    public AsoDTO(String healthHistory, String medicalProcesses, LocalDate supplementaryExamsDate, String responsibleDoctorName, String responsibleDoctorCrm, String coordinatingDoctorName, String coordinatingDoctorCrm, String occupationalRisks, String finalJudgment, LocalDate doctorSignatureDate) {
        this.healthHistory = healthHistory;
        this.medicalProcesses = medicalProcesses;
        this.supplementaryExamsDate = supplementaryExamsDate;
        this.responsibleDoctorName = responsibleDoctorName;
        this.responsibleDoctorCrm = responsibleDoctorCrm;
        this.coordinatingDoctorName = coordinatingDoctorName;
        this.coordinatingDoctorCrm = coordinatingDoctorCrm;
        this.occupationalRisks = occupationalRisks;
        this.finalJudgment = finalJudgment;
        this.doctorSignatureDate = doctorSignatureDate;
    }

    public String getHealthHistory() {
        return healthHistory;
    }

    public void setHealthHistory(String healthHistory) {
        this.healthHistory = healthHistory;
    }

    public String getMedicalProcesses() {
        return medicalProcesses;
    }

    public void setMedicalProcesses(String medicalProcesses) {
        this.medicalProcesses = medicalProcesses;
    }

    public LocalDate getSupplementaryExamsDate() {
        return supplementaryExamsDate;
    }

    public void setSupplementaryExamsDate(LocalDate supplementaryExamsDate) {
        this.supplementaryExamsDate = supplementaryExamsDate;
    }

    public String getResponsibleDoctorName() {
        return responsibleDoctorName;
    }

    public void setResponsibleDoctorName(String responsibleDoctorName) {
        this.responsibleDoctorName = responsibleDoctorName;
    }

    public String getResponsibleDoctorCrm() {
        return responsibleDoctorCrm;
    }

    public void setResponsibleDoctorCrm(String responsibleDoctorCrm) {
        this.responsibleDoctorCrm = responsibleDoctorCrm;
    }

    public String getCoordinatingDoctorName() {
        return coordinatingDoctorName;
    }

    public void setCoordinatingDoctorName(String coordinatingDoctorName) {
        this.coordinatingDoctorName = coordinatingDoctorName;
    }

    public String getCoordinatingDoctorCrm() {
        return coordinatingDoctorCrm;
    }

    public void setCoordinatingDoctorCrm(String coordinatingDoctorCrm) {
        this.coordinatingDoctorCrm = coordinatingDoctorCrm;
    }

    public String getOccupationalRisks() {
        return occupationalRisks;
    }

    public void setOccupationalRisks(String occupationalRisks) {
        this.occupationalRisks = occupationalRisks;
    }

    public String getFinalJudgment() {
        return finalJudgment;
    }

    public void setFinalJudgment(String finalJudgment) {
        this.finalJudgment = finalJudgment;
    }

    public LocalDate getDoctorSignatureDate() {
        return doctorSignatureDate;
    }

    public void setDoctorSignatureDate(LocalDate doctorSignatureDate) {
        this.doctorSignatureDate = doctorSignatureDate;
    }


//-----------------//
    public static AsoDTO fromEntity(Aso aso){
        return new AsoDTO(
                aso.getHealthHistory(),
                aso.getMedicalProcesses(),
                aso.getSupplementaryExamsDate(),
                aso.getResponsibleDoctorName(),
                aso.getResponsibleDoctorCrm(),
                aso.getCoordinatingDoctorName(),
                aso.getCoordinatingDoctorCrm(),
                aso.getOccupationalRisks(),
                aso.getFinalJudgment(),
                aso.getDoctorSignatureDate()
                );
    }

    public static List<AsoDTO> fromEntityList(List<Aso> asos){
        List<AsoDTO> asoDTOList = new ArrayList<>();
        for (Aso aso : asos) {
            asoDTOList.add(fromEntity(aso));
        }
        return asoDTOList;
    }

    public Aso toEntity() {
        Aso aso = new Aso();
            aso.setHealthHistory(this.healthHistory);
            aso.setMedicalProcesses(this.medicalProcesses);
            aso.setSupplementaryExamsDate(this.supplementaryExamsDate);
            aso.setResponsibleDoctorName(this.responsibleDoctorName);
            aso.setResponsibleDoctorCrm(this.responsibleDoctorCrm);
            aso.setCoordinatingDoctorName(this.coordinatingDoctorName);
            aso.setCoordinatingDoctorCrm(this.coordinatingDoctorCrm);
            aso.setOccupationalRisks(this.occupationalRisks);
            aso.setFinalJudgment(this.finalJudgment);
            aso.setDoctorSignatureDate(this.doctorSignatureDate);
        return aso;
    }

    public static List<Aso> toEntityList(List<AsoDTO> asoDTOs) {
        List<Aso> asos = new ArrayList<>();
        for (AsoDTO asoDTO : asoDTOs) {
            asos.add(asoDTO.toEntity());
        }
        return asos;
    }
}