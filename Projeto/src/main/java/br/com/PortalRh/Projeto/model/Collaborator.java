package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enums.ContractModality;
import br.com.PortalRh.Projeto.model.enums.Shift;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "collaborators")
public class Collaborator extends EntityId {
    @Column(name = "wage", nullable = false)
    private double wage;
    
    @Column(name = "pis_pasep", nullable = false)
    private String pisPasep;

    @Column(name = "contract_modality", nullable = false)
    private ContractModality contractModality;

    @Column(name = "shift", nullable = false)
    private Shift shift;

    @OneToOne(mappedBy = "collaborator", cascade = CascadeType.ALL)
    private Person person;

    @OneToOne
    @JoinColumn(name = "job_position_id", nullable = false)
    private JobPosition jobPosition;

    @OneToOne
    @JoinColumn(name = "admission_id", nullable = false)
    private Admission admission;

    @OneToOne
    @JoinColumn(name = "demission_id", nullable = false)
    private Demission demission;

    public Collaborator() {}

    public Collaborator(double wage, String pisPasep, ContractModality contractModality, Shift shift, JobPosition jobPosition, Admission admission, Demission demission) {
        this.wage = wage;
        this.pisPasep = pisPasep;
        this.contractModality = contractModality;
        this.shift = shift;
        this.jobPosition = jobPosition;
        this.admission = admission;
        this.demission = demission;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getPisPasep() {
        return pisPasep;
    }

    public void setPisPasep(String pisPasep) {
        this.pisPasep = pisPasep;
    }

    public ContractModality getContractModality() {
        return contractModality;
    }

    public void setContractModality(ContractModality contractModality) {
        this.contractModality = contractModality;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public Admission getAdmission() {
        return admission;
    }

    public void setAdmission(Admission admission) {
        this.admission = admission;
    }

    public Demission getDemission() {
        return demission;
    }

    public void setDemission(Demission demission) {
        this.demission = demission;
    }

    @Override
    public String toString() {
        return "Collaborator [wage=" + wage + ", pisPasep=" + pisPasep + ", contractModelity=" + contractModality
                + ", shift=" + shift + ", person=" + person + ", jobPosition=" + jobPosition + ", admission="
                + admission + ", demission=" + demission + "]";
    }    
}