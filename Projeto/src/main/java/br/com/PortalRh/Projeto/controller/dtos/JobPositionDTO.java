package br.com.PortalRh.Projeto.controller.dtos;


import br.com.PortalRh.Projeto.model.JobPosition;
import br.com.PortalRh.Projeto.model.enums.JobType;

import java.util.ArrayList;
import java.util.List;

public class JobPositionDTO{

    String description;
    

    String level;
    

    Boolean commission;
    

    JobType positionType;

    public JobPositionDTO() {}

    public JobPositionDTO(String description, String level, Boolean commission, JobType positionType) {
        this.description = description;
        this.level = level;
        this.commission = commission;
        this.positionType = positionType;
    }

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

    public static JobPositionDTO fromEntity(JobPosition jobPosition) {
        return new JobPositionDTO(
                jobPosition.getDescription(),
                jobPosition.getLevel(),
                jobPosition.getCommission(),
                jobPosition.getPositionType()
        );
    }

    public static List<JobPositionDTO> fromEntityList(List<JobPosition> jobPositions){
        List<JobPositionDTO> jobPositionDTOList = new ArrayList<>();
        for (JobPosition jobPosition : jobPositions) {
            jobPositionDTOList.add(fromEntity(jobPosition));
        }
        return jobPositionDTOList;
    }

    public JobPosition toEntity() {
        JobPosition jobPosition = new JobPosition();
        jobPosition.setPositionType(this.positionType);
        jobPosition.setCommission(this.commission);
        jobPosition.setLevel(this.level);
        jobPosition.setDescription(this.description);
        return jobPosition;
    }

    public static List<JobPosition> toEntityList(List<JobPositionDTO> jobPositionDTOS) {
        List<JobPosition> jobPositions = new ArrayList<>();
        for (JobPositionDTO jobPositionDTO : jobPositionDTOS) {
            jobPositions.add(jobPositionDTO.toEntity());
        }
        return jobPositions;
    }

}