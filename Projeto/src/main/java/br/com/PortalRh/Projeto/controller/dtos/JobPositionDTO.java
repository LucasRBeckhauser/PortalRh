package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.enums.JobType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class JobPositionDTO{
    @NotBlank(message = "A descrição da posição não pode estar em branco")
    String description;
    @NotBlank(message = "O nível da posição não pode estar em branco")
    String level;
    @NotNull(message = "O campo de comissão não pode ser nulo")
    Boolean commission;
    @NotNull(message = "O tipo da posição não pode ser nulo")
    JobType positionType;
    @Valid @NotNull(message = "O colaborador não pode ser nulo")
    CollaboratorDTO collaborator;

//Constructors:
    public JobPositionDTO() {
    }

    public JobPositionDTO(String description, String level, Boolean commission, JobType positionType, CollaboratorDTO collaborator) {
        this.description = description;
        this.level = level;
        this.commission = commission;
        this.positionType = positionType;
        this.collaborator = collaborator;
    }

//Getters and Setters:
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Boolean getCommission() {
        return commission;
    }

    public void setCommission(Boolean commission) {
        this.commission = commission;
    }

    public JobType getPositionType() {
        return positionType;
    }

    public void setPositionType(JobType positionType) {
        this.positionType = positionType;
    }

    public CollaboratorDTO getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(CollaboratorDTO collaborator) {
        this.collaborator = collaborator;
    }

//To string:

    @Override
    public String toString() {
        return "JobPositionDTO{" +
                "description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", commission=" + commission +
                ", positionType=" + positionType +
                ", collaborator=" + collaborator +
                '}';
    }
}









//        (
//    @NotBlank(message = "A descrição da posição não pode estar em branco")
//    String description,
//
//    @NotBlank(message = "O nível da posição não pode estar em branco")
//    String level,
//
//    @NotNull(message = "O campo de comissão não pode ser nulo")
//    Boolean commission,
//
//    @NotNull(message = "O tipo da posição não pode ser nulo")
//    JobType positionType,
//
//    @Valid @NotNull(message = "O colaborador não pode ser nulo")
//    CollaboratorDTO collaborator
//) {}