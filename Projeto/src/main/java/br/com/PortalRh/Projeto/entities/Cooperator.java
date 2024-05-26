package br.com.PortalRh.Projeto.entities;

import br.com.PortalRh.Projeto.entities.enuns.ContractModality;
import br.com.PortalRh.Projeto.entities.enuns.Shift;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Cooperator extends Person {
    @Column(name = "salario")
    private double wage;
    @Column(name = "pis_pasep")
    private String pisPasep;
    @ManyToOne
    private JobPosition jobPosition;
    @Column(name = "modalidade_contratual")
    private ContractModality contractModel;
    @Column(name = "turno")
    private Shift shift;

    public Cooperator() {
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

    public JobPosition getPosition() {
        return jobPosition;
    }

    public void setPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public ContractModality getContractModel() {
        return contractModel;
    }

    public void setContractModel(ContractModality contractModel) {
        this.contractModel = contractModel;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Cooperator{" +
                "wage=" + wage +
                ", pisPasep='" + pisPasep +
        ", position=" + jobPosition +
                ", contractModel=" + contractModel +
                ", shift=" + shift +
                '}';
    }
}