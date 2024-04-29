package br.com.PortalRh.Projeto.entities;

import br.com.PortalRh.Projeto.entities.enuns.ModalidadeContratual;
import br.com.PortalRh.Projeto.entities.enuns.Turno;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Cooperator extends Person {
    @Column(name = "salario")
    private double wage;
    @Column(name = "pis_pasep")
    private String pisPasep;
    @Column(name = "cargo")
    private Position position;
    @Column(name = "modalidade_contratual")
    private ModalidadeContratual contractModel;
    @Column(name = "turno")
    private Turno shift;

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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ModalidadeContratual getContractModel() {
        return contractModel;
    }

    public void setContractModel(ModalidadeContratual contractModel) {
        this.contractModel = contractModel;
    }

    public Turno getShift() {
        return shift;
    }

    public void setShift(Turno shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Cooperator{" +
                "wage=" + wage +
                ", pisPasep='" + pisPasep + '\'' +
                ", position=" + position +
                ", contractModel=" + contractModel +
                ", shift=" + shift +
                '}';
    }
}