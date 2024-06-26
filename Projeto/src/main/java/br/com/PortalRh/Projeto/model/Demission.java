package br.com.PortalRh.Projeto.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "demissions")
public class Demission extends EntityId{
    @CreationTimestamp
    @Column(name = "demission_date", nullable = false)
    private LocalDate demissionDate;

    @Column (name = "reason_demission", nullable = false)
    private String reasonDemission;

    @OneToOne(mappedBy = "demission", cascade = CascadeType.ALL)
    private Collaborator collaborator;

    public Demission() {
    }

    public Demission(LocalDate demissionDate, String reasonDemission) {
        this.demissionDate = demissionDate;
        this.reasonDemission = reasonDemission;
    }

    public LocalDate getDemissionDate() {
        return demissionDate;
    }

    public void setDemissionDate(LocalDate demissionDate) {
        this.demissionDate = demissionDate;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public String getReasonDemission() {
        return reasonDemission;
    }

    public void setReasonDemission(String reasonDemission) {
        this.reasonDemission = reasonDemission;
    }

    @Override
    public String toString() {
        return "Demission [demissionDate=" + demissionDate + ", collaborator=" + collaborator + "]";
    }
}
