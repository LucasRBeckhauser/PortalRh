package br.com.PortalRh.Projeto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Aso extends EntityId{
    @Column(name = "historico_saude")
    private String healthHist;
    @Column(name = "processos_medicos")
    private String medicalProcess;
    @Column(name = "data_exames_complementares")
    private LocalDate examsDate;
    @Column(name = "medico_encarregado")
    private String inChargeDocName;
    @Column(name = "crm_medico_encarregado")
    private String inChargeDocCrm;
    @Column(name = "medico_coordenador")
    private String coordDocName;
    @Column(name = "crm_medico_coordenador")
    private String coordDocCrm;
    @Column(name = "riscos_ocupacionais")
    private String occupRysc;
    @Column(name = "julgamento_final")
    private String finalJudg;
    @Column(name = "data_assinatura_medico")
    private LocalDate docAssignDate;

    public Aso() {
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

    @Override
    public String toString() {
        return "Aso{" +
                "healthHist='" + healthHist + '\'' +
                ", medicalProcess='" + medicalProcess + '\'' +
                ", examsDate=" + examsDate +
                ", inChargeDocName='" + inChargeDocName + '\'' +
                ", inChargeDocCrm='" + inChargeDocCrm + '\'' +
                ", coordDocName='" + coordDocName + '\'' +
                ", coordDocCrm='" + coordDocCrm + '\'' +
                ", occupRysc='" + occupRysc + '\'' +
                ", finalJudg='" + finalJudg + '\'' +
                ", docAssignDate=" + docAssignDate +
                '}';
    }
}
