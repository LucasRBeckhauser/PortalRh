package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enuns.ModalidadeContratual;
import br.com.PortalRh.Projeto.model.enuns.Turno;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Colaborador extends Pessoa{
    @Column(name = "salario")
    private double salario;
    @Column(name = "pis_pasep")
    private String pisPasep;
    @Column(name = "cargo")
    private Cargo cargo;
    @Column(name = "modalidade_contratual")
    private ModalidadeContratual modalidadeContratual;
    @Column(name = "turno")
    private Turno turno;

    public Colaborador() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPisPasep() {
        return pisPasep;
    }

    public void setPisPasep(String pisPasep) {
        this.pisPasep = pisPasep;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public ModalidadeContratual getModalidadeContratual() {
        return modalidadeContratual;
    }

    public void setModalidadeContratual(ModalidadeContratual modalidadeContratual) {
        this.modalidadeContratual = modalidadeContratual;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "salario=" + salario +
                ", pisPasep='" + pisPasep + '\'' +
                ", cargo=" + cargo +
                ", modalidadeContratual=" + modalidadeContratual +
                ", turno=" + turno +
                '}';
    }
}