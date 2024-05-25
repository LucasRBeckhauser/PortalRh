package br.com.PortalRh.Projeto.dto;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class AsoDto {

    private String healthHist;
    private String medicalProcess;
    private LocalDate examsDate;
    private String inChargeDocName;
    private String inChargeDocCrm;
    private String coordDocName;
    private String coordDocCrm;
    private String occupRysc;
    private String finalJudg;
    private LocalDate docAssignDate;

    public AsoDto() {
    }

    public AsoDto(String healthHist, String medicalProcess, LocalDate examsDate, String inChargeDocName, String inChargeDocCrm, String coordDocName, String coordDocCrm, String occupRysc, String finalJudg, LocalDate docAssignDate) {
        this.healthHist = healthHist;
        this.medicalProcess = medicalProcess;
        this.examsDate = examsDate;
        this.inChargeDocName = inChargeDocName;
        this.inChargeDocCrm = inChargeDocCrm;
        this.coordDocName = coordDocName;
        this.coordDocCrm = coordDocCrm;
        this.occupRysc = occupRysc;
        this.finalJudg = finalJudg;
        this.docAssignDate = docAssignDate;
    }

    public String getHealthHist() {
        return healthHist;
    }

    public void setHealthHist(String healthHist) {
        this.healthHist = healthHist;
    }

    public String getMedicalProcess() {
        return medicalProcess;
    }

    public void setMedicalProcess(String medicalProcess) {
        this.medicalProcess = medicalProcess;
    }

    public LocalDate getExamsDate() {
        return examsDate;
    }

    public void setExamsDate(LocalDate examsDate) {
        this.examsDate = examsDate;
    }

    public String getInChargeDocName() {
        return inChargeDocName;
    }

    public void setInChargeDocName(String inChargeDocName) {
        this.inChargeDocName = inChargeDocName;
    }

    public String getInChargeDocCrm() {
        return inChargeDocCrm;
    }

    public void setInChargeDocCrm(String inChargeDocCrm) {
        this.inChargeDocCrm = inChargeDocCrm;
    }

    public String getCoordDocName() {
        return coordDocName;
    }

    public void setCoordDocName(String coordDocName) {
        this.coordDocName = coordDocName;
    }

    public String getCoordDocCrm() {
        return coordDocCrm;
    }

    public void setCoordDocCrm(String coordDocCrm) {
        this.coordDocCrm = coordDocCrm;
    }

    public String getOccupRysc() {
        return occupRysc;
    }

    public void setOccupRysc(String occupRysc) {
        this.occupRysc = occupRysc;
    }

    public String getFinalJudg() {
        return finalJudg;
    }

    public void setFinalJudg(String finalJudg) {
        this.finalJudg = finalJudg;
    }

    public LocalDate getDocAssignDate() {
        return docAssignDate;
    }

    public void setDocAssignDate(LocalDate docAssignDate) {
        this.docAssignDate = docAssignDate;
    }

}
