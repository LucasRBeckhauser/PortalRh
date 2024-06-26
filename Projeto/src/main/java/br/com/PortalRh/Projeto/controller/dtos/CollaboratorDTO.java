package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.*;
import br.com.PortalRh.Projeto.model.enums.ContractModality;
import br.com.PortalRh.Projeto.model.enums.Shift;


import java.util.ArrayList;
import java.util.List;

public class CollaboratorDTO{

        double wage;

        String pisPasep;

        ContractModality contractModality;

        Shift shift;

        JobPosition jobPosition;

        Admission admission;

        Demission demission;

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

        public static CollaboratorDTO fromEntity(Collaborator collaborator) {
                return new CollaboratorDTO(
                        collaborator.getWage(),
                        collaborator.getPisPasep(),
                        collaborator.getContractModality(),
                        collaborator.getShift(),
                        collaborator.getJobPosition(),
                        collaborator.getAdmission(),
                        collaborator.getDemission()
                );

        }

        public static List<CollaboratorDTO> fromEntityList(List<Collaborator> collaborators){
                List<CollaboratorDTO> collaboratorDTOList = new ArrayList<>();
                for (Collaborator collaborator : collaborators) {
                        collaboratorDTOList.add(fromEntity(collaborator));
                }
                return collaboratorDTOList;
        }

        public Collaborator toEntity() {
                Collaborator collaborator = new Collaborator();
                collaborator.setWage(this.wage);
                collaborator.setPisPasep(this.pisPasep);
                collaborator.setContractModality(this.contractModality);
                collaborator.setShift(this.shift);
                collaborator.setJobPosition(this.jobPosition);
                collaborator.setAdmission(this.admission);
                collaborator.setDemission(this.demission);
                return collaborator;
        }

        public static List<Collaborator> toEntityList(List<CollaboratorDTO> collaboratorDTOS) {
                List<Collaborator> collaborators = new ArrayList<>();
                for (CollaboratorDTO collaboratorDTO : collaboratorDTOS) {
                        collaborators.add(collaboratorDTO.toEntity());
                }
                return collaborators;
        }
}