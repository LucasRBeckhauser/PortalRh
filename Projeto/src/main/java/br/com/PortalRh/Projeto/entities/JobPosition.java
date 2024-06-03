package br.com.PortalRh.Projeto.entities;

import br.com.PortalRh.Projeto.entities.enums.JobType;
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

    @Enumerated(EnumType.STRING)
    private JobType positionType;

    @OneToOne
    @JoinColumn(name = "position_type_id")
    private Collaborator collaborator;

    public JobPosition() {}

    public JobPosition(String description, String level, Boolean commission, JobType positionType, Collaborator collaborator) {
        this.description = description;
        this.level = level;
        this.commission = commission;
        this.positionType = positionType;
        this.collaborator = collaborator;
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
    
    public Collaborator getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    @Override
    public String toString() {
        return "JobPosition [description=" + description + ", level=" + level + ", commission=" + commission
                + ", positionType=" + positionType + ", collaborator=" + collaborator + "]";
    }
}
