package br.com.PortalRh.Projeto.model;

public class Colaborator extends Person{
    private double salary;
    private String pisPasepRegistration;
    private String professionalRegistration; // verificar
    private String union;
    private String position;
    private String fieldOfWork;
    private int workingHours;
    private ContractType contractType;
    private WorkShift workShift;

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

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public WorkShift getWorkShift() {
        return workShift;
    }

    public void setWorkShift(WorkShift workShift) {
        this.workShift = workShift;
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
                ", contractType=" + contractType +
                ", workShift=" + workShift +
                '}';
    }
}