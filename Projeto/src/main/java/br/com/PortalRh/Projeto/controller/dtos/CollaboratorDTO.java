package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Admission;
import br.com.PortalRh.Projeto.model.Demission;
import br.com.PortalRh.Projeto.model.JobPosition;
import br.com.PortalRh.Projeto.model.enums.ContractModality;
import br.com.PortalRh.Projeto.model.enums.Shift;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class CollaboratorDTO {
        double wage;
        String pisPasep;
        ContractModality contractModality;
        Shift shift;
        JobPosition jobPosition;
        Admission admission;
        Demission demission;

//constructors:
        public CollaboratorDTO() {
        }

        public CollaboratorDTO(double wage, String pisPasep, ContractModality contractModality, Shift shift, JobPosition jobPosition, Admission admission, Demission demission) {
                this.wage = wage;
                this.pisPasep = pisPasep;
                this.contractModality = contractModality;
                this.shift = shift;
                this.jobPosition = jobPosition;
                this.admission = admission;
                this.demission = demission;
        }

//Getters and Setters:


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
}


//        (
//        @NotNull(message = "A remuneração não pode ser nula")
//        double wage,
//        @NotNull(message = "Pis é campo obrigatório")
//        String pisPasep,
//
//        @Valid @NotNull(message = "O contrato não pode ser nulo")
//        ContractModality contractModality,
//        @Valid @NotNull(message = "O turno não pode ser nulo")
//        Shift shift,
//        @Valid @NotNull(message = "O cargo não pode ser nulo")
//        JobPosition jobPosition,
//        @Valid @NotNull(message = "A admissão não pode ser nula")
//        Admission admission,
//        @Valid @NotNull(message = "A demissão não pode ser nula")
//        Demission demission
//) {}