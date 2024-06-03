package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enums.ContractModality;
import br.com.PortalRh.Projeto.model.enums.Shift;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "collaborators")
public class Collaborator extends EntityId {
    @Column(name = "wage")
    private double wage;
    
    @Column(name = "pis_pasep")
    private String pisPasep;

    @Column(name = "contract_modality")
    private ContractModality contractModelity;

    @Column(name = "shift")
    private Shift shift;

    @OneToOne(mappedBy = "collaborator", cascade = CascadeType.ALL)
    private Person person;

    @OneToOne(mappedBy = "collaborator", cascade = CascadeType.ALL)
    private JobPosition jobPosition;

    @OneToOne(mappedBy = "collaborator", cascade = CascadeType.ALL)
    private Admission admission;

    @OneToOne(mappedBy = "collaborator", cascade = CascadeType.ALL)
    private Demission demission;

    public Collaborator() {}

    public Collaborator(double wage, String pisPasep, ContractModality contractModelity, Shift shift, Person person, JobPosition jobPosition, Admission admission, Demission demission) {
        this.wage = wage;
        this.pisPasep = pisPasep;
        this.contractModelity = contractModelity;
        this.shift = shift;
        this.person = person;
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

    public ContractModality getContractModelity() {
        return contractModelity;
    }

    public void setContractModelity(ContractModality contractModelity) {
        this.contractModelity = contractModelity;
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
        return "Collaborator [wage=" + wage + ", pisPasep=" + pisPasep + ", contractModelity=" + contractModelity
                + ", shift=" + shift + ", person=" + person + ", jobPosition=" + jobPosition + ", admission="
                + admission + ", demission=" + demission + "]";
    }    
}