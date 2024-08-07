package br.com.PortalRh.Projeto.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "aso")
public class Aso extends EntityId {
    @Column(name = "health_history", nullable = false)
    private String healthHistory;

    @Column(name = "medical_processes", nullable = false)
    private String medicalProcesses;

    @Column(name = "supplementary_exams_date", nullable = false)
    private LocalDate supplementaryExamsDate;

    @Column(name = "responsible_doctor_name", nullable = false)
    private String responsibleDoctorName;

    @Column(name = "responsible_doctor_crm", nullable = false)
    private String responsibleDoctorCrm;

    @Column(name = "coordinating_doctor_name", nullable = false)
    private String coordinatingDoctorName;

    @Column(name = "coordinating_doctor_crm", nullable = false)
    private String coordinatingDoctorCrm;

    @Column(name = "occupational_risks", nullable = false)
    private String occupationalRisks;

    @Column(name = "final_judgment", nullable = false)
    private String finalJudgment;

    @Column(name = "doctor_signature_date", nullable = false)
    private LocalDate doctorSignatureDate;

    @OneToOne(mappedBy = "aso", cascade = CascadeType.ALL)
    private Admission admission;

    public Aso() {}

    public Aso(String healthHistory, String medicalProcesses, LocalDate supplementaryExamsDate, String responsibleDoctorName,
               String responsibleDoctorCrm, String coordinatingDoctorName, String coordinatingDoctorCrm, String occupationalRisks,
               String finalJudgment, LocalDate doctorSignatureDate) {
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

    public Admission getAdmission() {
        return admission;
    }

    public void setAdmission(Admission admission) {
        this.admission = admission;
    }

    @Override
    public String toString() {
        return "Aso [healthHistory=" + healthHistory + ", medicalProcesses=" + medicalProcesses
                + ", supplementaryExamsDate=" + supplementaryExamsDate + ", responsibleDoctorName="
                + responsibleDoctorName + ", responsibleDoctorCrm=" + responsibleDoctorCrm + ", coordinatingDoctorName="
                + coordinatingDoctorName + ", coordinatingDoctorCrm=" + coordinatingDoctorCrm + ", occupationalRisks="
                + occupationalRisks + ", finalJudgment=" + finalJudgment + ", doctorSignatureDate="
                + doctorSignatureDate + ", admission=" + admission + "]";
    }
}
