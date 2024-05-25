package br.com.PortalRh.Projeto.dto;

import br.com.PortalRh.Projeto.entities.enuns.JobType;

public class PositionDTO {
    private String description;
    private String level;
    private Boolean commission;
    private JobType positionType;

    public PositionDTO() {
    }

    public PositionDTO(String description, String level, Boolean commission, JobType positionType) {
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

    @Override
    public String toString() {
        return "PositionDTO{" +
                "description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", commission=" + commission +
                ", positionType=" + positionType +
                '}';
    }
}
