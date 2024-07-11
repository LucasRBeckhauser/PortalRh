package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enums.JobType;
import jakarta.persistence.*;


@Entity
@Table(name = "job_position")
public class JobPosition extends EntityId {
    @Column (name = "description", nullable = false)
    private String description;

    @Column(name = "level", nullable = false)
    private String level;

    @Column (name = "comission", nullable = false)
    private Boolean commission;

    @Enumerated(EnumType.STRING)
    private JobType positionType;

    @OneToOne(mappedBy = "jobPosition", cascade = CascadeType.ALL)
    private Collaborator collaborator;

    public JobPosition() {}

    public JobPosition(String description, String level, Boolean commission, JobType positionType) {
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
