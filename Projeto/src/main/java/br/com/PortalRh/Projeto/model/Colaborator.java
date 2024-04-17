package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enuns.ModalidadeContratual;
import br.com.PortalRh.Projeto.model.enuns.Turno;

public class Colaborator extends Pessoa{
    private double salary;
    private String pisPasepRegistration;
    private String professionalRegistration; // verificar
    private String union;
    private String position;
    private String fieldOfWork;
    private int workingHours;
    private ModalidadeContratual modalidadeContratual;
    private Turno turno;

    public Colaborator() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPisPasepRegistration() {
        return pisPasepRegistration;
    }

    public void setPisPasepRegistration(String pisPasepRegistration) {
        this.pisPasepRegistration = pisPasepRegistration;
    }

    public String getProfessionalRegistration() {
        return professionalRegistration;
    }

    public void setProfessionalRegistration(String professionalRegistration) {
        this.professionalRegistration = professionalRegistration;
    }

    public String getUnion() {
        return union;
    }

    public void setUnion(String union) {
        this.union = union;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFieldOfWork() {
        return fieldOfWork;
    }

    public void setFieldOfWork(String fieldOfWork) {
        this.fieldOfWork = fieldOfWork;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
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
        return "Colaborator{" +
                "salary=" + salary +
                ", pisPasepRegistration='" + pisPasepRegistration + '\'' +
                ", professionalRegistration='" + professionalRegistration + '\'' +
                ", union='" + union + '\'' +
                ", position='" + position + '\'' +
                ", fieldOfWork='" + fieldOfWork + '\'' +
                ", workingHours=" + workingHours +
                ", modalidadeContratual=" + modalidadeContratual +
                ", turno=" + turno +
                '}';
    }
}