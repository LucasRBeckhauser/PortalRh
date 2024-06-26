package br.com.PortalRh.Projeto.entities;

import br.com.PortalRh.Projeto.entities.enuns.JobType;
import jakarta.persistence.*;


@Entity
@Table(name = "job_position")
public class JobPosition extends EntityId {
    @Column (name = "description")
    private String description;
    @Column(name = "level")
    private String level;
    @Column (name = "comission")
    private Boolean commission;
    @Column (name = "position_Type")
    @Enumerated(EnumType.STRING)
    private JobType positionType;

    public JobPosition() {
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
        return "Position{" +
                "description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", commission=" + commission +
                ", positionType=" + positionType +
                '}';
    }
}
